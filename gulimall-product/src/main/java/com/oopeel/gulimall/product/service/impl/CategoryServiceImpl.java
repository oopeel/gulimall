package com.oopeel.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oopeel.common.utils.PageUtils;
import com.oopeel.common.utils.Query;
import com.oopeel.gulimall.product.dao.CategoryDao;
import com.oopeel.gulimall.product.entity.CategoryEntity;
import com.oopeel.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


/**
 *
 * @author oopeel
 * @date 2023/7/5 20:10
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(new Query<CategoryEntity>().getPage(params), new QueryWrapper<CategoryEntity>());

        return new PageUtils(page);
    }

    /**
     * 查出所有分类,并组装成父子的树形结构
     * @return java.util.List<com.oopeel.gulimall.product.entity.CategoryEntity>
     * @author oopeel
     * @date 2023/7/5 16:23
     */
    @Override
    public List<CategoryEntity> listWithTree() {

        // 参数为null,查询所有
        List<CategoryEntity> entites = baseMapper.selectList(null);
        // 组装成父子结构的树形结构
        // 找到所有的一级分类
        List<CategoryEntity> level1Menus = entites.stream().filter(catelogEntity -> catelogEntity.getParentCid() == 0).map(menu -> {
            menu.setChildren(getChildrens(menu, entites));
            return menu;
        }).sorted(Comparator.comparingInt(menu -> (Objects.isNull(menu.getSort()) ? 0 : menu.getSort()))).collect(Collectors.toList());

        return level1Menus;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map(categoryEntity -> {
            // 找到子菜单(递归)
            categoryEntity.setChildren(getChildrens(categoryEntity, all));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            // 菜单排序
            return Objects.isNull(menu1.getSort()) ? 0 : menu1.getSort() - (Objects.isNull(menu2.getSort()) ? 0 : menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}

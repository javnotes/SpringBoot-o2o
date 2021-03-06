package cn.vuffy.o2o.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import cn.vuffy.o2o.entity.ShopCategory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author vuffy
 * @version 1.0
 * @description: TODO
 * @date 2021/5/23 2:48 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ShopCategoryDaoTest {

    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Test
    public void testQueryShopCategory() {
        List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(new ShopCategory());
        System.out.println(shopCategoryList.toString());
        assertEquals(2, shopCategoryList.size());

        ShopCategory shopCategory = new ShopCategory();
        ShopCategory parentShopCategory = new ShopCategory();
        parentShopCategory.setShopCategoryId(1L);
        shopCategory.setParent(parentShopCategory);
        shopCategoryList = shopCategoryDao.queryShopCategory(shopCategory);
        assertEquals(2, shopCategoryList.size());
        System.out.println(shopCategoryList.get(0).getShopCategoryName());
        System.out.println(shopCategoryList.get(1).getShopCategoryName());
    }

    @Test
    // 可测试查询店铺的一级类别
    public void testQueryShopCategory2() {
        List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(null);
        System.out.println(shopCategoryList.toString());
        System.out.println(shopCategoryList.size());
        assertEquals(2, shopCategoryList.size());

//    ShopCategory shopCategory = new ShopCategory();
//    ShopCategory parentShopCategory = new ShopCategory();
//    parentShopCategory.setShopCategoryId(1L);
//    shopCategory.setParent(parentShopCategory);
//    shopCategoryList = shopCategoryDao.queryShopCategory(shopCategory);
//    assertEquals(2, shopCategoryList.size());
//    System.out.println(shopCategoryList.get(0).getShopCategoryName());
//    System.out.println(shopCategoryList.get(1).getShopCategoryName());
    }
}

package cn.vuffy.o2o.dao;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import cn.vuffy.o2o.entity.ProductImg;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author vuffy
 * @version 1.0
 * @description: TODO
 * @date 2021/6/15 1:37 下午
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductImgDaoTest {

    @Autowired
    private ProductImgDao productImgDao;


    @Test
    public void testABatchInsertProductImg() throws Exception {
        // 向 productId = 2 的商品中，添加两个详情图片的记录
        ProductImg productImg1 = new ProductImg();
        productImg1.setImgAddr("图片1");
        productImg1.setImgDesc("图片1的描述");
        productImg1.setPriority(1);
        productImg1.setCreateTime(new Date());
        productImg1.setProductId(2L);

        ProductImg productImg2 = new ProductImg();
        productImg2.setImgAddr("图片2");
        productImg2.setImgDesc("图片2的描述");
        productImg2.setPriority(2);
        productImg2.setCreateTime(new Date());
        productImg2.setProductId(2L);

        List<ProductImg> productImgList = new ArrayList<>();
        productImgList.add(productImg1);
        productImgList.add(productImg2);

        int effectedNum = productImgDao.batchInsertProductImg(productImgList);
        assertEquals(2, effectedNum);
    }


    @Test
    public void testCDeleteProductImgByProductId() throws Exception {
        // 删除新增的两条商品详情图片
        long productId = 2;
        int effectedNum = productImgDao.deleteProductImgByProductId(productId);
        assertEquals(2, effectedNum);
    }
}

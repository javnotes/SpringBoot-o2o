package cn.vuffy.o2o.dao;

import cn.vuffy.o2o.entity.ProductSellDaily;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author vuffy
 * @create 2021-07-23 15:51
 */
public interface ProductSellDailyDao {

    /**
     * 根据查询条件，返回商品日销量的统计数列表
     *
     * @param productSellDailyCondition
     * @param beginTime
     * @param endTime
     * @return
     */
    List<ProductSellDaily> queryProductSellDailyList(@Param("productSellDailyCondition") ProductSellDaily productSellDailyCondition,
                                                     @Param("beginTime") Date beginTime, @Param("endTime") Date endTime);

    /**
     * 每个店铺中每件商品的日销量
     *
     * @return
     */
    int insertProductSellDaily();
}

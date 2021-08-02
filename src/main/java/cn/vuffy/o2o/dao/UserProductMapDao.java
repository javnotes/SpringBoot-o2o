package cn.vuffy.o2o.dao;

import cn.vuffy.o2o.entity.UserProductMap;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author vuffy
 * @create 2021-07-23 14:43
 */
public interface UserProductMapDao {

    /**
     * 根据查询条件，分页返回用户购买商品的记录列表
     *
     * @param userProductMapCondition
     * @param rowIndex
     * @param pageSize
     * @return
     */
    List<UserProductMap> queryUserProductMapList(@Param("userProductCondition") UserProductMap userProductMapCondition,
                                                 @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);


    /**
     * 配合 queryUserProductMapList，返回相同条件下的记录总个数
     *
     * @param userProductCondition
     * @return
     */
    int queryUserProductMapCount(@Param("userProductCondition") UserProductMap userProductCondition);

    /**
     * 添加一条用户购买商品的记录信息
     *
     * @param userProductMap
     * @return
     */
    int insertUserProductMap(UserProductMap userProductMap);
}

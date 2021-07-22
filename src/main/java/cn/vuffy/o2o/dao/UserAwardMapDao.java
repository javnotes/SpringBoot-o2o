package cn.vuffy.o2o.dao;

import cn.vuffy.o2o.entity.UserAwardMap;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Property;

import java.util.List;

/**
 * @author vuffy
 * @create 2021-07-22 11:02
 */
public interface UserAwardMapDao {

    /**
     * 根据传入进来的查询条件，分页返回用户兑换奖品记录的列表信息
     * @param userAwardCondition
     * @param rowIndex
     * @param pageSize
     * @return
     */
    List<UserAwardMap> queryUserAwardMapList(@Param("userAwardCondition") UserAwardMap userAwardCondition,
                                             @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    /**
     * 根据传入进来的查询条件，分页返回用户兑换奖品记录的列表信息
     * @param userAwardCondition
     * @param rowIndex
     * @param pageSize
     * @return
     */
    List<UserAwardMap> queryReceivedUserAwardMapList(@Param("userAwardCondition") UserAwardMap userAwardCondition,
                                                     @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);


    /**
     * 配合 queryUserAwardMapList，返回相同查询条件下的兑换奖品记录数
     * @param userAwardCondition
     * @return
     */
    int queryUserAwardMapCount(@Param("userAwardCondition") UserAwardMap userAwardCondition);

    /**
     * 根据 userAwardId 返回某奖品的兑换信息
     * @param userAwardId
     * @return
     */
    UserAwardMap queryUserAwardMapById(long userAwardId);

    /**
     * 添加一条奖品兑换信息
     * @param userAwardMap
     * @return
     */
    int insertUserAwardMap(UserAwardMap userAwardMap);

    /**
     * 主要是用来更新奖品的更新状态
     * @param userAwardMap
     * @return
     */
    int updateUserAwardMap(UserAwardMap userAwardMap);
}

package cn.vuffy.o2o.dao;

import cn.vuffy.o2o.entity.Award;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author vuffy
 * @create 2021-07-22 10:08
 */
public interface AwardDao {

    /**
     * 根据传入的查询条件，分页显示奖品信息列表
     * @param awardCondition
     * @param rowIndex
     * @param pageSize
     * @return
     */
    List<Award> queryAwardList(@Param("awardCondition") Award awardCondition, @Param("rowIndex") int rowIndex, @Param("pageSize") int pageSize);

    /**
     * 配合 queryAwardList，返回相同查询条件下的奖品个数
     * @param awardCondition
     * @return
     */
    int queryAwardCount(@Param("awardCondition") Award awardCondition);

    /**
     * 根据 awardId 查询奖品信息
     * @param awardId
     * @return
     */
    Award queryAwardByAwardId(long awardId);

    /**
     * 添加奖品
     * @param award
     * @return
     */
    int insertAward(Award award);

    int updateAward(Award award);

    int deleteAward(@Param("awardId") long awardId, @Param("shopId") long shopId);

}

package com.mybatis.mapper;

import com.mybatis.entity.WxRankingFlow;
import com.mybatis.entity.WxRankingFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WxRankingFlowMapper {
    int countByExample(WxRankingFlowExample example);

    int deleteByExample(WxRankingFlowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxRankingFlow record);

    int insertSelective(WxRankingFlow record);

    List<WxRankingFlow> selectByExampleWithRowbounds(WxRankingFlowExample example, RowBounds rowBounds);

    List<WxRankingFlow> selectByExample(WxRankingFlowExample example);

    WxRankingFlow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxRankingFlow record, @Param("example") WxRankingFlowExample example);

    int updateByExample(@Param("record") WxRankingFlow record, @Param("example") WxRankingFlowExample example);

    int updateByPrimaryKeySelective(WxRankingFlow record);

    int updateByPrimaryKey(WxRankingFlow record);
}
package com.mybatis.mapper;

import com.mybatis.entity.pay_deposit;
import com.mybatis.entity.pay_depositExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface pay_depositMapper {
    int countByExample(pay_depositExample example);

    int deleteByExample(pay_depositExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(pay_deposit record);

    int insertSelective(pay_deposit record);

    List<pay_deposit> selectByExampleWithRowbounds(pay_depositExample example, RowBounds rowBounds);

    List<pay_deposit> selectByExample(pay_depositExample example);

    pay_deposit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") pay_deposit record, @Param("example") pay_depositExample example);

    int updateByExample(@Param("record") pay_deposit record, @Param("example") pay_depositExample example);

    int updateByPrimaryKeySelective(pay_deposit record);

    int updateByPrimaryKey(pay_deposit record);
}
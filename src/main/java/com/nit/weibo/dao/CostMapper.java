package com.nit.weibo.dao;

import com.nit.weibo.model.Cost;
import org.springframework.data.repository.CrudRepository;

public interface CostMapper extends CrudRepository<Cost,Integer>{
    int deleteByPrimaryKey(Integer costId);

    int insert(Cost record);

    int insertSelective(Cost record);

    Cost selectByPrimaryKey(Integer costId);

    int updateByPrimaryKeySelective(Cost record);

    int updateByPrimaryKey(Cost record);
}
package com.nit.weibo.dao;

import java.util.List;

import com.nit.weibo.model.Weibo;
import org.springframework.data.repository.CrudRepository;

public interface WeiboMapper extends CrudRepository<Weibo,Integer>{
    int deleteByPrimaryKey(Integer weiboId);

    int insert(Weibo record);

    int insertSelective(Weibo record);

    Weibo selectByPrimaryKey(Integer weiboId);

    int updateByPrimaryKeySelective(Weibo record);

    int updateByPrimaryKey(Weibo record);

    int updateByUserId(Weibo record);

	Weibo selectByUserId(Integer userId);

	Integer getCount(Integer userId);

	List<Weibo> getDataTable(Integer userId);

	Integer UpdateSelectByUserId(Integer userId);
}
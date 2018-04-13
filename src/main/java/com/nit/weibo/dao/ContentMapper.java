package com.nit.weibo.dao;

import com.nit.weibo.model.Content;
import org.springframework.data.repository.CrudRepository;


public interface ContentMapper extends CrudRepository<Content,Integer>{
    int deleteByPrimaryKey(Integer contentId);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Integer contentId);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKeyWithBLOBs(Content record);

    int updateByPrimaryKey(Content record);

//	List<String> selectList(@Param(value="list") String list);
}
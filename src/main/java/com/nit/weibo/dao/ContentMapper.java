package com.nit.weibo.dao;

import java.util.List;



import com.nit.weibo.model.Content;


public interface ContentMapper {
    int deleteByPrimaryKey(Integer contentId);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Integer contentId);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKeyWithBLOBs(Content record);

    int updateByPrimaryKey(Content record);

//	List<String> selectList(@Param(value="list") String list);
}
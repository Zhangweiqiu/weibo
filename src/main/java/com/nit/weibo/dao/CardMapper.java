package com.nit.weibo.dao;

import com.nit.weibo.model.Card_list;
import org.springframework.data.repository.CrudRepository;


public interface CardMapper extends CrudRepository<Card_list,Long>{
    int deleteByPrimaryKey(Long id);

    int insert(Card_list record);

    int insertSelective(Card_list record);

    Card_list selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Card_list record);

    int updateByPrimaryKey(Card_list record);
}
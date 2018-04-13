package com.nit.weibo.dao;


import com.nit.weibo.model.Bill;
import org.springframework.data.repository.CrudRepository;


public interface BillMapper extends CrudRepository<Bill,Integer>{
    int deleteByPrimaryKey(Integer billId);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Integer billId);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}
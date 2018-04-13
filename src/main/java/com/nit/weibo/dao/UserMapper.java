package com.nit.weibo.dao;

import java.util.List;

import com.nit.weibo.model.User_list;
import com.nit.weibo.model.UserKey;
import org.springframework.data.repository.CrudRepository;

public interface UserMapper extends CrudRepository<User_list,Integer>{
    int deleteByPrimaryKey(UserKey key);

    int insert(User_list record);

    int insertSelective(User_list record);

    User_list selectByPrimaryKey(UserKey key);

    int updateByPrimaryKeySelective(User_list record);

    int updateByPrimaryKey(User_list record);

	Integer getCount();

	Integer getCmoney(Integer userId);

	Integer updateMoney(Integer num,Integer userId);

	Integer getCount2(String search);
	
	Integer getCountY();

	Integer getCount2Y(String search);
	
	Integer getCountN();

	Integer getCount2N(String search);

	List<User_list> getDataTable();

	List<User_list> getDataTable2(String s);
	
	List<User_list> getDataTableY();

	List<User_list> getDataTable2Y(String s);
	
	List<User_list> getDataTableN();

	List<User_list> getDataTable2N(String s);

}
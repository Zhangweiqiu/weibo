package com.nit.weibo.dao;

import java.util.List;

import com.nit.weibo.model.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface AdminMapper extends CrudRepository<Admin,Integer>{

    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
    
    //List<?> selectLogin(String username, String password);
    @Query(value = "select id from admin where LoginName=?1 and LoginPwd=?2")
    List<?> selectLogin(String username, String password);

	AdminLoginDto pro_admin_login(@Param("id")Integer id, @Param("userDevice")String drive, @Param("loginIP")String ipAddress, @Param("sessionId")String sessionId);

}
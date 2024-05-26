package com.sosigae.LuckeyTurkey.dao.mybatis.mapper;

import org.apache.ibatis.annotations.Param;

import com.sosigae.LuckeyTurkey.domain.User;

public interface UserMapper {
	User loginMember(@Param("user_id") String user_id, @Param("password") String password);

    void registerMember(User user);

    void deleteMember(User user);

    void updateMember(User user);

    int isValidUser(String user_id, String password);
    
    User findUserByCode(@Param("personal_code") String personal_code);
    


}

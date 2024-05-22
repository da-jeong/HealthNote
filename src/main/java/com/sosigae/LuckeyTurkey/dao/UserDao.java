package com.sosigae.LuckeyTurkey.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sosigae.LuckeyTurkey.domain.User;

@Repository
@Mapper
public interface UserDao {

    User loginMember(String id, String password);

    void registerMember(User user);

    void deleteMember(User user);

    void updateMember(User user);

    boolean isValidUser(String id, String password);
}

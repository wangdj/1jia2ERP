package cn.ch1jia2.erp.dao;

import cn.ch1jia2.erp.entity.UserEntity;

import java.util.List;

public interface IUserDao {
    public int save(UserEntity u);
    public List<UserEntity> findAll();
}

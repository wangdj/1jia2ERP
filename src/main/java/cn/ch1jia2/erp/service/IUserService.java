package cn.ch1jia2.erp.service;

import cn.ch1jia2.erp.entity.UserEntity;

import java.util.List;

public interface IUserService {
    public void saveUsers(List<UserEntity> us);
    public List<UserEntity> getAllUsers();
}

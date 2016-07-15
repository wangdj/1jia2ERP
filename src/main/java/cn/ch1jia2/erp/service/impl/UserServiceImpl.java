package cn.ch1jia2.erp.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import cn.ch1jia2.erp.dao.IUserDao;
import cn.ch1jia2.erp.entity.UserEntity;
import cn.ch1jia2.erp.service.IUserService;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public void saveUsers(List<UserEntity> us) {
        for (UserEntity u : us) {
            userDao.save(u);
        }
    }

    public List<UserEntity> getAllUsers() {
        return userDao.findAll();
    }

}

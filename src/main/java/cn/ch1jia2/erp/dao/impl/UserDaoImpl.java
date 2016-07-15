package cn.ch1jia2.erp.dao.impl;

import java.util.List;

import cn.ch1jia2.erp.dao.IUserDao;
import cn.ch1jia2.erp.entity.UserEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public int save(UserEntity u) {
        return (Integer) sessionFactory.getCurrentSession().save(u);
    }

    public List<UserEntity> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(UserEntity.class);
        return criteria.list();
    }

}

package cn.ch1jia2.erp.dao.impl;

import cn.ch1jia2.erp.dao.ICustomerDAO;
import cn.ch1jia2.erp.entity.CarEntity;
import cn.ch1jia2.erp.entity.CustomerEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wangdj on 2016/7/6.
 */
@Repository
@Transactional
public class CustomerDAOImpl implements ICustomerDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public CarEntity getDefaultCarByCustomerID(Integer customerid) {
        Session session = sessionFactory.getCurrentSession();
        //取方式2
        DetachedCriteria dc = DetachedCriteria.forClass(CarEntity.class);
        dc.add(Restrictions.eq("ownerid",customerid));
        dc.add(Restrictions.eq("defaultflag","1"));
        Criteria c = dc.getExecutableCriteria(session);
        CarEntity car = null;
        if (c.list().size() != 0){
            car = (CarEntity)c.list().get(0);
        }
        return car;
    }

    public List<CarEntity> getCarsByCustomerID(Integer customerid) {
        Session session = sessionFactory.getCurrentSession();
        //取方式2
        DetachedCriteria dc = DetachedCriteria.forClass(CustomerEntity.class);
        dc.add(Restrictions.eq("customerid",customerid));
        Criteria c = dc.getExecutableCriteria(session);
        CustomerEntity cus = null;
        if (c.list().size() != 0){
            cus = (CustomerEntity)c.list().get(0);
        }
        List<CarEntity> cars = cus.getCars();
        //session.close();
        return cars;
    }
}

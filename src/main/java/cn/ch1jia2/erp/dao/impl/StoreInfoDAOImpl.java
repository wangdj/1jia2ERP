package cn.ch1jia2.erp.dao.impl;

import cn.ch1jia2.erp.dao.IStoreInfoDAO;
import cn.ch1jia2.erp.entity.CarEntity;
import cn.ch1jia2.erp.entity.StoreComboEntity;
import cn.ch1jia2.erp.entity.StoreInfoEntity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wangdj on 2016/7/7.
 */
@Repository
@Transactional
public class StoreInfoDAOImpl implements IStoreInfoDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public List<StoreComboEntity> getCombosBySotreID(String storeid){
        Session session = sessionFactory.getCurrentSession();
        //取方式2
        DetachedCriteria dc = DetachedCriteria.forClass(StoreComboEntity.class);
        dc.add(Restrictions.eq("storeid",storeid));
        Criteria c = dc.getExecutableCriteria(session);
        return c.list();
    }

    public StoreInfoEntity getSotreBySotreID(String storeid){
        Session session = sessionFactory.getCurrentSession();
        //取方式2
        DetachedCriteria dc = DetachedCriteria.forClass(StoreInfoEntity.class);
        dc.add(Restrictions.eq("storeid",storeid));
        Criteria c = dc.getExecutableCriteria(session);
        StoreInfoEntity store = null;
        if (c.list().size() != 0){
            store = (StoreInfoEntity)c.list().get(0);
        }
        return store;
    }
}

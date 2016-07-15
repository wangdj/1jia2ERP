package cn.ch1jia2.erp.dao.impl;

import cn.ch1jia2.erp.dao.ICityInfoDAO;
import cn.ch1jia2.erp.entity.CityEntity;
import cn.ch1jia2.erp.entity.SuburbEntity;
import org.hibernate.*;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by wangdj on 2016/7/5.
 */
@Repository
@Transactional
public class CityInfoDAOImpl implements ICityInfoDAO {

    @Autowired
    private SessionFactory sessionFactory;
    @SuppressWarnings("unchecked")
    public List<CityEntity> getList(){
        Session session = sessionFactory.getCurrentSession();
       // String selectZhus = "select c from CityEntity c";
        DetachedCriteria dc = DetachedCriteria.forClass(CityEntity.class).setFetchMode("suburbs", FetchMode.SELECT);
        dc.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        Criteria c = dc.getExecutableCriteria(session);
       // Query query = session.createQuery(selectZhus);
        return (List<CityEntity>)c.list();
    }

    @SuppressWarnings("unchecked")
    public List<SuburbEntity> getSuburbsByCityID(int cityid){
        Session session = sessionFactory.getCurrentSession();
        //取方式2
        DetachedCriteria dc = DetachedCriteria.forClass(CityEntity.class);
        dc.add(Restrictions.eq("cityid",cityid));
        Criteria c = dc.getExecutableCriteria(session);

        Set<SuburbEntity> subs = ((CityEntity)c.list().get(0)).getSuberbs();
        List<SuburbEntity> subslist = new ArrayList<SuburbEntity>();
        subslist.addAll(subs);
        return subslist;
    }

    @SuppressWarnings("unchecked")
    public List<CityEntity> getHotCities(){
        Session session = sessionFactory.getCurrentSession();
        DetachedCriteria dc = DetachedCriteria.forClass(CityEntity.class).setFetchMode("suburbs", FetchMode.SELECT);
        dc.setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
        dc.add(Restrictions.eq("ishot",1));
        Criteria c = dc.getExecutableCriteria(session);

        return (List<CityEntity>)c.list();
    }

    public void add(CityEntity entity) {

    }


}

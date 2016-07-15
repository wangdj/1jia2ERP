package cn.ch1jia2.erp.dao.impl;

import cn.ch1jia2.erp.dao.ICarBrandDAO;
import cn.ch1jia2.erp.entity.CarBrandEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * Created by yangzhenyu on 2016/6/24.
 */
@Repository
@Transactional
public class CarBrandDAOImpl implements ICarBrandDAO {
    private static Logger logger = LogManager.getLogger(ICarBrandDAO.class.getName());

    @Autowired
    private SessionFactory sessionFactory;

    public CarBrandEntity getEntityById(long id) {
        Session session = sessionFactory.getCurrentSession();
        CarBrandEntity result = (CarBrandEntity)session.get(CarBrandEntity.class, id);

        return result;
    }
    public List<CarBrandEntity> getList(HashMap condition) {
        /*
        List<CarBrandEntity> entities = new ArrayList<CarBrandEntity>();
        CarBrandEntity entity = new CarBrandEntity();

        entity.setId(1);
        entity.setName("大众");
        entity.setCountry("德国");
        entity.setRemark("--");
        entities.add(entity);

        entity = new CarBrandEntity();
        entity.setId(2);
        entity.setName("别克");
        entity.setCountry("美国");
        entity.setRemark("BUICK");
        entities.add(entity);
        */
//        String hsql="from master_car_brand";
        //Session session = sessionFactory.getCurrentSession();
        //Transaction trans = session.beginTransaction();
//        Session session = sessionFactory.openSession();
//        System.out.println("Attention!!!");
//        System.out.println("openSession: " + session.hashCode());
//        System.out.println("getCurrenctSession: " + sessionFactory.getCurrentSession().hashCode());
//        Query query = session.createQuery(hsql);
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(CarBrandEntity.class);

        //trans.commit();

        return criteria.list();
    }

    public long add(CarBrandEntity entity) {
        logger.info("Save CarBrand begin...");
        Session session = sessionFactory.getCurrentSession();
        session.save(entity);
        logger.info("Save CarBrand success...");
        logger.info("CarBrand.Id = " + entity.getId());

        return entity.getId();
    }

    public void update(CarBrandEntity entity) {
        CarBrandEntity updateEntity = this.getEntityById(entity.getId());
        updateEntity.setName(entity.getName());
        updateEntity.setCountry(entity.getCountry());
        updateEntity.setRemark(entity.getRemark());
    }

    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(new CarBrandEntity(id));
    }
}
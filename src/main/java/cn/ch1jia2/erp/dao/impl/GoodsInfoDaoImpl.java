package cn.ch1jia2.erp.dao.impl;

import cn.ch1jia2.erp.dao.IGoodsInfoDao;
import cn.ch1jia2.erp.entity.GoodsInfoEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by yangzhenyu on 2016/7/1.
 */
@Repository
@Transactional
public class GoodsInfoDaoImpl implements IGoodsInfoDao {
    private static Logger logger = LogManager.getLogger(IGoodsInfoDao.class);

    @Resource
    private SessionFactory sessionFactory;

    public GoodsInfoEntity getEntityById(String id) {
        Session session = this.sessionFactory.getCurrentSession();

        return (GoodsInfoEntity)session.get(GoodsInfoEntity.class, id);
    }

    public List<GoodsInfoEntity> getEntites(GoodsInfoEntity entity) {
        Session session = this.sessionFactory.getCurrentSession();
        if (null == entity) {
            return session.createCriteria(GoodsInfoEntity.class).list();
        } else {
            return null;
        }
    }

    public int add(GoodsInfoEntity entity) {
        return 0;
    }

    public int update(GoodsInfoEntity entity) {
        return 0;
    }

    public int delete(int id) {
        return 0;
    }
}

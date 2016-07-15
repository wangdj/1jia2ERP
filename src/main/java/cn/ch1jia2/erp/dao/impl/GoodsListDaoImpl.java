package cn.ch1jia2.erp.dao.impl;

import cn.ch1jia2.erp.dao.IGoodsInfoDao;
import cn.ch1jia2.erp.dao.IGoodsListDao;
import cn.ch1jia2.erp.entity.GoodsListEntity;
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
public class GoodsListDaoImpl implements IGoodsListDao {
    private static Logger logger = LogManager.getLogger(IGoodsInfoDao.class);

    @Resource
    private SessionFactory sessionFactory;

    public GoodsListEntity getEntityById(String id) {
        Session session = this.sessionFactory.getCurrentSession();
        return (GoodsListEntity)session.get(GoodsListEntity.class, id);
    }

    public List<GoodsListEntity> getEntites(GoodsListEntity entity) {

        return null;
    }

    public int add(GoodsListEntity entity) {
        return 0;
    }

    public int update(GoodsListEntity entity) {
        return 0;
    }

    public int delete(int id) {
        return 0;
    }
}

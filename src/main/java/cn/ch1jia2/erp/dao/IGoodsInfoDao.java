package cn.ch1jia2.erp.dao;

import cn.ch1jia2.erp.entity.GoodsInfoEntity;

import java.util.List;

/**
 * Created by yangzhenyu on 2016/7/1.
 */
public interface IGoodsInfoDao {
    GoodsInfoEntity getEntityById(String id);
    List<GoodsInfoEntity> getEntites(GoodsInfoEntity entity);
    int add(GoodsInfoEntity entity);
    int update(GoodsInfoEntity entity);
    int delete(int id);
}

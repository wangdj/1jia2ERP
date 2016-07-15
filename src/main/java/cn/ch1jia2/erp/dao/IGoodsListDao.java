package cn.ch1jia2.erp.dao;

import cn.ch1jia2.erp.entity.GoodsInfoEntity;
import cn.ch1jia2.erp.entity.GoodsListEntity;

import java.util.List;

/**
 * Created by yangzhenyu on 2016/7/1.
 */
public interface IGoodsListDao {
    GoodsListEntity getEntityById(String id);
    List<GoodsListEntity> getEntites(GoodsListEntity entity);
    int add(GoodsListEntity entity);
    int update(GoodsListEntity entity);
    int delete(int id);
}

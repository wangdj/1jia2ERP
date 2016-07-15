package cn.ch1jia2.erp.dao;

import cn.ch1jia2.erp.entity.CarBrandEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yangzhenyu on 2016/6/24.
 */
public interface ICarBrandDAO {
    CarBrandEntity getEntityById(long id);
    List<CarBrandEntity> getList(HashMap condition);
    long add(CarBrandEntity entity);
    void update(CarBrandEntity entity);
    void delete(long id);
}
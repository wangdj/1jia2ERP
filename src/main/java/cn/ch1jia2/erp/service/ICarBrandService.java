package cn.ch1jia2.erp.service;

import cn.ch1jia2.erp.entity.CarBrandEntity;

import java.util.List;

/**
 * Created by yangzhenyu at 2016/6/24.
 */
public interface ICarBrandService {
    CarBrandEntity getEntityById(long id);
   // List<CarBrandEntity> getByContent(String content);
    List<CarBrandEntity> getAll();
    long add(CarBrandEntity entity);
    void update(CarBrandEntity entity);
    void delete(long id);
}

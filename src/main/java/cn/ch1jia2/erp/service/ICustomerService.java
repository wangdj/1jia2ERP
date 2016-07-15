package cn.ch1jia2.erp.service;

import cn.ch1jia2.erp.entity.CarEntity;

import java.util.List;

/**
 * Created by wangdj on 2016/7/6.
 */
public interface ICustomerService {
    List<CarEntity> getCarsByCustomerId(Integer id);

    CarEntity getDefaultCarByCustomerId(Integer id);

}

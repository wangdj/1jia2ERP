package cn.ch1jia2.erp.dao;

import cn.ch1jia2.erp.entity.CarEntity;

import java.util.List;

/**
 * Created by wangdj on 2016/7/6.
 */
public interface ICustomerDAO {
    CarEntity getDefaultCarByCustomerID(Integer customerid);

    List<CarEntity> getCarsByCustomerID(Integer customerid);
}

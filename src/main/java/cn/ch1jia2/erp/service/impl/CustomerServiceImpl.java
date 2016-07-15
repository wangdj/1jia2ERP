package cn.ch1jia2.erp.service.impl;

import cn.ch1jia2.erp.dao.ICustomerDAO;
import cn.ch1jia2.erp.entity.CarEntity;
import cn.ch1jia2.erp.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangdj on 2016/7/6.
 */
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerDAO dao;

    //根据车主ID取得该车主下所有车辆
    public List<CarEntity> getCarsByCustomerId(Integer id){

        return  dao.getCarsByCustomerID(id);
    }

    public CarEntity getDefaultCarByCustomerId(Integer id){

        return dao.getDefaultCarByCustomerID(id);
    }
}

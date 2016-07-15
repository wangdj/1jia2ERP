package cn.ch1jia2.erp.control;

import cn.ch1jia2.erp.entity.CarEntity;
import cn.ch1jia2.erp.service.ICustomerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wangdj on 2016/7/6.
 */
@RestController
@RequestMapping("/customers")
public class Customer {
    @Resource
    private ICustomerService service;
    //取得所有车主信息


    //取得指定车主ID/电话号码/车牌号码的车主信息
    //http://localhost:8080/Chuanghe/ERP/API/Customers/Cars?customerid=111&phone=33&license=GZ505
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String getCarsByParams(@RequestParam("customerid") Integer customerid, @RequestParam("phone") String phone,@RequestParam("license") String license){
        //TODO 根据车主的各种信息取得车辆信息
        return "根据车主的各种信息取得车辆信息";
    }

    //取得指定车牌号码的车主信息

    //取得指定车主的车辆信息
    @RequestMapping(value = "/cars/{customerid}", method = RequestMethod.GET)
    public List<CarEntity> getCarsbyCustomerid(@PathVariable("customerid") Integer customerid){
        return this.service.getCarsByCustomerId(customerid);
    }

    //取得指定车主的默认车辆信息1
    @RequestMapping(value = "/defaultcars/{customerid}", method = RequestMethod.GET)
    public CarEntity getDefaultCarbyCustomerid(@PathVariable("customerid") int customerid){
        return this.service.getDefaultCarByCustomerId(customerid);
    }

}

package cn.ch1jia2.erp.service;

import cn.ch1jia2.erp.entity.StoreComboEntity;
import cn.ch1jia2.erp.entity.StoreInfoEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by wangdj on 2016/7/7.
 */
public interface IStoreService {
    List<StoreComboEntity> getCombosByStoreID(String storeid);

    Double getStoreDistance(double longitude,double latitude,String storeid);

    /**
     * 根据所选地区、经纬度、服务种类、指定排序类型，获取门店信息
     */
    List<StoreInfoEntity> getStoresByParams(String areaID, double lng,double lat,String serviceID, String sort);
}

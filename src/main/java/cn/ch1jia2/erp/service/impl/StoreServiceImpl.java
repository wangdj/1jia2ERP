package cn.ch1jia2.erp.service.impl;

import cn.ch1jia2.erp.dao.ICustomerDAO;
import cn.ch1jia2.erp.dao.IStoreInfoDAO;
import cn.ch1jia2.erp.entity.StoreComboEntity;
import cn.ch1jia2.erp.entity.StoreInfoEntity;
import cn.ch1jia2.erp.service.IStoreService;
import cn.ch1jia2.erp.util.MapUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangdj on 2016/7/7.
 */
@Service
public class StoreServiceImpl implements IStoreService {
    @Autowired
    private IStoreInfoDAO dao;
    public List<StoreComboEntity> getCombosByStoreID(String storeid){
        return dao.getCombosBySotreID(storeid);
    }

    /**
     * 取得指定门店距离当前位置的距离，单位：米
     * @param longitude 用户经度
     * @param latitude  用户纬度
     * @return
     */
    public Double getStoreDistance(double longitude,double latitude,String storeid){
        StoreInfoEntity store = dao.getSotreBySotreID(storeid);
        double storelat = 0L;//门店纬度
        double storelon = 0L;//门店经度
        if (store != null){
            storelat = Double.parseDouble(store.getLatitude());
            storelon = Double.parseDouble(store.getLongitude());
        }
        Double distance = MapUtil.getDistance(longitude, latitude,storelon, storelat);
        //根据门店的经纬度，和当前位置的经纬度进行计算，算出该门店的离我的距离。
        return distance;
    }

    public List<StoreInfoEntity> getStoresByParams(String areaID, double lng,double lat,String serviceID, String sort){
        return null;
    }
}

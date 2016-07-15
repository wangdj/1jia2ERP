package cn.ch1jia2.erp.dao;

import cn.ch1jia2.erp.entity.StoreComboEntity;
import cn.ch1jia2.erp.entity.StoreInfoEntity;

import java.util.List;

/**
 * Created by wangdj on 2016/7/7.
 */
public interface IStoreInfoDAO {

    /**
     * 根据门店取得所有套餐
     */
    List<StoreComboEntity> getCombosBySotreID(String storeid);


    /**
     * 取得所有门店
     */

    /**
     * 取得指定门店ID的门店信息
     */
    StoreInfoEntity getSotreBySotreID(String storeid);
}

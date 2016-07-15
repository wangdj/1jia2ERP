package cn.ch1jia2.erp.service;

import cn.ch1jia2.erp.entity.CityEntity;
import cn.ch1jia2.erp.entity.SuburbEntity;

import java.util.List;

/**
 * Created by wangdj
 */
public interface ICityService {
    List<CityEntity> getCities();

    List<String> getHotCities();

    List<SuburbEntity> getSuburbsByCityID(int cityid);
}

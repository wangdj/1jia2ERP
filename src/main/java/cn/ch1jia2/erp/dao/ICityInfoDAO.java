package cn.ch1jia2.erp.dao;

import cn.ch1jia2.erp.entity.CityEntity;
import cn.ch1jia2.erp.entity.SuburbEntity;

import java.util.List;

/**
 * Created by wangdj on 2016/7/5.
 */
public interface ICityInfoDAO {

    List<CityEntity> getList();

    List<CityEntity> getHotCities();

    void add(CityEntity entity);

    List<SuburbEntity> getSuburbsByCityID(int cityid);
}

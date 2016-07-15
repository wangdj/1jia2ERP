package cn.ch1jia2.erp.service.impl;

import cn.ch1jia2.erp.dao.ICityInfoDAO;
import cn.ch1jia2.erp.entity.CityEntity;
import cn.ch1jia2.erp.entity.SuburbEntity;
import cn.ch1jia2.erp.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangdj
 */
@Service
public class CityServiceImpl implements ICityService {

    @Autowired
    private ICityInfoDAO dao;

    public List<CityEntity> getCities(){
        return dao.getList();
    }

    public List<String> getHotCities() {
        List<CityEntity> cities = dao.getHotCities();
        List<String> names = new ArrayList<String>();
        for (CityEntity obj:cities)
        {
            names.add(obj.getCityname());
        }
        return names;
    }

    public List<SuburbEntity> getSuburbsByCityID(int cityid){
        return dao.getSuburbsByCityID(cityid);
    }
}

package cn.ch1jia2.erp.service.impl;

import cn.ch1jia2.erp.dao.ICarBrandDAO;
import cn.ch1jia2.erp.entity.CarBrandEntity;
import cn.ch1jia2.erp.service.ICarBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by yangzhenyu at 2016/6/24.
 */
@Service
public class CarBrandServiceImpl implements ICarBrandService {
   // private static Logger logger = LogManager.getLogger(CarBrandServiceImpl.class.getName());

    @Autowired
    private ICarBrandDAO dao;

    public CarBrandEntity getEntityById(long id) {
//        logger.debug("this is a debug information of CarBrandService.getEntityById");
        return this.dao.getEntityById(id);
    }

    public List<CarBrandEntity> getAll() {
        return this.dao.getList(null);
    }

    public List<CarBrandEntity> getByContent(String content) {
        HashMap condition = new HashMap();
        condition.put("content", content);

        return this.dao.getList(condition);
    }

    public long add(CarBrandEntity entity) {
        return this.dao.add(entity);
    }

    public void update(CarBrandEntity entity) {

        this.dao.update(entity);
    }

    public void delete(long id) {
        this.dao.delete(id);
    }
}

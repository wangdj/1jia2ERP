package cn.ch1jia2.erp.service.impl;

import cn.ch1jia2.erp.dao.IGoodsInfoDao;
import cn.ch1jia2.erp.dao.IGoodsListDao;
import cn.ch1jia2.erp.entity.GoodsInfoEntity;
import cn.ch1jia2.erp.entity.GoodsListEntity;
import cn.ch1jia2.erp.service.IGoodsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yangzhenyu on 2016/7/1.
 */
@Service
public class GoodsServiceImpl implements IGoodsService {
    private static Logger logger = LogManager.getLogger(CarBrandServiceImpl.class.getName());

    @Resource
    private IGoodsInfoDao goodsInfoDao;

    @Resource
    private IGoodsListDao goodsListDao;

    public GoodsInfoEntity getGoodsInfo(String id) {
        return this.goodsInfoDao.getEntityById(id);
    }

    public List<GoodsInfoEntity> getGoodsInfos(GoodsInfoEntity entity) {
        return this.goodsInfoDao.getEntites(entity);
    }

    public GoodsListEntity getGoodsList(String id) {
        return this.goodsListDao.getEntityById(id);
    }

    public List<GoodsListEntity> getGoodsLists(String goodsInfoId) {
        return this.goodsListDao.getEntites(new GoodsListEntity(goodsInfoId));
    }

    public List<GoodsListEntity> getGoodsLists(GoodsListEntity entity) {
        return null;
    }

    public List<String> getColors(String goodsInfoId) {
        return Arrays.asList("Black", "White", "Red");
    }

    public List<String> getTypes(String goodsInfoId) {
        return Arrays.asList("2L", "4L", "5L");
    }
}

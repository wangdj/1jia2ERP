package cn.ch1jia2.erp.service;

import cn.ch1jia2.erp.entity.GoodsInfoEntity;
import cn.ch1jia2.erp.entity.GoodsListEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangzhenyu on 2016/7/1.
 */
public interface IGoodsService {
    GoodsInfoEntity getGoodsInfo(String id);
    List<GoodsInfoEntity> getGoodsInfos(GoodsInfoEntity entity);
    GoodsListEntity getGoodsList(String id);
    List<GoodsListEntity> getGoodsLists(String goodsInfoId);
    List<GoodsListEntity> getGoodsLists(GoodsListEntity entity);
    List<String> getColors(String goodsInfoId);
    List<String> getTypes(String goodsInfoId);
}

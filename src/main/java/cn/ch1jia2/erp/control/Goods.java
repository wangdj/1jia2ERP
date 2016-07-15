package cn.ch1jia2.erp.control;

import cn.ch1jia2.erp.entity.GoodsInfoEntity;
import cn.ch1jia2.erp.entity.GoodsListEntity;
import cn.ch1jia2.erp.service.IGoodsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangzhenyu on 2016/7/1.
 */
@RestController
@RequestMapping("/goods")
public class Goods {
    private static Logger logger = LogManager.getLogger(CarBrand.class);

    @Resource
    private IGoodsService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<GoodsInfoEntity> getAllGoodsInfo() {
        return this.service.getGoodsInfos(null);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public GoodsInfoEntity getGoodsInfo(@PathVariable("id") String id) {
        return this.service.getGoodsInfo(id);
    }

    @RequestMapping(value = "/{id}/list", method = RequestMethod.GET)
    public List<GoodsListEntity> getGoodsLists(@PathVariable("id") String id) {
        return this.service.getGoodsLists(id);
    }

    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    public GoodsListEntity getGoodsList(@PathVariable("id") String id) {
        return this.service.getGoodsList(id);
    }

    @RequestMapping(value = "/{id}/colors", method = RequestMethod.GET)
    public List<String> getColorsofGoodsInfo(@PathVariable("id") String id) {
        return this.service.getColors(id);
    }

    @RequestMapping(value = "/{id}/types", method = RequestMethod.GET)
    public List<String> getTypesofGoodsInfo(@PathVariable("id") String id) {
        return this.service.getTypes(id);
    }
}

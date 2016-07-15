package cn.ch1jia2.erp.control;

import cn.ch1jia2.erp.entity.StoreComboEntity;
import cn.ch1jia2.erp.entity.StoreInfoEntity;
import cn.ch1jia2.erp.service.IStoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangdj on 2016/7/7.
 */
@RestController
@RequestMapping("/stores")
public class Store {
    @Resource
    private IStoreService service;

    /**
     * 取得所有城市（按字母排序）
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<StoreComboEntity> getCities() {
        return null;
    }

    /**
     * 根据门店ID取得该门店的套餐信息。
     * @param storeid 门店ID
     * @return
     */
    //http://localhost:8080/chuanghe/erp/api/stores/combos/10000001
    @RequestMapping(value = "/combos/{storeid}", method = RequestMethod.GET)
    public List<StoreComboEntity> getCombosBySotreID(@PathVariable("storeid") String storeid){
        return this.service.getCombosByStoreID(storeid);
    }

    //http://localhost:8080/chuanghe/erp/api/stores/Distance?storeid=10000002&lng=121.2342141431&lat=31.0488017105
    /**
     * 取得指定门店距离当前位置的米数
     */
    @RequestMapping(value = "/distance", method = RequestMethod.GET)
    public Double getStoreDistanceByStoreID(@RequestParam("storeid") String storeid, @RequestParam("lng") double lng, @RequestParam("lat") double lat){
        return this.service.getStoreDistance(lng,lat,storeid);
    }

    //http://localhost:8080/chuanghe/erp/api/stores/query?areaid=111&lng=11.11&lat=22.22&serviceid=22&sort=1
    /**
     * 根据所选地区、经纬度、服务种类、指定排序类型，获取门店信息
     */
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public List<StoreInfoEntity> getStoresByParams(@RequestParam("areaid") String areaID, @RequestParam("lng") double lng, @RequestParam("lat") double lat,@RequestParam("serviceid") String serviceID,@RequestParam("sort") String sort) {
        //TODO
        StoreInfoEntity store = new StoreInfoEntity();
        store.setName("测试门店");
        List<StoreInfoEntity> lst = new ArrayList<StoreInfoEntity>();
        lst.add(store);
        return lst;
    }


    //----------------------------------------以下提供给Web端门店用户使用----------------------------------------
    //新增门店服务
    //更新门店服务
    //删除门店服务

    //新增门店用户
    //更新门店用户
    //删除门店用户




}

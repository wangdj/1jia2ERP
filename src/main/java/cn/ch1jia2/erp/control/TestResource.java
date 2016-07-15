package cn.ch1jia2.erp.control;

import cn.ch1jia2.erp.entity.CityEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by wangdj on 2016/7/8.
 */
@RestController
@RequestMapping("/Test")
public class TestResource {
    //@RequestMapping(method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    @RequestMapping(method = RequestMethod.GET)
    public CityEntity getCities() {
        CityEntity city = new CityEntity();
        city.setCityname("上海");
        city.setCityid(333);
        return city;
    }
    //设置页面编码，解决页面乱码问题
    @RequestMapping(value = "/{id}", method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    public String getCitiesByID(@PathVariable("id") int cityid){

        return "根据ID取得城市";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    public String getCitiesByID(@PathVariable("name") String cityName){

        return "根据名称取得城市";
    }

}

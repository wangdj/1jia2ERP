package cn.ch1jia2.erp.control;

import cn.ch1jia2.erp.entity.CityEntity;
import cn.ch1jia2.erp.entity.SuburbEntity;
import cn.ch1jia2.erp.exception.BusinessException;
import cn.ch1jia2.erp.service.ICityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wangdj on 2016/7/4.
 */
@RestController
@RequestMapping("/cities")
public class City extends BaseController {

    @Resource
    private ICityService service;
    //取得所有城市（按字母排序）
    @RequestMapping(method = RequestMethod.GET)
    public List<CityEntity> getCities() throws BusinessException {
        List<CityEntity> list = this.service.getCities();
        if (list.size() == 0){
            throw new BusinessException("获取城市时发生异常");
        }
        return list;
    }

    //取得热门城市列表
    @RequestMapping(value = "/hotcities", method = RequestMethod.GET)
    public List<String> getHotCities() throws Exception{
        return this.service.getHotCities();
    }

    //根据省或市，取得其下所有郊区名字
    @RequestMapping(value = "/{id}/suburbs", method = RequestMethod.GET)
    public List<SuburbEntity> getSuburbsByCityName(@PathVariable("id") int cityid){
        return this.service.getSuburbsByCityID(cityid);
    }

}

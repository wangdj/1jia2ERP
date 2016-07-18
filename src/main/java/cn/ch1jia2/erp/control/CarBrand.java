package cn.ch1jia2.erp.control;

import cn.ch1jia2.erp.entity.CarBrandEntity;
import cn.ch1jia2.erp.service.ICarBrandService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yangzhenyu on 2016/6/24.
 */
@RestController
@RequestMapping("/carbrand")
public class CarBrand extends BaseController{
    private static Logger logger = LogManager.getLogger(CarBrand.class);

    @Resource
    private ICarBrandService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<CarBrandEntity> getAll() {
        return this.service.getAll();
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public CarBrandEntity getById(@PathVariable("id") long id) {
        logger.info("/carbrand/" + id);
        CarBrandEntity entity = this.service.getEntityById(id);

        if (null == entity) {
            return new CarBrandEntity();
        } else {
            return entity;
        }
    }

    /*
    @RequestMapping(value="/{content}", method= RequestMethod.GET)
    public List<CarBrandEntity> getByContent(@PathVariable("content") String content) {
        return this.service.getByContent(content);
    }
    */

    /**
     * Add a new car brand into database
     * @param body
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public CarBrandEntity add(@RequestBody String body) {
        ObjectMapper mapper = new ObjectMapper();
        CarBrandEntity entity = null;
        try {
            entity = mapper.readValue(body,  CarBrandEntity.class);
            long result = this.service.add(entity);
            System.out.println(result);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entity;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Object delete(@PathVariable("id") int id) {
        /*logger.info("删除人员信息id=" + id);*/
        this.service.delete(id);
        HashMap<String, String> msg = new HashMap<String, String>();
        msg.put("msg", "删除信息成功");
        return msg;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public CarBrandEntity update(@RequestBody String body) {
        ObjectMapper mapper = new ObjectMapper();
        CarBrandEntity entity = null;
        try {



            entity = mapper.readValue(body,  CarBrandEntity.class);
            this.service.update(entity);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entity;
    }

    /**
     *
     * @param body
     * @return
     */
    @RequestMapping(method = RequestMethod.PATCH)
    public List<CarBrandEntity> search(@RequestBody String body) {
        ObjectMapper mapper = new ObjectMapper();
        CarBrandEntity entity = null;
        try {
            entity = mapper.readValue(body,  CarBrandEntity.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return this.service.getAll();
    }
}
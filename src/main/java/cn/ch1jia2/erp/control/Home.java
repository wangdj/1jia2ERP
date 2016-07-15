package cn.ch1jia2.erp.control;

import cn.ch1jia2.erp.entity.UserEntity;
import cn.ch1jia2.erp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class Home {

    @Autowired
    private IUserService userService;

    @RequestMapping("")
    public String home(){
        return "index";
    }

    @RequestMapping("/gjson")
    @ResponseBody
    public List<UserEntity> json(){
        return userService.getAllUsers();
    }

    @RequestMapping("/admin")
    @ResponseBody
    public List<String> admin(){
        return Arrays.asList("zhangsan", "lisi", "wangwu");
    }
}

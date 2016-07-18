package cn.ch1jia2.erp.control;

import cn.ch1jia2.erp.exception.BusinessException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangdj on 2016/7/12.
 */
public class BaseController {
    /** 基于@ExceptionHandler异常处理 */
    @ExceptionHandler
    public String exp(HttpServletRequest request, Exception ex) {


        request.setAttribute("ex", ex);

        // 根据不同错误进行不同的处理
        if(ex instanceof BusinessException) {
            //业务错误时返回
            return "error-business";
        } else {
            return "error";
        }
    }

}

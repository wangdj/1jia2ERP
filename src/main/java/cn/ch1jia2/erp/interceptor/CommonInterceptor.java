package cn.ch1jia2.erp.interceptor;

import cn.ch1jia2.erp.exception.BusinessException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangdj on 2016/7/12.
 */
public class CommonInterceptor extends HandlerInterceptorAdapter {
    //private final Logger log = LoggerFactory.getLogger(CommonInterceptor.class);
    public static final String LAST_PAGE = "com.alibaba.lastPage";
    /*
     * 利用正则映射到需要拦截的路径

    private String mappingURL;

    public void setMappingURL(String mappingURL) {
               this.mappingURL = mappingURL;
    }
  */
    /**
     * 在业务处理器处理请求之前被调用
     * 如果返回false
     *     从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链
     * 如果返回true
     *    执行下一个拦截器,直到所有的拦截器都执行完毕
     *    再执行被拦截的Controller
     *    然后进入拦截器链,
     *    从最后一个拦截器往回执行所有的postHandle()
     *    接着再从最后一个拦截器往回执行所有的afterCompletion()
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        if ("GET".equalsIgnoreCase(request.getMethod())) {
            //RequestUtil.saveRequest();
        }
        System.out.println();
         System.out.println("==============执行顺序: 1、preHandle================");
        String requestUri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String url = requestUri.substring(contextPath.length());

         System.out.println("requestUri:"+requestUri);
         System.out.println("contextPath:"+contextPath);
         System.out.println("url:"+url);

        String username =  (String)request.getSession().getAttribute("user");
        if(username == null){
             System.out.println("Interceptor：跳转到login页面！");
            //request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
            try{
                throw new BusinessException("您没有权限登录该画面！");
            }catch(Exception ex){

            }
            return false;
        }else
            return true;
    }

    /**
     * 在业务处理器处理请求执行完成后,生成视图之前执行的动作
     * 可在modelAndView中加入数据，比如当前时间
     */
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
         System.out.println("==============执行顺序: 2、postHandle================");
        if(modelAndView != null){  //加入当前时间
            modelAndView.addObject("var", "测试postHandle");
        }
    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用,可用于清理资源等
     *
     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
         System.out.println("==============执行顺序: 3、afterCompletion================");
    }

}
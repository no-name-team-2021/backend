package cn.edu.whu.shopping.user.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Author LiuWeiFan
 * @create 2021/7/8 14:51
 */
@ControllerAdvice
public class StatusAdvice extends cc.eamon.open.status.StatusAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
    }

    /**
     * 全局异常处理
     */
    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    @Override
    public Map<String, Object> statusExceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        return super.statusExceptionHandler(request, response, e);
    }

    @Override
    public boolean setResponseStatus() {
        return true;
    }

}
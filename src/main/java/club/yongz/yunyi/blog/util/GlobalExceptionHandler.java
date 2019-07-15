package club.yongz.yunyi.blog.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import club.yongz.yunyi.blog.vo.Response;

/**
 * 处理异常的工具类
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Response jsonErrorHandler(MyException e) throws Exception {
    	Response r = new Response(false,e.getMessage());
        return r;
    }
}

package wang.z.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import wang.z.exception.BusinessException;
import wang.z.exception.SystemException;

@RestControllerAdvice
public class ProjectExceptionAvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException exception){
      //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        return new Result(exception.getCode(),null,exception.getMessage());
    }
    @ExceptionHandler(BusinessException.class)
    public Result doSystemException(BusinessException exception){

        return new Result(exception.getCode(),null,exception.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception exception){
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        System.out.println("嘿嘿异常哪里跑");
        return  new Result(Code.SYSTEM_UNKNOWN_ERR,null,"五五");
    }
}

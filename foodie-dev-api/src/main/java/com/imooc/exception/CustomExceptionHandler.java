package com.imooc.exception;

import com.imooc.utils.IMOOCJSONResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * 自定义异常助手类
 * @author: hmm
 * @date: 2022/2/23
 */
// 统一异常处理
@RestControllerAdvice
public class CustomExceptionHandler {
    /**
     * 上传文件超过500k，捕获异常：MaxUploadSizeExceededException
     * @param ex
     * @return
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public IMOOCJSONResult handlerMaxUploadFile(MaxUploadSizeExceededException ex){
        return IMOOCJSONResult.errorMsg("文件上传大小不能超过500k，请压缩图片或减低图片质量再上传！");

    }

}

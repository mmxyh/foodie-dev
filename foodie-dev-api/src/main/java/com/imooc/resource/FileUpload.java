package com.imooc.resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 属性资源文件与类映射
 *
 * @author: hmm
 * @date: 2022/2/23
 */
@Component
// 用于定义属性的前缀
@ConfigurationProperties(prefix = "file")
// 用于指定资源文件的路径
//@PropertySource("classpath:file-upload-dev.properties")
@PropertySource("classpath:file-upload-prod.properties")
public class FileUpload {
    private String imageUserFaceLocation;
    private String imageServerUrl;

    public String getImageUserFaceLocation() {
        return imageUserFaceLocation;
    }

    public void setImageUserFaceLocation(String imageUserFaceLocation) {
        this.imageUserFaceLocation = imageUserFaceLocation;
    }

    public String getImageServerUrl() {
        return imageServerUrl;
    }

    public void setImageServerUrl(String imageServerUrl) {
        this.imageServerUrl = imageServerUrl;
    }
}

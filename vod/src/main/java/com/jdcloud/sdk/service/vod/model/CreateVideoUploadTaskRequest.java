/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Media Upload
 * 媒体上传相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 获取视频上传地址和凭证
 */
public class CreateVideoUploadTaskRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * HTTP 请求方法，上传支持 PUT 和 POST 方法，默认值为 PUT 。
通过该接口获取到上传地址和凭证之后，后续的上传动作，必须使用和该值一致的方法进行文件上传。

     */
    private String httpMethod;

    /**
     * 视频标题
     * Required:true
     */
    @Required
    private String title;

    /**
     * 文件名称
     * Required:true
     */
    @Required
    private String fileName;

    /**
     * 文件大小
     */
    private Long fileSize;

    /**
     * 封面地址
     */
    private String coverUrl;

    /**
     * 视频描述
     */
    private String description;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 视频标签集合
     */
    private List<String> tags;

    /**
     * 转码模板组ID
     */
    private String transcodeTemplateGroupId;

    /**
     * 转码模板ID集合
     */
    private List<Long> transcodeTemplateIds;

    /**
     * 水印ID集合
     */
    private List<Long> watermarkIds;

    /**
     * 自定义数据
     */
    private String userData;


    /**
     * get HTTP 请求方法，上传支持 PUT 和 POST 方法，默认值为 PUT 。
通过该接口获取到上传地址和凭证之后，后续的上传动作，必须使用和该值一致的方法进行文件上传。

     *
     * @return
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * set HTTP 请求方法，上传支持 PUT 和 POST 方法，默认值为 PUT 。
通过该接口获取到上传地址和凭证之后，后续的上传动作，必须使用和该值一致的方法进行文件上传。

     *
     * @param httpMethod
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * get 视频标题
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 视频标题
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get 文件名称
     *
     * @return
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * set 文件名称
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * get 文件大小
     *
     * @return
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * set 文件大小
     *
     * @param fileSize
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * get 封面地址
     *
     * @return
     */
    public String getCoverUrl() {
        return coverUrl;
    }

    /**
     * set 封面地址
     *
     * @param coverUrl
     */
    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    /**
     * get 视频描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 视频描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 分类ID
     *
     * @return
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * set 分类ID
     *
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * get 视频标签集合
     *
     * @return
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * set 视频标签集合
     *
     * @param tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * get 转码模板组ID
     *
     * @return
     */
    public String getTranscodeTemplateGroupId() {
        return transcodeTemplateGroupId;
    }

    /**
     * set 转码模板组ID
     *
     * @param transcodeTemplateGroupId
     */
    public void setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
    }

    /**
     * get 转码模板ID集合
     *
     * @return
     */
    public List<Long> getTranscodeTemplateIds() {
        return transcodeTemplateIds;
    }

    /**
     * set 转码模板ID集合
     *
     * @param transcodeTemplateIds
     */
    public void setTranscodeTemplateIds(List<Long> transcodeTemplateIds) {
        this.transcodeTemplateIds = transcodeTemplateIds;
    }

    /**
     * get 水印ID集合
     *
     * @return
     */
    public List<Long> getWatermarkIds() {
        return watermarkIds;
    }

    /**
     * set 水印ID集合
     *
     * @param watermarkIds
     */
    public void setWatermarkIds(List<Long> watermarkIds) {
        this.watermarkIds = watermarkIds;
    }

    /**
     * get 自定义数据
     *
     * @return
     */
    public String getUserData() {
        return userData;
    }

    /**
     * set 自定义数据
     *
     * @param userData
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }


    /**
     * set HTTP 请求方法，上传支持 PUT 和 POST 方法，默认值为 PUT 。
通过该接口获取到上传地址和凭证之后，后续的上传动作，必须使用和该值一致的方法进行文件上传。

     *
     * @param httpMethod
     */
    public CreateVideoUploadTaskRequest httpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * set 视频标题
     *
     * @param title
     */
    public CreateVideoUploadTaskRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
     * set 文件名称
     *
     * @param fileName
     */
    public CreateVideoUploadTaskRequest fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * set 文件大小
     *
     * @param fileSize
     */
    public CreateVideoUploadTaskRequest fileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * set 封面地址
     *
     * @param coverUrl
     */
    public CreateVideoUploadTaskRequest coverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }

    /**
     * set 视频描述
     *
     * @param description
     */
    public CreateVideoUploadTaskRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 分类ID
     *
     * @param categoryId
     */
    public CreateVideoUploadTaskRequest categoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * set 视频标签集合
     *
     * @param tags
     */
    public CreateVideoUploadTaskRequest tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * set 转码模板组ID
     *
     * @param transcodeTemplateGroupId
     */
    public CreateVideoUploadTaskRequest transcodeTemplateGroupId(String transcodeTemplateGroupId) {
        this.transcodeTemplateGroupId = transcodeTemplateGroupId;
        return this;
    }

    /**
     * set 转码模板ID集合
     *
     * @param transcodeTemplateIds
     */
    public CreateVideoUploadTaskRequest transcodeTemplateIds(List<Long> transcodeTemplateIds) {
        this.transcodeTemplateIds = transcodeTemplateIds;
        return this;
    }

    /**
     * set 水印ID集合
     *
     * @param watermarkIds
     */
    public CreateVideoUploadTaskRequest watermarkIds(List<Long> watermarkIds) {
        this.watermarkIds = watermarkIds;
        return this;
    }

    /**
     * set 自定义数据
     *
     * @param userData
     */
    public CreateVideoUploadTaskRequest userData(String userData) {
        this.userData = userData;
        return this;
    }


    /**
     * add item to 视频标签集合
     *
     * @param tag
     */
    public void addTag(String tag) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tag);
    }

    /**
     * add item to 转码模板ID集合
     *
     * @param transcodeTemplateId
     */
    public void addTranscodeTemplateId(Long transcodeTemplateId) {
        if (this.transcodeTemplateIds == null) {
            this.transcodeTemplateIds = new ArrayList<>();
        }
        this.transcodeTemplateIds.add(transcodeTemplateId);
    }

    /**
     * add item to 水印ID集合
     *
     * @param watermarkId
     */
    public void addWatermarkId(Long watermarkId) {
        if (this.watermarkIds == null) {
            this.watermarkIds = new ArrayList<>();
        }
        this.watermarkIds.add(watermarkId);
    }

}
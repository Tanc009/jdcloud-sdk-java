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
 * 图片样式相关接口
 * 图片样式API
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.mps.model;

import java.util.Date;

/**
 * imageStyle
 */
public class ImageStyle  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片样式id(readOnly)
     */
    private Long id;

    /**
     * 用户id(readOnly)
     */
    private String userId;

    /**
     * 图片样式名称
     */
    private String styleName;

    /**
     * 图片样式参数
     */
    private String params;

    /**
     * 图片样式参数别名
     */
    private String paramAlias;

    /**
     * 所属区域(readOnly)
     */
    private String regionId;

    /**
     * 所属Bucket(readOnly)
     */
    private String bucketName;

    /**
     * 图片样式状态(readOnly)
     */
    private Integer status;

    /**
     * 修改时间(readOnly)
     */
    private String modifyTime;

    /**
     * 创建时间(readOnly)
     */
    private String createdTime;


    /**
     * get 图片样式id(readOnly)
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * set 图片样式id(readOnly)
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * get 用户id(readOnly)
     *
     * @return
     */
    public String getUserId() {
        return userId;
    }

    /**
     * set 用户id(readOnly)
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * get 图片样式名称
     *
     * @return
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * set 图片样式名称
     *
     * @param styleName
     */
    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    /**
     * get 图片样式参数
     *
     * @return
     */
    public String getParams() {
        return params;
    }

    /**
     * set 图片样式参数
     *
     * @param params
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * get 图片样式参数别名
     *
     * @return
     */
    public String getParamAlias() {
        return paramAlias;
    }

    /**
     * set 图片样式参数别名
     *
     * @param paramAlias
     */
    public void setParamAlias(String paramAlias) {
        this.paramAlias = paramAlias;
    }

    /**
     * get 所属区域(readOnly)
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 所属区域(readOnly)
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 所属Bucket(readOnly)
     *
     * @return
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * set 所属Bucket(readOnly)
     *
     * @param bucketName
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * get 图片样式状态(readOnly)
     *
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 图片样式状态(readOnly)
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * get 修改时间(readOnly)
     *
     * @return
     */
    public String getModifyTime() {
        return modifyTime;
    }

    /**
     * set 修改时间(readOnly)
     *
     * @param modifyTime
     */
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * get 创建时间(readOnly)
     *
     * @return
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * set 创建时间(readOnly)
     *
     * @param createdTime
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    /**
     * set 图片样式id(readOnly)
     *
     * @param id
     */
    public ImageStyle id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * set 用户id(readOnly)
     *
     * @param userId
     */
    public ImageStyle userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * set 图片样式名称
     *
     * @param styleName
     */
    public ImageStyle styleName(String styleName) {
        this.styleName = styleName;
        return this;
    }

    /**
     * set 图片样式参数
     *
     * @param params
     */
    public ImageStyle params(String params) {
        this.params = params;
        return this;
    }

    /**
     * set 图片样式参数别名
     *
     * @param paramAlias
     */
    public ImageStyle paramAlias(String paramAlias) {
        this.paramAlias = paramAlias;
        return this;
    }

    /**
     * set 所属区域(readOnly)
     *
     * @param regionId
     */
    public ImageStyle regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 所属Bucket(readOnly)
     *
     * @param bucketName
     */
    public ImageStyle bucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * set 图片样式状态(readOnly)
     *
     * @param status
     */
    public ImageStyle status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * set 修改时间(readOnly)
     *
     * @param modifyTime
     */
    public ImageStyle modifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * set 创建时间(readOnly)
     *
     * @param createdTime
     */
    public ImageStyle createdTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }


}
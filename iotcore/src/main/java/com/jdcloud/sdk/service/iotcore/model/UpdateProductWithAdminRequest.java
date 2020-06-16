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
 * LoongrayProduct
 * 关于产品基本信息操作的相关接口
 *
 * OpenAPI spec version: v2
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.iotcore.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 修改产品
 */
public class UpdateProductWithAdminRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品名称，名称不可为空，3-30个字符，只支持汉字、英文字母、数字、下划线“_”及中划线“-”，必须以汉字、英文字母及数字开头结尾
     */
    private String productName;

    /**
     * 产品描述，80字符以内
     */
    private String productDescription;

    /**
     * 动态注册,0:关闭，1:开启
     */
    private Integer dynamicRegister;

    /**
     * 地域ID
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * IoT Engine实例ID信息
     * Required:true
     */
    @Required
    private String instanceId;

    /**
     * 产品Key
     * Required:true
     */
    @Required
    private String productKey;


    /**
     * get 产品名称，名称不可为空，3-30个字符，只支持汉字、英文字母、数字、下划线“_”及中划线“-”，必须以汉字、英文字母及数字开头结尾
     *
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * set 产品名称，名称不可为空，3-30个字符，只支持汉字、英文字母、数字、下划线“_”及中划线“-”，必须以汉字、英文字母及数字开头结尾
     *
     * @param productName
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * get 产品描述，80字符以内
     *
     * @return
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * set 产品描述，80字符以内
     *
     * @param productDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    /**
     * get 动态注册,0:关闭，1:开启
     *
     * @return
     */
    public Integer getDynamicRegister() {
        return dynamicRegister;
    }

    /**
     * set 动态注册,0:关闭，1:开启
     *
     * @param dynamicRegister
     */
    public void setDynamicRegister(Integer dynamicRegister) {
        this.dynamicRegister = dynamicRegister;
    }

    /**
     * get 地域ID
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get IoT Engine实例ID信息
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set IoT Engine实例ID信息
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * get 产品Key
     *
     * @return
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }


    /**
     * set 产品名称，名称不可为空，3-30个字符，只支持汉字、英文字母、数字、下划线“_”及中划线“-”，必须以汉字、英文字母及数字开头结尾
     *
     * @param productName
     */
    public UpdateProductWithAdminRequest productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * set 产品描述，80字符以内
     *
     * @param productDescription
     */
    public UpdateProductWithAdminRequest productDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * set 动态注册,0:关闭，1:开启
     *
     * @param dynamicRegister
     */
    public UpdateProductWithAdminRequest dynamicRegister(Integer dynamicRegister) {
        this.dynamicRegister = dynamicRegister;
        return this;
    }

    /**
     * set 地域ID
     *
     * @param regionId
     */
    public UpdateProductWithAdminRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set IoT Engine实例ID信息
     *
     * @param instanceId
     */
    public UpdateProductWithAdminRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * set 产品Key
     *
     * @param productKey
     */
    public UpdateProductWithAdminRequest productKey(String productKey) {
        this.productKey = productKey;
        return this;
    }


}
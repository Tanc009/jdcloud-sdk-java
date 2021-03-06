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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.resourcetag.model;


/**
 * productLineAccessInfo
 */
public class ProductLineAccessInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品线代号名称
     */
    private String serviceCode;

    /**
     * 产品线英文名称, 提供给标签控制台展示
     */
    private String feName;

    /**
     * 产品线中文名称, 提供给标签控制台展示
     */
    private String feNameCn;

    /**
     * 产品线是否标准接入标签系统
     */
    private Boolean standardAccess;

    /**
     * 是否区分地域
     */
    private Boolean distinguishRegion;


    /**
     * get 产品线代号名称
     *
     * @return
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * set 产品线代号名称
     *
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * get 产品线英文名称, 提供给标签控制台展示
     *
     * @return
     */
    public String getFeName() {
        return feName;
    }

    /**
     * set 产品线英文名称, 提供给标签控制台展示
     *
     * @param feName
     */
    public void setFeName(String feName) {
        this.feName = feName;
    }

    /**
     * get 产品线中文名称, 提供给标签控制台展示
     *
     * @return
     */
    public String getFeNameCn() {
        return feNameCn;
    }

    /**
     * set 产品线中文名称, 提供给标签控制台展示
     *
     * @param feNameCn
     */
    public void setFeNameCn(String feNameCn) {
        this.feNameCn = feNameCn;
    }

    /**
     * get 产品线是否标准接入标签系统
     *
     * @return
     */
    public Boolean getStandardAccess() {
        return standardAccess;
    }

    /**
     * set 产品线是否标准接入标签系统
     *
     * @param standardAccess
     */
    public void setStandardAccess(Boolean standardAccess) {
        this.standardAccess = standardAccess;
    }

    /**
     * get 是否区分地域
     *
     * @return
     */
    public Boolean getDistinguishRegion() {
        return distinguishRegion;
    }

    /**
     * set 是否区分地域
     *
     * @param distinguishRegion
     */
    public void setDistinguishRegion(Boolean distinguishRegion) {
        this.distinguishRegion = distinguishRegion;
    }


    /**
     * set 产品线代号名称
     *
     * @param serviceCode
     */
    public ProductLineAccessInfo serviceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * set 产品线英文名称, 提供给标签控制台展示
     *
     * @param feName
     */
    public ProductLineAccessInfo feName(String feName) {
        this.feName = feName;
        return this;
    }

    /**
     * set 产品线中文名称, 提供给标签控制台展示
     *
     * @param feNameCn
     */
    public ProductLineAccessInfo feNameCn(String feNameCn) {
        this.feNameCn = feNameCn;
        return this;
    }

    /**
     * set 产品线是否标准接入标签系统
     *
     * @param standardAccess
     */
    public ProductLineAccessInfo standardAccess(Boolean standardAccess) {
        this.standardAccess = standardAccess;
        return this;
    }

    /**
     * set 是否区分地域
     *
     * @param distinguishRegion
     */
    public ProductLineAccessInfo distinguishRegion(Boolean distinguishRegion) {
        this.distinguishRegion = distinguishRegion;
        return this;
    }


}
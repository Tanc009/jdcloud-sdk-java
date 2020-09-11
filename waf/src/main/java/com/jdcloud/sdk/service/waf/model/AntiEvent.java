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

package com.jdcloud.sdk.service.waf.model;


/**
 * antiEvent
 */
public class AntiEvent  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 源ip
     */
    private String remoteAddr;

    /**
     * 情报标签
     */
    private String csaInfo;

    /**
     * 来源地区
     */
    private String area;

    /**
     * 产生时间
     */
    private Integer accessTime;

    /**
     * 方法
     */
    private String method;

    /**
     * 攻击类型
     */
    private String attackType;

    /**
     * url
     */
    private String url;

    /**
     * 恶意负载
     */
    private String payLoad;

    /**
     * 动作
     */
    private String action;

    /**
     * 规则名称
     */
    private String ruleName;

    /**
     * 日志Id
     */
    private String logId;

    /**
     * 该信息是否已上报AI平台，0表示否
     */
    private Integer isReported;

    /**
     * 实例id
     */
    private String wafInstanceId;


    /**
     * get 源ip
     *
     * @return
     */
    public String getRemoteAddr() {
        return remoteAddr;
    }

    /**
     * set 源ip
     *
     * @param remoteAddr
     */
    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    /**
     * get 情报标签
     *
     * @return
     */
    public String getCsaInfo() {
        return csaInfo;
    }

    /**
     * set 情报标签
     *
     * @param csaInfo
     */
    public void setCsaInfo(String csaInfo) {
        this.csaInfo = csaInfo;
    }

    /**
     * get 来源地区
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     * set 来源地区
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * get 产生时间
     *
     * @return
     */
    public Integer getAccessTime() {
        return accessTime;
    }

    /**
     * set 产生时间
     *
     * @param accessTime
     */
    public void setAccessTime(Integer accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * get 方法
     *
     * @return
     */
    public String getMethod() {
        return method;
    }

    /**
     * set 方法
     *
     * @param method
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * get 攻击类型
     *
     * @return
     */
    public String getAttackType() {
        return attackType;
    }

    /**
     * set 攻击类型
     *
     * @param attackType
     */
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    /**
     * get url
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * set url
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * get 恶意负载
     *
     * @return
     */
    public String getPayLoad() {
        return payLoad;
    }

    /**
     * set 恶意负载
     *
     * @param payLoad
     */
    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }

    /**
     * get 动作
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 动作
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 规则名称
     *
     * @return
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * set 规则名称
     *
     * @param ruleName
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * get 日志Id
     *
     * @return
     */
    public String getLogId() {
        return logId;
    }

    /**
     * set 日志Id
     *
     * @param logId
     */
    public void setLogId(String logId) {
        this.logId = logId;
    }

    /**
     * get 该信息是否已上报AI平台，0表示否
     *
     * @return
     */
    public Integer getIsReported() {
        return isReported;
    }

    /**
     * set 该信息是否已上报AI平台，0表示否
     *
     * @param isReported
     */
    public void setIsReported(Integer isReported) {
        this.isReported = isReported;
    }

    /**
     * get 实例id
     *
     * @return
     */
    public String getWafInstanceId() {
        return wafInstanceId;
    }

    /**
     * set 实例id
     *
     * @param wafInstanceId
     */
    public void setWafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
    }


    /**
     * set 源ip
     *
     * @param remoteAddr
     */
    public AntiEvent remoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
        return this;
    }

    /**
     * set 情报标签
     *
     * @param csaInfo
     */
    public AntiEvent csaInfo(String csaInfo) {
        this.csaInfo = csaInfo;
        return this;
    }

    /**
     * set 来源地区
     *
     * @param area
     */
    public AntiEvent area(String area) {
        this.area = area;
        return this;
    }

    /**
     * set 产生时间
     *
     * @param accessTime
     */
    public AntiEvent accessTime(Integer accessTime) {
        this.accessTime = accessTime;
        return this;
    }

    /**
     * set 方法
     *
     * @param method
     */
    public AntiEvent method(String method) {
        this.method = method;
        return this;
    }

    /**
     * set 攻击类型
     *
     * @param attackType
     */
    public AntiEvent attackType(String attackType) {
        this.attackType = attackType;
        return this;
    }

    /**
     * set url
     *
     * @param url
     */
    public AntiEvent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * set 恶意负载
     *
     * @param payLoad
     */
    public AntiEvent payLoad(String payLoad) {
        this.payLoad = payLoad;
        return this;
    }

    /**
     * set 动作
     *
     * @param action
     */
    public AntiEvent action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 规则名称
     *
     * @param ruleName
     */
    public AntiEvent ruleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * set 日志Id
     *
     * @param logId
     */
    public AntiEvent logId(String logId) {
        this.logId = logId;
        return this;
    }

    /**
     * set 该信息是否已上报AI平台，0表示否
     *
     * @param isReported
     */
    public AntiEvent isReported(Integer isReported) {
        this.isReported = isReported;
        return this;
    }

    /**
     * set 实例id
     *
     * @param wafInstanceId
     */
    public AntiEvent wafInstanceId(String wafInstanceId) {
        this.wafInstanceId = wafInstanceId;
        return this;
    }


}
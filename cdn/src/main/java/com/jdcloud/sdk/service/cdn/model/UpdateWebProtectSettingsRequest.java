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
 * SCDN相关接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置web防护开关
 */
public class UpdateWebProtectSettingsRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 0：拦截模式 (阻断forbidden 493跳到自定义页面) ，1-检测模式(观察notice)
     */
    private String wafMode;

    /**
     * 规则策略等级 0为宽松, 1为正常, 2为严格
     */
    private Integer wafLevel;

    /**
     * 拦截模式跳转的自定义页面名称, 缺省或default返回默认页面
     */
    private String redirection;

    /**
     * 用户域名
     * Required:true
     */
    @Required
    private String domain;


    /**
     * get 0：拦截模式 (阻断forbidden 493跳到自定义页面) ，1-检测模式(观察notice)
     *
     * @return
     */
    public String getWafMode() {
        return wafMode;
    }

    /**
     * set 0：拦截模式 (阻断forbidden 493跳到自定义页面) ，1-检测模式(观察notice)
     *
     * @param wafMode
     */
    public void setWafMode(String wafMode) {
        this.wafMode = wafMode;
    }

    /**
     * get 规则策略等级 0为宽松, 1为正常, 2为严格
     *
     * @return
     */
    public Integer getWafLevel() {
        return wafLevel;
    }

    /**
     * set 规则策略等级 0为宽松, 1为正常, 2为严格
     *
     * @param wafLevel
     */
    public void setWafLevel(Integer wafLevel) {
        this.wafLevel = wafLevel;
    }

    /**
     * get 拦截模式跳转的自定义页面名称, 缺省或default返回默认页面
     *
     * @return
     */
    public String getRedirection() {
        return redirection;
    }

    /**
     * set 拦截模式跳转的自定义页面名称, 缺省或default返回默认页面
     *
     * @param redirection
     */
    public void setRedirection(String redirection) {
        this.redirection = redirection;
    }

    /**
     * get 用户域名
     *
     * @return
     */
    public String getDomain() {
        return domain;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }


    /**
     * set 0：拦截模式 (阻断forbidden 493跳到自定义页面) ，1-检测模式(观察notice)
     *
     * @param wafMode
     */
    public UpdateWebProtectSettingsRequest wafMode(String wafMode) {
        this.wafMode = wafMode;
        return this;
    }

    /**
     * set 规则策略等级 0为宽松, 1为正常, 2为严格
     *
     * @param wafLevel
     */
    public UpdateWebProtectSettingsRequest wafLevel(Integer wafLevel) {
        this.wafLevel = wafLevel;
        return this;
    }

    /**
     * set 拦截模式跳转的自定义页面名称, 缺省或default返回默认页面
     *
     * @param redirection
     */
    public UpdateWebProtectSettingsRequest redirection(String redirection) {
        this.redirection = redirection;
        return this;
    }

    /**
     * set 用户域名
     *
     * @param domain
     */
    public UpdateWebProtectSettingsRequest domain(String domain) {
        this.domain = domain;
        return this;
    }


}
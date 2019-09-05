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
 * Domain
 * 域名配置相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 设置CDN域名SSL配置
 */
public class SetHttpSslRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证书来源。取值范围：default
     */
    private String source;

    /**
     * 证书标题
     */
    private String title;

    /**
     * 证书内容
     */
    private String sslCert;

    /**
     * 证书私钥
     */
    private String sslKey;

    /**
     * 跳转类型。取值范围：
default - 采用回源域名的默认协议
http - 强制采用http协议回源
https - 强制采用https协议回源

     */
    private String jumpType;

    /**
     * SSL配置启用状态
     */
    private Boolean enabled;

    /**
     * 域名ID
     * Required:true
     */
    @Required
    private Long domainId;


    /**
     * get 证书来源。取值范围：default
     *
     * @return
     */
    public String getSource() {
        return source;
    }

    /**
     * set 证书来源。取值范围：default
     *
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * get 证书标题
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 证书标题
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get 证书内容
     *
     * @return
     */
    public String getSslCert() {
        return sslCert;
    }

    /**
     * set 证书内容
     *
     * @param sslCert
     */
    public void setSslCert(String sslCert) {
        this.sslCert = sslCert;
    }

    /**
     * get 证书私钥
     *
     * @return
     */
    public String getSslKey() {
        return sslKey;
    }

    /**
     * set 证书私钥
     *
     * @param sslKey
     */
    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    /**
     * get 跳转类型。取值范围：
default - 采用回源域名的默认协议
http - 强制采用http协议回源
https - 强制采用https协议回源

     *
     * @return
     */
    public String getJumpType() {
        return jumpType;
    }

    /**
     * set 跳转类型。取值范围：
default - 采用回源域名的默认协议
http - 强制采用http协议回源
https - 强制采用https协议回源

     *
     * @param jumpType
     */
    public void setJumpType(String jumpType) {
        this.jumpType = jumpType;
    }

    /**
     * get SSL配置启用状态
     *
     * @return
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * set SSL配置启用状态
     *
     * @param enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * get 域名ID
     *
     * @return
     */
    public Long getDomainId() {
        return domainId;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }


    /**
     * set 证书来源。取值范围：default
     *
     * @param source
     */
    public SetHttpSslRequest source(String source) {
        this.source = source;
        return this;
    }

    /**
     * set 证书标题
     *
     * @param title
     */
    public SetHttpSslRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
     * set 证书内容
     *
     * @param sslCert
     */
    public SetHttpSslRequest sslCert(String sslCert) {
        this.sslCert = sslCert;
        return this;
    }

    /**
     * set 证书私钥
     *
     * @param sslKey
     */
    public SetHttpSslRequest sslKey(String sslKey) {
        this.sslKey = sslKey;
        return this;
    }

    /**
     * set 跳转类型。取值范围：
default - 采用回源域名的默认协议
http - 强制采用http协议回源
https - 强制采用https协议回源

     *
     * @param jumpType
     */
    public SetHttpSslRequest jumpType(String jumpType) {
        this.jumpType = jumpType;
        return this;
    }

    /**
     * set SSL配置启用状态
     *
     * @param enabled
     */
    public SetHttpSslRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set 域名ID
     *
     * @param domainId
     */
    public SetHttpSslRequest domainId(Long domainId) {
        this.domainId = domainId;
        return this;
    }


}
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
 * CDN对接SSL相关接口
 * SSL数字证书相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 上传证书
 */
public class UploadCertRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证书名称
     * Required:true
     */
    @Required
    private String certName;

    /**
     * 私钥
     * Required:true
     */
    @Required
    private String keyFile;

    /**
     * 证书
     * Required:true
     */
    @Required
    private String certFile;

    /**
     * 证书别名
     */
    private String aliasName;


    /**
     * get 证书名称
     *
     * @return
     */
    public String getCertName() {
        return certName;
    }

    /**
     * set 证书名称
     *
     * @param certName
     */
    public void setCertName(String certName) {
        this.certName = certName;
    }

    /**
     * get 私钥
     *
     * @return
     */
    public String getKeyFile() {
        return keyFile;
    }

    /**
     * set 私钥
     *
     * @param keyFile
     */
    public void setKeyFile(String keyFile) {
        this.keyFile = keyFile;
    }

    /**
     * get 证书
     *
     * @return
     */
    public String getCertFile() {
        return certFile;
    }

    /**
     * set 证书
     *
     * @param certFile
     */
    public void setCertFile(String certFile) {
        this.certFile = certFile;
    }

    /**
     * get 证书别名
     *
     * @return
     */
    public String getAliasName() {
        return aliasName;
    }

    /**
     * set 证书别名
     *
     * @param aliasName
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }


    /**
     * set 证书名称
     *
     * @param certName
     */
    public UploadCertRequest certName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * set 私钥
     *
     * @param keyFile
     */
    public UploadCertRequest keyFile(String keyFile) {
        this.keyFile = keyFile;
        return this;
    }

    /**
     * set 证书
     *
     * @param certFile
     */
    public UploadCertRequest certFile(String certFile) {
        this.certFile = certFile;
        return this;
    }

    /**
     * set 证书别名
     *
     * @param aliasName
     */
    public UploadCertRequest aliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }


}
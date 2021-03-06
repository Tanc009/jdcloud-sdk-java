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
 * SSL Certificate
 * SSL数字证书相关信息接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ssl.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 更新证书 [MFA enabled]
 */
public class UpdateCertRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证书ID
     * Required:true
     */
    @Required
    private String certId;

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
     * get 证书ID
     *
     * @return
     */
    public String getCertId() {
        return certId;
    }

    /**
     * set 证书ID
     *
     * @param certId
     */
    public void setCertId(String certId) {
        this.certId = certId;
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
     * set 证书ID
     *
     * @param certId
     */
    public UpdateCertRequest certId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * set 私钥
     *
     * @param keyFile
     */
    public UpdateCertRequest keyFile(String keyFile) {
        this.keyFile = keyFile;
        return this;
    }

    /**
     * set 证书
     *
     * @param certFile
     */
    public UpdateCertRequest certFile(String certFile) {
        this.certFile = certFile;
        return this;
    }


}
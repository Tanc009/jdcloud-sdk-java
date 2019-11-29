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
 * Key Management Service
 * 基于硬件保护密钥的安全数据托管服务
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.kms.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 使用非对称密钥的私钥签名,签名算法仅支持RSA_PKCS1_PADDING填充方式,最大签名数据长度为4K字节
 */
public class SignRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 需要签名的数据 Base64-encoded binary data object
     */
    private String plaintext;

    /**
     * 密钥ID
     * Required:true
     */
    @Required
    private String keyId;


    /**
     * get 需要签名的数据 Base64-encoded binary data object
     *
     * @return
     */
    public String getPlaintext() {
        return plaintext;
    }

    /**
     * set 需要签名的数据 Base64-encoded binary data object
     *
     * @param plaintext
     */
    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    /**
     * get 密钥ID
     *
     * @return
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * set 密钥ID
     *
     * @param keyId
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }


    /**
     * set 需要签名的数据 Base64-encoded binary data object
     *
     * @param plaintext
     */
    public SignRequest plaintext(String plaintext) {
        this.plaintext = plaintext;
        return this;
    }

    /**
     * set 密钥ID
     *
     * @param keyId
     */
    public SignRequest keyId(String keyId) {
        this.keyId = keyId;
        return this;
    }


}
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

package com.jdcloud.sdk.service.ssl.model;

import java.util.List;
import java.util.ArrayList;

/**
 * certDescDetail
 */
public class CertDescDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 证书Id
     */
    private String certId;

    /**
     * 证书名称
     */
    private String certName;

    /**
     * 绑定域名
     */
    private String commonName;

    /**
     * 证书类型
     */
    private String certType;

    /**
     * 签发者
     */
    private String issuer;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 域名
     */
    private List<String> dnsNames;

    /**
     * 对私钥文件使用sha256算法计算的摘要信息
     */
    private String digest;

    /**
     * 绑定信息的总数量
     */
    private Integer totalCount;

    /**
     * 证书关联信息
     */
    private List<CertBindInfo> usedBy;


    /**
     * get 证书Id
     *
     * @return
     */
    public String getCertId() {
        return certId;
    }

    /**
     * set 证书Id
     *
     * @param certId
     */
    public void setCertId(String certId) {
        this.certId = certId;
    }

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
     * get 绑定域名
     *
     * @return
     */
    public String getCommonName() {
        return commonName;
    }

    /**
     * set 绑定域名
     *
     * @param commonName
     */
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * get 证书类型
     *
     * @return
     */
    public String getCertType() {
        return certType;
    }

    /**
     * set 证书类型
     *
     * @param certType
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * get 签发者
     *
     * @return
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * set 签发者
     *
     * @param issuer
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * get 开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 域名
     *
     * @return
     */
    public List<String> getDnsNames() {
        return dnsNames;
    }

    /**
     * set 域名
     *
     * @param dnsNames
     */
    public void setDnsNames(List<String> dnsNames) {
        this.dnsNames = dnsNames;
    }

    /**
     * get 对私钥文件使用sha256算法计算的摘要信息
     *
     * @return
     */
    public String getDigest() {
        return digest;
    }

    /**
     * set 对私钥文件使用sha256算法计算的摘要信息
     *
     * @param digest
     */
    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * get 绑定信息的总数量
     *
     * @return
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * set 绑定信息的总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * get 证书关联信息
     *
     * @return
     */
    public List<CertBindInfo> getUsedBy() {
        return usedBy;
    }

    /**
     * set 证书关联信息
     *
     * @param usedBy
     */
    public void setUsedBy(List<CertBindInfo> usedBy) {
        this.usedBy = usedBy;
    }


    /**
     * set 证书Id
     *
     * @param certId
     */
    public CertDescDetail certId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * set 证书名称
     *
     * @param certName
     */
    public CertDescDetail certName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * set 绑定域名
     *
     * @param commonName
     */
    public CertDescDetail commonName(String commonName) {
        this.commonName = commonName;
        return this;
    }

    /**
     * set 证书类型
     *
     * @param certType
     */
    public CertDescDetail certType(String certType) {
        this.certType = certType;
        return this;
    }

    /**
     * set 签发者
     *
     * @param issuer
     */
    public CertDescDetail issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * set 开始时间
     *
     * @param startTime
     */
    public CertDescDetail startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间
     *
     * @param endTime
     */
    public CertDescDetail endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 域名
     *
     * @param dnsNames
     */
    public CertDescDetail dnsNames(List<String> dnsNames) {
        this.dnsNames = dnsNames;
        return this;
    }

    /**
     * set 对私钥文件使用sha256算法计算的摘要信息
     *
     * @param digest
     */
    public CertDescDetail digest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * set 绑定信息的总数量
     *
     * @param totalCount
     */
    public CertDescDetail totalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set 证书关联信息
     *
     * @param usedBy
     */
    public CertDescDetail usedBy(List<CertBindInfo> usedBy) {
        this.usedBy = usedBy;
        return this;
    }


    /**
     * add item to 域名
     *
     * @param dnsName
     */
    public void addDnsName(String dnsName) {
        if (this.dnsNames == null) {
            this.dnsNames = new ArrayList<>();
        }
        this.dnsNames.add(dnsName);
    }

    /**
     * add item to 证书关联信息
     *
     * @param usedBy
     */
    public void addUsedBy(CertBindInfo usedBy) {
        if (this.usedBy == null) {
            this.usedBy = new ArrayList<>();
        }
        this.usedBy.add(usedBy);
    }

}
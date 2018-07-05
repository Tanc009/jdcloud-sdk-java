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

package com.jdcloud.sdk.service.baseanti.model;


/**
 * ipResourceInfo
 */
public class IpResourceInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公网IP
     */
    private String ip;

    /**
     * 0-&gt;安全 1-&gt;清洗 2-&gt;黑洞
     */
    private Integer safeStatus;

    /**
     * 地域，cn-north-1、cn-south-1、cn-east-1、cn-east-2
     */
    private String region;

    /**
     * 黑洞阈值，单位bps
     */
    private Long blackHoleThreshold;

    /**
     * 触发清洗的流量速率，单位bps
     */
    private Long cleanThresholdBps;

    /**
     * 触发清洗的包速率，单位pps
     */
    private Long cleanThresholdPps;


    /**
     * get 公网IP
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 公网IP
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 0-&gt;安全 1-&gt;清洗 2-&gt;黑洞
     *
     * @return
     */
    public Integer getSafeStatus() {
        return safeStatus;
    }

    /**
     * set 0-&gt;安全 1-&gt;清洗 2-&gt;黑洞
     *
     * @param safeStatus
     */
    public void setSafeStatus(Integer safeStatus) {
        this.safeStatus = safeStatus;
    }

    /**
     * get 地域，cn-north-1、cn-south-1、cn-east-1、cn-east-2
     *
     * @return
     */
    public String getRegion() {
        return region;
    }

    /**
     * set 地域，cn-north-1、cn-south-1、cn-east-1、cn-east-2
     *
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * get 黑洞阈值，单位bps
     *
     * @return
     */
    public Long getBlackHoleThreshold() {
        return blackHoleThreshold;
    }

    /**
     * set 黑洞阈值，单位bps
     *
     * @param blackHoleThreshold
     */
    public void setBlackHoleThreshold(Long blackHoleThreshold) {
        this.blackHoleThreshold = blackHoleThreshold;
    }

    /**
     * get 触发清洗的流量速率，单位bps
     *
     * @return
     */
    public Long getCleanThresholdBps() {
        return cleanThresholdBps;
    }

    /**
     * set 触发清洗的流量速率，单位bps
     *
     * @param cleanThresholdBps
     */
    public void setCleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
    }

    /**
     * get 触发清洗的包速率，单位pps
     *
     * @return
     */
    public Long getCleanThresholdPps() {
        return cleanThresholdPps;
    }

    /**
     * set 触发清洗的包速率，单位pps
     *
     * @param cleanThresholdPps
     */
    public void setCleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
    }


    /**
     * set 公网IP
     *
     * @param ip
     */
    public IpResourceInfo ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 0-&gt;安全 1-&gt;清洗 2-&gt;黑洞
     *
     * @param safeStatus
     */
    public IpResourceInfo safeStatus(Integer safeStatus) {
        this.safeStatus = safeStatus;
        return this;
    }

    /**
     * set 地域，cn-north-1、cn-south-1、cn-east-1、cn-east-2
     *
     * @param region
     */
    public IpResourceInfo region(String region) {
        this.region = region;
        return this;
    }

    /**
     * set 黑洞阈值，单位bps
     *
     * @param blackHoleThreshold
     */
    public IpResourceInfo blackHoleThreshold(Long blackHoleThreshold) {
        this.blackHoleThreshold = blackHoleThreshold;
        return this;
    }

    /**
     * set 触发清洗的流量速率，单位bps
     *
     * @param cleanThresholdBps
     */
    public IpResourceInfo cleanThresholdBps(Long cleanThresholdBps) {
        this.cleanThresholdBps = cleanThresholdBps;
        return this;
    }

    /**
     * set 触发清洗的包速率，单位pps
     *
     * @param cleanThresholdPps
     */
    public IpResourceInfo cleanThresholdPps(Long cleanThresholdPps) {
        this.cleanThresholdPps = cleanThresholdPps;
        return this;
    }


}
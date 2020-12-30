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

package com.jdcloud.sdk.service.captcha.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * tactics
 */
public class Tactics  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 场景id
     * Required:true
     */
    @Required
    private Long sceneId;

    /**
     * 所属应用id
     * Required:true
     */
    @Required
    private Long appId;

    /**
     * 策略类型：1 智能组合,2过载保护,3自有策略
     */
    private Integer tacticsType;

    /**
     * 可疑请求配置
     */
    private RiskConfig suspiciousRiskConfig;

    /**
     * 问题请求配置
     */
    private RiskConfig abandonRiskConfig;


    /**
     * get 场景id
     *
     * @return
     */
    public Long getSceneId() {
        return sceneId;
    }

    /**
     * set 场景id
     *
     * @param sceneId
     */
    public void setSceneId(Long sceneId) {
        this.sceneId = sceneId;
    }

    /**
     * get 所属应用id
     *
     * @return
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * set 所属应用id
     *
     * @param appId
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * get 策略类型：1 智能组合,2过载保护,3自有策略
     *
     * @return
     */
    public Integer getTacticsType() {
        return tacticsType;
    }

    /**
     * set 策略类型：1 智能组合,2过载保护,3自有策略
     *
     * @param tacticsType
     */
    public void setTacticsType(Integer tacticsType) {
        this.tacticsType = tacticsType;
    }

    /**
     * get 可疑请求配置
     *
     * @return
     */
    public RiskConfig getSuspiciousRiskConfig() {
        return suspiciousRiskConfig;
    }

    /**
     * set 可疑请求配置
     *
     * @param suspiciousRiskConfig
     */
    public void setSuspiciousRiskConfig(RiskConfig suspiciousRiskConfig) {
        this.suspiciousRiskConfig = suspiciousRiskConfig;
    }

    /**
     * get 问题请求配置
     *
     * @return
     */
    public RiskConfig getAbandonRiskConfig() {
        return abandonRiskConfig;
    }

    /**
     * set 问题请求配置
     *
     * @param abandonRiskConfig
     */
    public void setAbandonRiskConfig(RiskConfig abandonRiskConfig) {
        this.abandonRiskConfig = abandonRiskConfig;
    }


    /**
     * set 场景id
     *
     * @param sceneId
     */
    public Tactics sceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /**
     * set 所属应用id
     *
     * @param appId
     */
    public Tactics appId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 策略类型：1 智能组合,2过载保护,3自有策略
     *
     * @param tacticsType
     */
    public Tactics tacticsType(Integer tacticsType) {
        this.tacticsType = tacticsType;
        return this;
    }

    /**
     * set 可疑请求配置
     *
     * @param suspiciousRiskConfig
     */
    public Tactics suspiciousRiskConfig(RiskConfig suspiciousRiskConfig) {
        this.suspiciousRiskConfig = suspiciousRiskConfig;
        return this;
    }

    /**
     * set 问题请求配置
     *
     * @param abandonRiskConfig
     */
    public Tactics abandonRiskConfig(RiskConfig abandonRiskConfig) {
        this.abandonRiskConfig = abandonRiskConfig;
        return this;
    }


}
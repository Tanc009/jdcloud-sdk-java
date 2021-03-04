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
 * scene
 */
public class Scene  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 场景id,更新时必填
     */
    private Long sceneId;

    /**
     * 场景密钥
     */
    private String sceneSecret;

    /**
     * 所属应用id
     * Required:true
     */
    @Required
    private Long appId;

    /**
     * 所属应用名称
     */
    private String appName;

    /**
     * 场景名称
     * Required:true
     */
    @Required
    private String sceneName;

    /**
     * 场景类型：account：账号场景（登录、注册等）activity：活动场景（秒杀、领券等）content：内容场景（发帖评论、签到投票等）other：其它
     * Required:true
     */
    @Required
    private String sceneType;

    /**
     * 平均qps
     * Required:true
     */
    @Required
    private Integer sceneAvgQps;

    /**
     * 高峰期qps
     * Required:true
     */
    @Required
    private Integer sceneMaxQps;

    /**
     * 场景描述
     */
    private String description;

    /**
     * 创建时间
     */
    private String createTime;


    /**
     * get 场景id,更新时必填
     *
     * @return
     */
    public Long getSceneId() {
        return sceneId;
    }

    /**
     * set 场景id,更新时必填
     *
     * @param sceneId
     */
    public void setSceneId(Long sceneId) {
        this.sceneId = sceneId;
    }

    /**
     * get 场景密钥
     *
     * @return
     */
    public String getSceneSecret() {
        return sceneSecret;
    }

    /**
     * set 场景密钥
     *
     * @param sceneSecret
     */
    public void setSceneSecret(String sceneSecret) {
        this.sceneSecret = sceneSecret;
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
     * get 所属应用名称
     *
     * @return
     */
    public String getAppName() {
        return appName;
    }

    /**
     * set 所属应用名称
     *
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * get 场景名称
     *
     * @return
     */
    public String getSceneName() {
        return sceneName;
    }

    /**
     * set 场景名称
     *
     * @param sceneName
     */
    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    /**
     * get 场景类型：account：账号场景（登录、注册等）activity：活动场景（秒杀、领券等）content：内容场景（发帖评论、签到投票等）other：其它
     *
     * @return
     */
    public String getSceneType() {
        return sceneType;
    }

    /**
     * set 场景类型：account：账号场景（登录、注册等）activity：活动场景（秒杀、领券等）content：内容场景（发帖评论、签到投票等）other：其它
     *
     * @param sceneType
     */
    public void setSceneType(String sceneType) {
        this.sceneType = sceneType;
    }

    /**
     * get 平均qps
     *
     * @return
     */
    public Integer getSceneAvgQps() {
        return sceneAvgQps;
    }

    /**
     * set 平均qps
     *
     * @param sceneAvgQps
     */
    public void setSceneAvgQps(Integer sceneAvgQps) {
        this.sceneAvgQps = sceneAvgQps;
    }

    /**
     * get 高峰期qps
     *
     * @return
     */
    public Integer getSceneMaxQps() {
        return sceneMaxQps;
    }

    /**
     * set 高峰期qps
     *
     * @param sceneMaxQps
     */
    public void setSceneMaxQps(Integer sceneMaxQps) {
        this.sceneMaxQps = sceneMaxQps;
    }

    /**
     * get 场景描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 场景描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 场景id,更新时必填
     *
     * @param sceneId
     */
    public Scene sceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /**
     * set 场景密钥
     *
     * @param sceneSecret
     */
    public Scene sceneSecret(String sceneSecret) {
        this.sceneSecret = sceneSecret;
        return this;
    }

    /**
     * set 所属应用id
     *
     * @param appId
     */
    public Scene appId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 所属应用名称
     *
     * @param appName
     */
    public Scene appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * set 场景名称
     *
     * @param sceneName
     */
    public Scene sceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }

    /**
     * set 场景类型：account：账号场景（登录、注册等）activity：活动场景（秒杀、领券等）content：内容场景（发帖评论、签到投票等）other：其它
     *
     * @param sceneType
     */
    public Scene sceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }

    /**
     * set 平均qps
     *
     * @param sceneAvgQps
     */
    public Scene sceneAvgQps(Integer sceneAvgQps) {
        this.sceneAvgQps = sceneAvgQps;
        return this;
    }

    /**
     * set 高峰期qps
     *
     * @param sceneMaxQps
     */
    public Scene sceneMaxQps(Integer sceneMaxQps) {
        this.sceneMaxQps = sceneMaxQps;
        return this;
    }

    /**
     * set 场景描述
     *
     * @param description
     */
    public Scene description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public Scene createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}
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
 * JrtcRoom
 * 房间号管理接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.openjrtc.model;

import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 创建房间

 */
public class CreateRoomResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 房间ID
     */
    private Long roomId;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * appId
     */
    private String appId;

    /**
     * 用户ID(创建者ID)
     */
    private Long peerId;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;


    /**
     * get 房间ID
     *
     * @return
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * set 房间ID
     *
     * @param roomId
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * get 房间名称
     *
     * @return
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * set 房间名称
     *
     * @param roomName
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * get appId
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set appId
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 用户ID(创建者ID)
     *
     * @return
     */
    public Long getPeerId() {
        return peerId;
    }

    /**
     * set 用户ID(创建者ID)
     *
     * @param peerId
     */
    public void setPeerId(Long peerId) {
        this.peerId = peerId;
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
     * get 更新时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * set 房间ID
     *
     * @param roomId
     */
    public CreateRoomResult roomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * set 房间名称
     *
     * @param roomName
     */
    public CreateRoomResult roomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * set appId
     *
     * @param appId
     */
    public CreateRoomResult appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 用户ID(创建者ID)
     *
     * @param peerId
     */
    public CreateRoomResult peerId(Long peerId) {
        this.peerId = peerId;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public CreateRoomResult createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public CreateRoomResult updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }


}
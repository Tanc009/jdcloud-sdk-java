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

package com.jdcloud.sdk.service.ydsms.model;

import java.util.List;
import java.util.ArrayList;

/**
 * listSmsSendOverviewVO
 */
public class ListSmsSendOverviewVO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * pin
     */
    private String pin;

    /**
     * 应用id
     */
    private String appId;

    /**
     * 短信发送记录
     */
    private List<SendOverviewVO> sendOverviewVOList;


    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 应用id
     *
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * set 应用id
     *
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * get 短信发送记录
     *
     * @return
     */
    public List<SendOverviewVO> getSendOverviewVOList() {
        return sendOverviewVOList;
    }

    /**
     * set 短信发送记录
     *
     * @param sendOverviewVOList
     */
    public void setSendOverviewVOList(List<SendOverviewVO> sendOverviewVOList) {
        this.sendOverviewVOList = sendOverviewVOList;
    }


    /**
     * set pin
     *
     * @param pin
     */
    public ListSmsSendOverviewVO pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 应用id
     *
     * @param appId
     */
    public ListSmsSendOverviewVO appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 短信发送记录
     *
     * @param sendOverviewVOList
     */
    public ListSmsSendOverviewVO sendOverviewVOList(List<SendOverviewVO> sendOverviewVOList) {
        this.sendOverviewVOList = sendOverviewVOList;
        return this;
    }


    /**
     * add item to 短信发送记录
     *
     * @param sendOverviewVOList
     */
    public void addSendOverviewVOList(SendOverviewVO sendOverviewVOList) {
        if (this.sendOverviewVOList == null) {
            this.sendOverviewVOList = new ArrayList<>();
        }
        this.sendOverviewVOList.add(sendOverviewVOList);
    }

}
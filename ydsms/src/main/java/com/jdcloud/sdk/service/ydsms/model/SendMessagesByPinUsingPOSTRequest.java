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
 * 云鼎短信服务-发送短信相关接口
 * 云鼎短信服务-发送短信相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ydsms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 根据pin发送短信
 */
public class SendMessagesByPinUsingPOSTRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 应用id
     * Required:true
     */
    @Required
    private String appId;

    /**
     * 签名id
     * Required:true
     */
    @Required
    private String signId;

    /**
     * 模板id
     * Required:true
     */
    @Required
    private String templateId;

    /**
     * 用户pin
     * Required:true
     */
    @Required
    private String pin;

    /**
     * 短信模板变量对应的数据值
     */
    private List<String> params;


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
     * get 签名id
     *
     * @return
     */
    public String getSignId() {
        return signId;
    }

    /**
     * set 签名id
     *
     * @param signId
     */
    public void setSignId(String signId) {
        this.signId = signId;
    }

    /**
     * get 模板id
     *
     * @return
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * set 模板id
     *
     * @param templateId
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * get 用户pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get 短信模板变量对应的数据值
     *
     * @return
     */
    public List<String> getParams() {
        return params;
    }

    /**
     * set 短信模板变量对应的数据值
     *
     * @param params
     */
    public void setParams(List<String> params) {
        this.params = params;
    }


    /**
     * set 应用id
     *
     * @param appId
     */
    public SendMessagesByPinUsingPOSTRequest appId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * set 签名id
     *
     * @param signId
     */
    public SendMessagesByPinUsingPOSTRequest signId(String signId) {
        this.signId = signId;
        return this;
    }

    /**
     * set 模板id
     *
     * @param templateId
     */
    public SendMessagesByPinUsingPOSTRequest templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * set 用户pin
     *
     * @param pin
     */
    public SendMessagesByPinUsingPOSTRequest pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set 短信模板变量对应的数据值
     *
     * @param params
     */
    public SendMessagesByPinUsingPOSTRequest params(List<String> params) {
        this.params = params;
        return this;
    }


    /**
     * add item to 短信模板变量对应的数据值
     *
     * @param param
     */
    public void addParam(String param) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(param);
    }

}
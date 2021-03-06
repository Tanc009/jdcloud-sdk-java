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
 * 云鼎短信服务-套餐包相关接口
 * 云鼎短信服务-套餐包相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.ydsms.model;

import com.jdcloud.sdk.service.ydsms.model.SmsPackageVO;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询套餐包详情
 */
public class GetSmsPackageByIdUsingGETResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * smsPackageVO
     */
    private SmsPackageVO smsPackageVO;


    /**
     * get smsPackageVO
     *
     * @return
     */
    public SmsPackageVO getSmsPackageVO() {
        return smsPackageVO;
    }

    /**
     * set smsPackageVO
     *
     * @param smsPackageVO
     */
    public void setSmsPackageVO(SmsPackageVO smsPackageVO) {
        this.smsPackageVO = smsPackageVO;
    }


    /**
     * set smsPackageVO
     *
     * @param smsPackageVO
     */
    public GetSmsPackageByIdUsingGETResult smsPackageVO(SmsPackageVO smsPackageVO) {
        this.smsPackageVO = smsPackageVO;
        return this;
    }


}
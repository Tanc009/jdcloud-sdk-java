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

package com.jdcloud.sdk.service.sop.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * verificationCodeInfo
 */
public class VerificationCodeInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作action serviceName:actionName
     * Required:true
     */
    @Required
    private String action;

    /**
     * 验证dcd 方式：mobile-1  email-2
     * Required:true
     */
    @Required
    private Integer type;


    /**
     * get 操作action serviceName:actionName
     *
     * @return
     */
    public String getAction() {
        return action;
    }

    /**
     * set 操作action serviceName:actionName
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * get 验证dcd 方式：mobile-1  email-2
     *
     * @return
     */
    public Integer getType() {
        return type;
    }

    /**
     * set 验证dcd 方式：mobile-1  email-2
     *
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }


    /**
     * set 操作action serviceName:actionName
     *
     * @param action
     */
    public VerificationCodeInfo action(String action) {
        this.action = action;
        return this;
    }

    /**
     * set 验证dcd 方式：mobile-1  email-2
     *
     * @param type
     */
    public VerificationCodeInfo type(Integer type) {
        this.type = type;
        return this;
    }


}
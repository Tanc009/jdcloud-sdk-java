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


/**
 * captcha
 */
public class Captcha  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 验证码名称
     */
    private String name;

    /**
     * tp值
     */
    private Integer tp;


    /**
     * get 验证码名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 验证码名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get tp值
     *
     * @return
     */
    public Integer getTp() {
        return tp;
    }

    /**
     * set tp值
     *
     * @param tp
     */
    public void setTp(Integer tp) {
        this.tp = tp;
    }


    /**
     * set 验证码名称
     *
     * @param name
     */
    public Captcha name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set tp值
     *
     * @param tp
     */
    public Captcha tp(Integer tp) {
        this.tp = tp;
        return this;
    }


}
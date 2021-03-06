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

package com.jdcloud.sdk.service.asset.model;


/**
 * bankInfoVo
 */
public class BankInfoVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 银行代码
     */
    private String key;

    /**
     * 是否可用：1-可用；0-不可用
     */
    private String value;

    /**
     * 银行描述
     */
    private String description;


    /**
     * get 银行代码
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set 银行代码
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * get 是否可用：1-可用；0-不可用
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set 是否可用：1-可用；0-不可用
     *
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * get 银行描述
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 银行描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * set 银行代码
     *
     * @param key
     */
    public BankInfoVo key(String key) {
        this.key = key;
        return this;
    }

    /**
     * set 是否可用：1-可用；0-不可用
     *
     * @param value
     */
    public BankInfoVo value(String value) {
        this.value = value;
        return this;
    }

    /**
     * set 银行描述
     *
     * @param description
     */
    public BankInfoVo description(String description) {
        this.description = description;
        return this;
    }


}
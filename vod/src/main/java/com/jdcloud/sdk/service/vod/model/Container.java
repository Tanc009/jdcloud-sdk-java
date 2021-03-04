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

package com.jdcloud.sdk.service.vod.model;


/**
 * 转码封装配置
 */
public class Container  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 封装格式
     */
    private String format;


    /**
     * get 封装格式
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * set 封装格式
     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }


    /**
     * set 封装格式
     *
     * @param format
     */
    public Container format(String format) {
        this.format = format;
        return this;
    }


}
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

package com.jdcloud.sdk.service.censor.model;


/**
 * dataConsumeStatement
 */
public class DataConsumeStatement  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 时间, yyyy-mm-dd hh:mm:ss格式
     */
    private String time;

    /**
     * data
     */
    private DataConsumeData data;


    /**
     * get 时间, yyyy-mm-dd hh:mm:ss格式
     *
     * @return
     */
    public String getTime() {
        return time;
    }

    /**
     * set 时间, yyyy-mm-dd hh:mm:ss格式
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * get data
     *
     * @return
     */
    public DataConsumeData getData() {
        return data;
    }

    /**
     * set data
     *
     * @param data
     */
    public void setData(DataConsumeData data) {
        this.data = data;
    }


    /**
     * set 时间, yyyy-mm-dd hh:mm:ss格式
     *
     * @param time
     */
    public DataConsumeStatement time(String time) {
        this.time = time;
        return this;
    }

    /**
     * set data
     *
     * @param data
     */
    public DataConsumeStatement data(DataConsumeData data) {
        this.data = data;
        return this;
    }


}
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

package com.jdcloud.sdk.service.monitor.model;


/**
 * subNodeKeys
 */
public class SubNodeKeys  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 该key所在层级
     */
    private Long index;

    /**
     * key
     */
    private String key;


    /**
     * get 该key所在层级
     *
     * @return
     */
    public Long getIndex() {
        return index;
    }

    /**
     * set 该key所在层级
     *
     * @param index
     */
    public void setIndex(Long index) {
        this.index = index;
    }

    /**
     * get key
     *
     * @return
     */
    public String getKey() {
        return key;
    }

    /**
     * set key
     *
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * set 该key所在层级
     *
     * @param index
     */
    public SubNodeKeys index(Long index) {
        this.index = index;
        return this;
    }

    /**
     * set key
     *
     * @param key
     */
    public SubNodeKeys key(String key) {
        this.key = key;
        return this;
    }


}
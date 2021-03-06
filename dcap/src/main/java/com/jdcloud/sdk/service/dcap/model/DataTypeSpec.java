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

package com.jdcloud.sdk.service.dcap.model;


/**
 * dataTypeSpec
 */
public class DataTypeSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 敏感数据类型名称
     */
    private String typeName;

    /**
     * 敏感数据分级ID
     */
    private Integer levelId;


    /**
     * get 敏感数据类型名称
     *
     * @return
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * set 敏感数据类型名称
     *
     * @param typeName
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * get 敏感数据分级ID
     *
     * @return
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * set 敏感数据分级ID
     *
     * @param levelId
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }


    /**
     * set 敏感数据类型名称
     *
     * @param typeName
     */
    public DataTypeSpec typeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * set 敏感数据分级ID
     *
     * @param levelId
     */
    public DataTypeSpec levelId(Integer levelId) {
        this.levelId = levelId;
        return this;
    }


}
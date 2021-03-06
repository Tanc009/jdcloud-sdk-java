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
 * fieldTagDesc
 */
public class FieldTagDesc  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 敏感数据级别
     */
    private String levelTag;

    /**
     * 敏感数据类型名称
     */
    private String typeName;

    /**
     * 敏感数据类型ID
     */
    private String typeId;


    /**
     * get 敏感数据级别
     *
     * @return
     */
    public String getLevelTag() {
        return levelTag;
    }

    /**
     * set 敏感数据级别
     *
     * @param levelTag
     */
    public void setLevelTag(String levelTag) {
        this.levelTag = levelTag;
    }

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
     * get 敏感数据类型ID
     *
     * @return
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * set 敏感数据类型ID
     *
     * @param typeId
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }


    /**
     * set 敏感数据级别
     *
     * @param levelTag
     */
    public FieldTagDesc levelTag(String levelTag) {
        this.levelTag = levelTag;
        return this;
    }

    /**
     * set 敏感数据类型名称
     *
     * @param typeName
     */
    public FieldTagDesc typeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * set 敏感数据类型ID
     *
     * @param typeId
     */
    public FieldTagDesc typeId(String typeId) {
        this.typeId = typeId;
        return this;
    }


}
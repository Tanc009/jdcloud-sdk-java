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
 * Classification
 * 敏感数据保护-数据分级分类
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dcap.model;

import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 删除敏感数据分类
 */
public class DeleteCategoryRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类 ID
     * Required:true
     */
    @Required
    private Integer categoryId;


    /**
     * get 分类 ID
     *
     * @return
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * set 分类 ID
     *
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * set 分类 ID
     *
     * @param categoryId
     */
    public DeleteCategoryRequest categoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }


}
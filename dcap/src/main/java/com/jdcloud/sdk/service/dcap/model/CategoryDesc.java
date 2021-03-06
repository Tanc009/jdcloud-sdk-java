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
 * categoryDesc
 */
public class CategoryDesc  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 敏感数据分类ID
     */
    private Integer categoryId;

    /**
     * 敏感数据分类描述
     */
    private String categoryName;


    /**
     * get 敏感数据分类ID
     *
     * @return
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * set 敏感数据分类ID
     *
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * get 敏感数据分类描述
     *
     * @return
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * set 敏感数据分类描述
     *
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    /**
     * set 敏感数据分类ID
     *
     * @param categoryId
     */
    public CategoryDesc categoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * set 敏感数据分类描述
     *
     * @param categoryName
     */
    public CategoryDesc categoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }


}
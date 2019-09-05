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
 * Quality Detection Template
 * 质量检测模板管理相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vod.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vod.model.QualityDetectionTemplateObject;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询质测模板列表。

 */
public class ListQualityDetectionTemplatesResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页码
     */
    private Integer pageNumber;

    /**
     * 每页数量
     */
    private Integer pageSize;

    /**
     * 查询总数
     */
    private Integer totalElements;

    /**
     * 总页数
     */
    private Integer totalPages;

    /**
     * 分页内容
     */
    private List<QualityDetectionTemplateObject> content;


    /**
     * get 当前页码
     *
     * @return
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * get 每页数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 查询总数
     *
     * @return
     */
    public Integer getTotalElements() {
        return totalElements;
    }

    /**
     * set 查询总数
     *
     * @param totalElements
     */
    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    /**
     * get 总页数
     *
     * @return
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * set 总页数
     *
     * @param totalPages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * get 分页内容
     *
     * @return
     */
    public List<QualityDetectionTemplateObject> getContent() {
        return content;
    }

    /**
     * set 分页内容
     *
     * @param content
     */
    public void setContent(List<QualityDetectionTemplateObject> content) {
        this.content = content;
    }


    /**
     * set 当前页码
     *
     * @param pageNumber
     */
    public ListQualityDetectionTemplatesResult pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * set 每页数量
     *
     * @param pageSize
     */
    public ListQualityDetectionTemplatesResult pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 查询总数
     *
     * @param totalElements
     */
    public ListQualityDetectionTemplatesResult totalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * set 总页数
     *
     * @param totalPages
     */
    public ListQualityDetectionTemplatesResult totalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * set 分页内容
     *
     * @param content
     */
    public ListQualityDetectionTemplatesResult content(List<QualityDetectionTemplateObject> content) {
        this.content = content;
        return this;
    }


    /**
     * add item to 分页内容
     *
     * @param content
     */
    public void addContent(QualityDetectionTemplateObject content) {
        if (this.content == null) {
            this.content = new ArrayList<>();
        }
        this.content.add(content);
    }

}
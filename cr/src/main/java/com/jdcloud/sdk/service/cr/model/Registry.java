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

package com.jdcloud.sdk.service.cr.model;


/**
 * 注册表详情数据结构
 */
public class Registry  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 注册表名称，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     */
    private String name;

    /**
     * registry endporint url
     */
    private String registryUri;

    /**
     * 注册表描述，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     */
    private String description;

    /**
     * regsitry 使用的总存储空间 单位 (MB)
     */
    private Double totalSpaceUsedMB;

    /**
     * registry 的创建时间
     */
    private String createTime;


    /**
     * get 注册表名称，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 注册表名称，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get registry endporint url
     *
     * @return
     */
    public String getRegistryUri() {
        return registryUri;
    }

    /**
     * set registry endporint url
     *
     * @param registryUri
     */
    public void setRegistryUri(String registryUri) {
        this.registryUri = registryUri;
    }

    /**
     * get 注册表描述，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 注册表描述，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get regsitry 使用的总存储空间 单位 (MB)
     *
     * @return
     */
    public Double getTotalSpaceUsedMB() {
        return totalSpaceUsedMB;
    }

    /**
     * set regsitry 使用的总存储空间 单位 (MB)
     *
     * @param totalSpaceUsedMB
     */
    public void setTotalSpaceUsedMB(Double totalSpaceUsedMB) {
        this.totalSpaceUsedMB = totalSpaceUsedMB;
    }

    /**
     * get registry 的创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set registry 的创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }


    /**
     * set 注册表名称，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param name
     */
    public Registry name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set registry endporint url
     *
     * @param registryUri
     */
    public Registry registryUri(String registryUri) {
        this.registryUri = registryUri;
        return this;
    }

    /**
     * set 注册表描述，&lt;a href&#x3D;&quot;https://www.jdcloud.com/help/detail/3870/isCatalog/1&quot;&gt;参考公共参数规范&lt;/a&gt;。
     *
     * @param description
     */
    public Registry description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set regsitry 使用的总存储空间 单位 (MB)
     *
     * @param totalSpaceUsedMB
     */
    public Registry totalSpaceUsedMB(Double totalSpaceUsedMB) {
        this.totalSpaceUsedMB = totalSpaceUsedMB;
        return this;
    }

    /**
     * set registry 的创建时间
     *
     * @param createTime
     */
    public Registry createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


}
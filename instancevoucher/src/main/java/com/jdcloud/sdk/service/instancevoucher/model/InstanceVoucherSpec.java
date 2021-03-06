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

package com.jdcloud.sdk.service.instancevoucher.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 实例抵扣券参数
 */
public class InstanceVoucherSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 实例抵扣券名称，支持中文、数字、大小写字母及英文下划线“_”及中划线“-”，不超过32个字符
     * Required:true
     */
    @Required
    private String name;

    /**
     * 描述，不超过256个字符
     */
    private String description;

    /**
     * 产品类型 支持[vm, nativecontainer, pod]
     * Required:true
     */
    @Required
    private String resourceType;

    /**
     * 资源分配方式 支持[nonReserved]
     * Required:true
     */
    @Required
    private String reservedType;

    /**
     * 非资源预留型实例抵扣券参数，reservedType 为 nonReserved 时生效
     */
    private NonReservedVoucherSpec nonReservedVoucherSpec;

    /**
     * 计费模式
     */
    private ChargeSpec charge;


    /**
     * get 实例抵扣券名称，支持中文、数字、大小写字母及英文下划线“_”及中划线“-”，不超过32个字符
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 实例抵扣券名称，支持中文、数字、大小写字母及英文下划线“_”及中划线“-”，不超过32个字符
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 描述，不超过256个字符
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述，不超过256个字符
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 产品类型 支持[vm, nativecontainer, pod]
     *
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * set 产品类型 支持[vm, nativecontainer, pod]
     *
     * @param resourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * get 资源分配方式 支持[nonReserved]
     *
     * @return
     */
    public String getReservedType() {
        return reservedType;
    }

    /**
     * set 资源分配方式 支持[nonReserved]
     *
     * @param reservedType
     */
    public void setReservedType(String reservedType) {
        this.reservedType = reservedType;
    }

    /**
     * get 非资源预留型实例抵扣券参数，reservedType 为 nonReserved 时生效
     *
     * @return
     */
    public NonReservedVoucherSpec getNonReservedVoucherSpec() {
        return nonReservedVoucherSpec;
    }

    /**
     * set 非资源预留型实例抵扣券参数，reservedType 为 nonReserved 时生效
     *
     * @param nonReservedVoucherSpec
     */
    public void setNonReservedVoucherSpec(NonReservedVoucherSpec nonReservedVoucherSpec) {
        this.nonReservedVoucherSpec = nonReservedVoucherSpec;
    }

    /**
     * get 计费模式
     *
     * @return
     */
    public ChargeSpec getCharge() {
        return charge;
    }

    /**
     * set 计费模式
     *
     * @param charge
     */
    public void setCharge(ChargeSpec charge) {
        this.charge = charge;
    }


    /**
     * set 实例抵扣券名称，支持中文、数字、大小写字母及英文下划线“_”及中划线“-”，不超过32个字符
     *
     * @param name
     */
    public InstanceVoucherSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 描述，不超过256个字符
     *
     * @param description
     */
    public InstanceVoucherSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * set 产品类型 支持[vm, nativecontainer, pod]
     *
     * @param resourceType
     */
    public InstanceVoucherSpec resourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * set 资源分配方式 支持[nonReserved]
     *
     * @param reservedType
     */
    public InstanceVoucherSpec reservedType(String reservedType) {
        this.reservedType = reservedType;
        return this;
    }

    /**
     * set 非资源预留型实例抵扣券参数，reservedType 为 nonReserved 时生效
     *
     * @param nonReservedVoucherSpec
     */
    public InstanceVoucherSpec nonReservedVoucherSpec(NonReservedVoucherSpec nonReservedVoucherSpec) {
        this.nonReservedVoucherSpec = nonReservedVoucherSpec;
        return this;
    }

    /**
     * set 计费模式
     *
     * @param charge
     */
    public InstanceVoucherSpec charge(ChargeSpec charge) {
        this.charge = charge;
        return this;
    }


}
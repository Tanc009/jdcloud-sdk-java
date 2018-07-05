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

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * instanceTemplateNetworkInterfaceAttachmentSpec
 */
public class InstanceTemplateNetworkInterfaceAttachmentSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 设备Index；主网卡的index必须为1；当前仅支持主网卡
     */
    private Integer deviceIndex;

    /**
     * 指明删除实例时是否删除网卡，默认true；当前只能是true
     */
    private Boolean autoDelete;

    /**
     * 网卡接口规范；此字段当前必填
     * Required:true
     */
    @Required
    private InstanceTemplateNetworkInterfaceSpec networkInterface;


    /**
     * get 设备Index；主网卡的index必须为1；当前仅支持主网卡
     *
     * @return
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }

    /**
     * set 设备Index；主网卡的index必须为1；当前仅支持主网卡
     *
     * @param deviceIndex
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }

    /**
     * get 指明删除实例时是否删除网卡，默认true；当前只能是true
     *
     * @return
     */
    public Boolean getAutoDelete() {
        return autoDelete;
    }

    /**
     * set 指明删除实例时是否删除网卡，默认true；当前只能是true
     *
     * @param autoDelete
     */
    public void setAutoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
    }

    /**
     * get 网卡接口规范；此字段当前必填
     *
     * @return
     */
    public InstanceTemplateNetworkInterfaceSpec getNetworkInterface() {
        return networkInterface;
    }

    /**
     * set 网卡接口规范；此字段当前必填
     *
     * @param networkInterface
     */
    public void setNetworkInterface(InstanceTemplateNetworkInterfaceSpec networkInterface) {
        this.networkInterface = networkInterface;
    }


    /**
     * set 设备Index；主网卡的index必须为1；当前仅支持主网卡
     *
     * @param deviceIndex
     */
    public InstanceTemplateNetworkInterfaceAttachmentSpec deviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * set 指明删除实例时是否删除网卡，默认true；当前只能是true
     *
     * @param autoDelete
     */
    public InstanceTemplateNetworkInterfaceAttachmentSpec autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }

    /**
     * set 网卡接口规范；此字段当前必填
     *
     * @param networkInterface
     */
    public InstanceTemplateNetworkInterfaceAttachmentSpec networkInterface(InstanceTemplateNetworkInterfaceSpec networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }


}
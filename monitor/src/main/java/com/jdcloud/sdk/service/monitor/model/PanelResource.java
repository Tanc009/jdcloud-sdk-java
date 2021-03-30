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

import com.jdcloud.sdk.annotation.Required;

/**
 * panelResource
 */
public class PanelResource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * region
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 资源id
     * Required:true
     */
    @Required
    private String resourceId;

    /**
     * 资源名称
     */
    private String resourceName;


    /**
     * get region
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set region
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 资源id
     *
     * @return
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * get 资源名称
     *
     * @return
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }


    /**
     * set region
     *
     * @param regionId
     */
    public PanelResource regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 资源id
     *
     * @param resourceId
     */
    public PanelResource resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * set 资源名称
     *
     * @param resourceName
     */
    public PanelResource resourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }


}
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
 * Cloud-Physical-Server
 * 云物理服务器弹性公网IP操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 申请弹性公网IP

 */
public class ApplyElasticIpsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * elasticIpIds
     */
    private List<String> elasticIpIds;


    /**
     * get elasticIpIds
     *
     * @return
     */
    public List<String> getElasticIpIds() {
        return elasticIpIds;
    }

    /**
     * set elasticIpIds
     *
     * @param elasticIpIds
     */
    public void setElasticIpIds(List<String> elasticIpIds) {
        this.elasticIpIds = elasticIpIds;
    }


    /**
     * set elasticIpIds
     *
     * @param elasticIpIds
     */
    public ApplyElasticIpsResult elasticIpIds(List<String> elasticIpIds) {
        this.elasticIpIds = elasticIpIds;
        return this;
    }


    /**
     * add item to elasticIpIds
     *
     * @param elasticIpId
     */
    public void addElasticIpId(String elasticIpId) {
        if (this.elasticIpIds == null) {
            this.elasticIpIds = new ArrayList<>();
        }
        this.elasticIpIds.add(elasticIpId);
    }

}
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
 * Peering-Connection
 * 对等连接相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vpc.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.vpc.model.VpcPeering;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 查询VpcPeering资源列表
 */
public class DescribeVpcPeeringsResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * vpcPeerings
     */
    private List<VpcPeering> vpcPeerings;

    /**
     * 总数量
     */
    private Number totalCount;


    /**
     * get vpcPeerings
     *
     * @return
     */
    public List<VpcPeering> getVpcPeerings() {
        return vpcPeerings;
    }

    /**
     * set vpcPeerings
     *
     * @param vpcPeerings
     */
    public void setVpcPeerings(List<VpcPeering> vpcPeerings) {
        this.vpcPeerings = vpcPeerings;
    }

    /**
     * get 总数量
     *
     * @return
     */
    public Number getTotalCount() {
        return totalCount;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public void setTotalCount(Number totalCount) {
        this.totalCount = totalCount;
    }


    /**
     * set vpcPeerings
     *
     * @param vpcPeerings
     */
    public DescribeVpcPeeringsResult vpcPeerings(List<VpcPeering> vpcPeerings) {
        this.vpcPeerings = vpcPeerings;
        return this;
    }

    /**
     * set 总数量
     *
     * @param totalCount
     */
    public DescribeVpcPeeringsResult totalCount(Number totalCount) {
        this.totalCount = totalCount;
        return this;
    }


    /**
     * add item to vpcPeerings
     *
     * @param vpcPeering
     */
    public void addVpcPeering(VpcPeering vpcPeering) {
        if (this.vpcPeerings == null) {
            this.vpcPeerings = new ArrayList<>();
        }
        this.vpcPeerings.add(vpcPeering);
    }

}
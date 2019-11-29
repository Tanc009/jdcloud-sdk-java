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
 * 服务节点相关接口
 * Openapi For JCLOUD cdn
 *
 * OpenAPI spec version: v1
 * Contact: pid-cdn@jd.com
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cdn.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 获取所有上层节点的ip
 */
public class GetAllUpperNodeIpListResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ipList
     */
    private List<String> ipList;


    /**
     * get ipList
     *
     * @return
     */
    public List<String> getIpList() {
        return ipList;
    }

    /**
     * set ipList
     *
     * @param ipList
     */
    public void setIpList(List<String> ipList) {
        this.ipList = ipList;
    }


    /**
     * set ipList
     *
     * @param ipList
     */
    public GetAllUpperNodeIpListResult ipList(List<String> ipList) {
        this.ipList = ipList;
        return this;
    }


    /**
     * add item to ipList
     *
     * @param ipList
     */
    public void addIpList(String ipList) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipList);
    }

}
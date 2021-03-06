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

package com.jdcloud.sdk.service.es.model;


/**
 * resource
 */
public class Resource  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 资源名称，即节点名称
     */
    private String resName;

    /**
     * 节点宿主机IP
     */
    private String hostIp;

    /**
     * 节点IP及端口
     */
    private String ipPort;


    /**
     * get 资源名称，即节点名称
     *
     * @return
     */
    public String getResName() {
        return resName;
    }

    /**
     * set 资源名称，即节点名称
     *
     * @param resName
     */
    public void setResName(String resName) {
        this.resName = resName;
    }

    /**
     * get 节点宿主机IP
     *
     * @return
     */
    public String getHostIp() {
        return hostIp;
    }

    /**
     * set 节点宿主机IP
     *
     * @param hostIp
     */
    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    /**
     * get 节点IP及端口
     *
     * @return
     */
    public String getIpPort() {
        return ipPort;
    }

    /**
     * set 节点IP及端口
     *
     * @param ipPort
     */
    public void setIpPort(String ipPort) {
        this.ipPort = ipPort;
    }


    /**
     * set 资源名称，即节点名称
     *
     * @param resName
     */
    public Resource resName(String resName) {
        this.resName = resName;
        return this;
    }

    /**
     * set 节点宿主机IP
     *
     * @param hostIp
     */
    public Resource hostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * set 节点IP及端口
     *
     * @param ipPort
     */
    public Resource ipPort(String ipPort) {
        this.ipPort = ipPort;
        return this;
    }


}
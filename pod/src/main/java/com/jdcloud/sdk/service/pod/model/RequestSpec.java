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

package com.jdcloud.sdk.service.pod.model;


/**
 * 容器必需的计算资源
 */
public class RequestSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 容器必需的计算资源，例：300m，1000m
     */
    private String cpu;

    /**
     * 容器使用计算资源上限，例：1024Mi，16384Mi
     */
    private String memoryMB;


    /**
     * get 容器必需的计算资源，例：300m，1000m
     *
     * @return
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * set 容器必需的计算资源，例：300m，1000m
     *
     * @param cpu
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * get 容器使用计算资源上限，例：1024Mi，16384Mi
     *
     * @return
     */
    public String getMemoryMB() {
        return memoryMB;
    }

    /**
     * set 容器使用计算资源上限，例：1024Mi，16384Mi
     *
     * @param memoryMB
     */
    public void setMemoryMB(String memoryMB) {
        this.memoryMB = memoryMB;
    }


    /**
     * set 容器必需的计算资源，例：300m，1000m
     *
     * @param cpu
     */
    public RequestSpec cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * set 容器使用计算资源上限，例：1024Mi，16384Mi
     *
     * @param memoryMB
     */
    public RequestSpec memoryMB(String memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }


}
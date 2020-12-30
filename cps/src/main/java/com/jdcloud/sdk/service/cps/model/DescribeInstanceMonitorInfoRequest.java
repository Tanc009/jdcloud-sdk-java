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
 * 云物理服务器操作相关的接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.cps.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.annotation.Required;
import com.jdcloud.sdk.service.JdcloudRequest;

/**
 * 查询云物理服务器监控信息
 */
public class DescribeInstanceMonitorInfoRequest extends JdcloudRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 开始时间的时间戳，格式：1562915166551
     */
    private Long startTime;

    /**
     * 结束时间的时间戳，格式：1562915166551
     */
    private Long endTime;

    /**
     * metric - 监控指标，精确匹配，支持多个，具体如下&lt;br/&gt;
cps.cpu.util - CPU使用率&lt;br/&gt;
cps.memory.util - 内存使用率&lt;br/&gt;
cps.memory.used - 内存使用量&lt;br/&gt;
cps.disk.used - 磁盘使用量&lt;br/&gt;
cps.disk.util - 磁盘使用率&lt;br/&gt;
cps.disk.bytes.read - 磁盘读流量&lt;br/&gt;
cps.disk.bytes.write - 磁盘写流量&lt;br/&gt;
cps.disk.counts.read - 磁盘读IOPS&lt;br/&gt;
cps.disk.counts.write - 磁盘写IOPS&lt;br/&gt;
cps.network.bytes.ingress - 网卡进流量&lt;br/&gt;
cps.network.bytes.egress - 网卡出流量&lt;br/&gt;
cps.network.packets.ingress - 网络进包量&lt;br/&gt;
cps.network.packets.egress - 网络出包量&lt;br/&gt;
cps.avg.load1 - CPU平均负载1min&lt;br/&gt;
cps.avg.load5 - CPU平均负载5min&lt;br/&gt;
cps.avg.load15 - CPU平均负载15min&lt;br/&gt;
cps.tcp.connect.total - TCP总连接数&lt;br/&gt;
cps.tcp.connect.established - TCP正常连接数&lt;br/&gt;
cps.process.total - 总进程数

     */
    private List<Filter> filters;

    /**
     * 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     * Required:true
     */
    @Required
    private String regionId;

    /**
     * 云物理服务器ID
     * Required:true
     */
    @Required
    private String instanceId;


    /**
     * get 开始时间的时间戳，格式：1562915166551
     *
     * @return
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * set 开始时间的时间戳，格式：1562915166551
     *
     * @param startTime
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * get 结束时间的时间戳，格式：1562915166551
     *
     * @return
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * set 结束时间的时间戳，格式：1562915166551
     *
     * @param endTime
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * get metric - 监控指标，精确匹配，支持多个，具体如下&lt;br/&gt;
cps.cpu.util - CPU使用率&lt;br/&gt;
cps.memory.util - 内存使用率&lt;br/&gt;
cps.memory.used - 内存使用量&lt;br/&gt;
cps.disk.used - 磁盘使用量&lt;br/&gt;
cps.disk.util - 磁盘使用率&lt;br/&gt;
cps.disk.bytes.read - 磁盘读流量&lt;br/&gt;
cps.disk.bytes.write - 磁盘写流量&lt;br/&gt;
cps.disk.counts.read - 磁盘读IOPS&lt;br/&gt;
cps.disk.counts.write - 磁盘写IOPS&lt;br/&gt;
cps.network.bytes.ingress - 网卡进流量&lt;br/&gt;
cps.network.bytes.egress - 网卡出流量&lt;br/&gt;
cps.network.packets.ingress - 网络进包量&lt;br/&gt;
cps.network.packets.egress - 网络出包量&lt;br/&gt;
cps.avg.load1 - CPU平均负载1min&lt;br/&gt;
cps.avg.load5 - CPU平均负载5min&lt;br/&gt;
cps.avg.load15 - CPU平均负载15min&lt;br/&gt;
cps.tcp.connect.total - TCP总连接数&lt;br/&gt;
cps.tcp.connect.established - TCP正常连接数&lt;br/&gt;
cps.process.total - 总进程数

     *
     * @return
     */
    public List<Filter> getFilters() {
        return filters;
    }

    /**
     * set metric - 监控指标，精确匹配，支持多个，具体如下&lt;br/&gt;
cps.cpu.util - CPU使用率&lt;br/&gt;
cps.memory.util - 内存使用率&lt;br/&gt;
cps.memory.used - 内存使用量&lt;br/&gt;
cps.disk.used - 磁盘使用量&lt;br/&gt;
cps.disk.util - 磁盘使用率&lt;br/&gt;
cps.disk.bytes.read - 磁盘读流量&lt;br/&gt;
cps.disk.bytes.write - 磁盘写流量&lt;br/&gt;
cps.disk.counts.read - 磁盘读IOPS&lt;br/&gt;
cps.disk.counts.write - 磁盘写IOPS&lt;br/&gt;
cps.network.bytes.ingress - 网卡进流量&lt;br/&gt;
cps.network.bytes.egress - 网卡出流量&lt;br/&gt;
cps.network.packets.ingress - 网络进包量&lt;br/&gt;
cps.network.packets.egress - 网络出包量&lt;br/&gt;
cps.avg.load1 - CPU平均负载1min&lt;br/&gt;
cps.avg.load5 - CPU平均负载5min&lt;br/&gt;
cps.avg.load15 - CPU平均负载15min&lt;br/&gt;
cps.tcp.connect.total - TCP总连接数&lt;br/&gt;
cps.tcp.connect.established - TCP正常连接数&lt;br/&gt;
cps.process.total - 总进程数

     *
     * @param filters
     */
    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    /**
     * get 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @return
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * get 云物理服务器ID
     *
     * @return
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * set 云物理服务器ID
     *
     * @param instanceId
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }


    /**
     * set 开始时间的时间戳，格式：1562915166551
     *
     * @param startTime
     */
    public DescribeInstanceMonitorInfoRequest startTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 结束时间的时间戳，格式：1562915166551
     *
     * @param endTime
     */
    public DescribeInstanceMonitorInfoRequest endTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set metric - 监控指标，精确匹配，支持多个，具体如下&lt;br/&gt;
cps.cpu.util - CPU使用率&lt;br/&gt;
cps.memory.util - 内存使用率&lt;br/&gt;
cps.memory.used - 内存使用量&lt;br/&gt;
cps.disk.used - 磁盘使用量&lt;br/&gt;
cps.disk.util - 磁盘使用率&lt;br/&gt;
cps.disk.bytes.read - 磁盘读流量&lt;br/&gt;
cps.disk.bytes.write - 磁盘写流量&lt;br/&gt;
cps.disk.counts.read - 磁盘读IOPS&lt;br/&gt;
cps.disk.counts.write - 磁盘写IOPS&lt;br/&gt;
cps.network.bytes.ingress - 网卡进流量&lt;br/&gt;
cps.network.bytes.egress - 网卡出流量&lt;br/&gt;
cps.network.packets.ingress - 网络进包量&lt;br/&gt;
cps.network.packets.egress - 网络出包量&lt;br/&gt;
cps.avg.load1 - CPU平均负载1min&lt;br/&gt;
cps.avg.load5 - CPU平均负载5min&lt;br/&gt;
cps.avg.load15 - CPU平均负载15min&lt;br/&gt;
cps.tcp.connect.total - TCP总连接数&lt;br/&gt;
cps.tcp.connect.established - TCP正常连接数&lt;br/&gt;
cps.process.total - 总进程数

     *
     * @param filters
     */
    public DescribeInstanceMonitorInfoRequest filters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * set 地域ID，可调用接口（describeRegiones）获取云物理服务器支持的地域
     *
     * @param regionId
     */
    public DescribeInstanceMonitorInfoRequest regionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * set 云物理服务器ID
     *
     * @param instanceId
     */
    public DescribeInstanceMonitorInfoRequest instanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }


    /**
     * add item to metric - 监控指标，精确匹配，支持多个，具体如下&lt;br/&gt;
cps.cpu.util - CPU使用率&lt;br/&gt;
cps.memory.util - 内存使用率&lt;br/&gt;
cps.memory.used - 内存使用量&lt;br/&gt;
cps.disk.used - 磁盘使用量&lt;br/&gt;
cps.disk.util - 磁盘使用率&lt;br/&gt;
cps.disk.bytes.read - 磁盘读流量&lt;br/&gt;
cps.disk.bytes.write - 磁盘写流量&lt;br/&gt;
cps.disk.counts.read - 磁盘读IOPS&lt;br/&gt;
cps.disk.counts.write - 磁盘写IOPS&lt;br/&gt;
cps.network.bytes.ingress - 网卡进流量&lt;br/&gt;
cps.network.bytes.egress - 网卡出流量&lt;br/&gt;
cps.network.packets.ingress - 网络进包量&lt;br/&gt;
cps.network.packets.egress - 网络出包量&lt;br/&gt;
cps.avg.load1 - CPU平均负载1min&lt;br/&gt;
cps.avg.load5 - CPU平均负载5min&lt;br/&gt;
cps.avg.load15 - CPU平均负载15min&lt;br/&gt;
cps.tcp.connect.total - TCP总连接数&lt;br/&gt;
cps.tcp.connect.established - TCP正常连接数&lt;br/&gt;
cps.process.total - 总进程数

     *
     * @param filter
     */
    public void addFilter(Filter filter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filter);
    }

}
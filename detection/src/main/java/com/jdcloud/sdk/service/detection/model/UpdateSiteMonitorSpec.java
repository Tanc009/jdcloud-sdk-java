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

package com.jdcloud.sdk.service.detection.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * updateSiteMonitorSpec
 */
public class UpdateSiteMonitorSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 地址
     * Required:true
     */
    @Required
    private String address;

    /**
     * advanceChecked
     */
    private String advanceChecked;

    /**
     * createdTime
     */
    private Long createdTime;

    /**
     * 探测频率
     * Required:true
     */
    @Required
    private Long cycle;

    /**
     * defaultSource
     */
    private String defaultSource;

    /**
     * dnsOption
     */
    private SiteMonitorDnsOption dnsOption;

    /**
     * enabled
     */
    private String enabled;

    /**
     * ftpOption
     */
    private SiteMonitorFtpOption ftpOption;

    /**
     * hawkeyeId
     */
    private Long hawkeyeId;

    /**
     * httpOption
     */
    private SiteMonitorHttpOption httpOption;

    /**
     * id
     */
    private String id;

    /**
     * isDeleted
     */
    private String isDeleted;

    /**
     * 任务名称
     * Required:true
     */
    @Required
    private String name;

    /**
     * pin
     */
    private String pin;

    /**
     * pingOption
     */
    private SiteMonitorPingOption pingOption;

    /**
     * pop3Option
     */
    private SiteMonitorPop3Option pop3Option;

    /**
     * 端口
     */
    private String port;

    /**
     * smtpOption
     */
    private SiteMonitorSmtpOption smtpOption;

    /**
     * 探测源
     * Required:true
     */
    @Required
    private List<SiteMonitorSource> source;

    /**
     * stats
     */
    private Object stats;

    /**
     * 任务类型，可选值：HTTP、PING 、TCP 、UDP、DNS、SMTP、POP3和FTP
     * Required:true
     */
    @Required
    private String taskType;

    /**
     * tcpOption
     */
    private SiteMonitorTcpOption tcpOption;

    /**
     * udpOption
     */
    private SiteMonitorUdpOption udpOption;

    /**
     * updatedTime
     */
    private Long updatedTime;


    /**
     * get 地址
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * set 地址
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get advanceChecked
     *
     * @return
     */
    public String getAdvanceChecked() {
        return advanceChecked;
    }

    /**
     * set advanceChecked
     *
     * @param advanceChecked
     */
    public void setAdvanceChecked(String advanceChecked) {
        this.advanceChecked = advanceChecked;
    }

    /**
     * get createdTime
     *
     * @return
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * set createdTime
     *
     * @param createdTime
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * get 探测频率
     *
     * @return
     */
    public Long getCycle() {
        return cycle;
    }

    /**
     * set 探测频率
     *
     * @param cycle
     */
    public void setCycle(Long cycle) {
        this.cycle = cycle;
    }

    /**
     * get defaultSource
     *
     * @return
     */
    public String getDefaultSource() {
        return defaultSource;
    }

    /**
     * set defaultSource
     *
     * @param defaultSource
     */
    public void setDefaultSource(String defaultSource) {
        this.defaultSource = defaultSource;
    }

    /**
     * get dnsOption
     *
     * @return
     */
    public SiteMonitorDnsOption getDnsOption() {
        return dnsOption;
    }

    /**
     * set dnsOption
     *
     * @param dnsOption
     */
    public void setDnsOption(SiteMonitorDnsOption dnsOption) {
        this.dnsOption = dnsOption;
    }

    /**
     * get enabled
     *
     * @return
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * set enabled
     *
     * @param enabled
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * get ftpOption
     *
     * @return
     */
    public SiteMonitorFtpOption getFtpOption() {
        return ftpOption;
    }

    /**
     * set ftpOption
     *
     * @param ftpOption
     */
    public void setFtpOption(SiteMonitorFtpOption ftpOption) {
        this.ftpOption = ftpOption;
    }

    /**
     * get hawkeyeId
     *
     * @return
     */
    public Long getHawkeyeId() {
        return hawkeyeId;
    }

    /**
     * set hawkeyeId
     *
     * @param hawkeyeId
     */
    public void setHawkeyeId(Long hawkeyeId) {
        this.hawkeyeId = hawkeyeId;
    }

    /**
     * get httpOption
     *
     * @return
     */
    public SiteMonitorHttpOption getHttpOption() {
        return httpOption;
    }

    /**
     * set httpOption
     *
     * @param httpOption
     */
    public void setHttpOption(SiteMonitorHttpOption httpOption) {
        this.httpOption = httpOption;
    }

    /**
     * get id
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * set id
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get isDeleted
     *
     * @return
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * set isDeleted
     *
     * @param isDeleted
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * get 任务名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 任务名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get pin
     *
     * @return
     */
    public String getPin() {
        return pin;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * get pingOption
     *
     * @return
     */
    public SiteMonitorPingOption getPingOption() {
        return pingOption;
    }

    /**
     * set pingOption
     *
     * @param pingOption
     */
    public void setPingOption(SiteMonitorPingOption pingOption) {
        this.pingOption = pingOption;
    }

    /**
     * get pop3Option
     *
     * @return
     */
    public SiteMonitorPop3Option getPop3Option() {
        return pop3Option;
    }

    /**
     * set pop3Option
     *
     * @param pop3Option
     */
    public void setPop3Option(SiteMonitorPop3Option pop3Option) {
        this.pop3Option = pop3Option;
    }

    /**
     * get 端口
     *
     * @return
     */
    public String getPort() {
        return port;
    }

    /**
     * set 端口
     *
     * @param port
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * get smtpOption
     *
     * @return
     */
    public SiteMonitorSmtpOption getSmtpOption() {
        return smtpOption;
    }

    /**
     * set smtpOption
     *
     * @param smtpOption
     */
    public void setSmtpOption(SiteMonitorSmtpOption smtpOption) {
        this.smtpOption = smtpOption;
    }

    /**
     * get 探测源
     *
     * @return
     */
    public List<SiteMonitorSource> getSource() {
        return source;
    }

    /**
     * set 探测源
     *
     * @param source
     */
    public void setSource(List<SiteMonitorSource> source) {
        this.source = source;
    }

    /**
     * get stats
     *
     * @return
     */
    public Object getStats() {
        return stats;
    }

    /**
     * set stats
     *
     * @param stats
     */
    public void setStats(Object stats) {
        this.stats = stats;
    }

    /**
     * get 任务类型，可选值：HTTP、PING 、TCP 、UDP、DNS、SMTP、POP3和FTP
     *
     * @return
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * set 任务类型，可选值：HTTP、PING 、TCP 、UDP、DNS、SMTP、POP3和FTP
     *
     * @param taskType
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * get tcpOption
     *
     * @return
     */
    public SiteMonitorTcpOption getTcpOption() {
        return tcpOption;
    }

    /**
     * set tcpOption
     *
     * @param tcpOption
     */
    public void setTcpOption(SiteMonitorTcpOption tcpOption) {
        this.tcpOption = tcpOption;
    }

    /**
     * get udpOption
     *
     * @return
     */
    public SiteMonitorUdpOption getUdpOption() {
        return udpOption;
    }

    /**
     * set udpOption
     *
     * @param udpOption
     */
    public void setUdpOption(SiteMonitorUdpOption udpOption) {
        this.udpOption = udpOption;
    }

    /**
     * get updatedTime
     *
     * @return
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    /**
     * set updatedTime
     *
     * @param updatedTime
     */
    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }


    /**
     * set 地址
     *
     * @param address
     */
    public UpdateSiteMonitorSpec address(String address) {
        this.address = address;
        return this;
    }

    /**
     * set advanceChecked
     *
     * @param advanceChecked
     */
    public UpdateSiteMonitorSpec advanceChecked(String advanceChecked) {
        this.advanceChecked = advanceChecked;
        return this;
    }

    /**
     * set createdTime
     *
     * @param createdTime
     */
    public UpdateSiteMonitorSpec createdTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * set 探测频率
     *
     * @param cycle
     */
    public UpdateSiteMonitorSpec cycle(Long cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * set defaultSource
     *
     * @param defaultSource
     */
    public UpdateSiteMonitorSpec defaultSource(String defaultSource) {
        this.defaultSource = defaultSource;
        return this;
    }

    /**
     * set dnsOption
     *
     * @param dnsOption
     */
    public UpdateSiteMonitorSpec dnsOption(SiteMonitorDnsOption dnsOption) {
        this.dnsOption = dnsOption;
        return this;
    }

    /**
     * set enabled
     *
     * @param enabled
     */
    public UpdateSiteMonitorSpec enabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * set ftpOption
     *
     * @param ftpOption
     */
    public UpdateSiteMonitorSpec ftpOption(SiteMonitorFtpOption ftpOption) {
        this.ftpOption = ftpOption;
        return this;
    }

    /**
     * set hawkeyeId
     *
     * @param hawkeyeId
     */
    public UpdateSiteMonitorSpec hawkeyeId(Long hawkeyeId) {
        this.hawkeyeId = hawkeyeId;
        return this;
    }

    /**
     * set httpOption
     *
     * @param httpOption
     */
    public UpdateSiteMonitorSpec httpOption(SiteMonitorHttpOption httpOption) {
        this.httpOption = httpOption;
        return this;
    }

    /**
     * set id
     *
     * @param id
     */
    public UpdateSiteMonitorSpec id(String id) {
        this.id = id;
        return this;
    }

    /**
     * set isDeleted
     *
     * @param isDeleted
     */
    public UpdateSiteMonitorSpec isDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * set 任务名称
     *
     * @param name
     */
    public UpdateSiteMonitorSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set pin
     *
     * @param pin
     */
    public UpdateSiteMonitorSpec pin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * set pingOption
     *
     * @param pingOption
     */
    public UpdateSiteMonitorSpec pingOption(SiteMonitorPingOption pingOption) {
        this.pingOption = pingOption;
        return this;
    }

    /**
     * set pop3Option
     *
     * @param pop3Option
     */
    public UpdateSiteMonitorSpec pop3Option(SiteMonitorPop3Option pop3Option) {
        this.pop3Option = pop3Option;
        return this;
    }

    /**
     * set 端口
     *
     * @param port
     */
    public UpdateSiteMonitorSpec port(String port) {
        this.port = port;
        return this;
    }

    /**
     * set smtpOption
     *
     * @param smtpOption
     */
    public UpdateSiteMonitorSpec smtpOption(SiteMonitorSmtpOption smtpOption) {
        this.smtpOption = smtpOption;
        return this;
    }

    /**
     * set 探测源
     *
     * @param source
     */
    public UpdateSiteMonitorSpec source(List<SiteMonitorSource> source) {
        this.source = source;
        return this;
    }

    /**
     * set stats
     *
     * @param stats
     */
    public UpdateSiteMonitorSpec stats(Object stats) {
        this.stats = stats;
        return this;
    }

    /**
     * set 任务类型，可选值：HTTP、PING 、TCP 、UDP、DNS、SMTP、POP3和FTP
     *
     * @param taskType
     */
    public UpdateSiteMonitorSpec taskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * set tcpOption
     *
     * @param tcpOption
     */
    public UpdateSiteMonitorSpec tcpOption(SiteMonitorTcpOption tcpOption) {
        this.tcpOption = tcpOption;
        return this;
    }

    /**
     * set udpOption
     *
     * @param udpOption
     */
    public UpdateSiteMonitorSpec udpOption(SiteMonitorUdpOption udpOption) {
        this.udpOption = udpOption;
        return this;
    }

    /**
     * set updatedTime
     *
     * @param updatedTime
     */
    public UpdateSiteMonitorSpec updatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }


    /**
     * add item to 探测源
     *
     * @param source
     */
    public void addSource(SiteMonitorSource source) {
        if (this.source == null) {
            this.source = new ArrayList<>();
        }
        this.source.add(source);
    }

}
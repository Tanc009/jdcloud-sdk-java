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

package com.jdcloud.sdk.service.bri.model;


/**
 * creditTaskMarketingDetail
 */
public class CreditTaskMarketingDetail  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 注册手机号，国内手机：11位手机号;海外手机：以+号开头，4位国家代码+5-11位手机号扩展位；手机注册，必填
     */
    private String phone;

    /**
     * 参与活动IP,用户领取奖励时的真实外网 IP（非服务端），IPV4 或 IPV6
     */
    private String ip;

    /**
     * 参与活动时间戳，参与活动时间戳，UNIX时间戳
     */
    private Long time;

    /**
     * 用户参加活动渠道或终端，1：PC端web浏览器注册 PC-Brower；2：PC客户端注册 PC-Client；3：移动设备各种APP注册 Mobile-APP；4 ：移动设备浏览器登录，移动端M页注册 Mobile-Brower；5：移动设备微信客户端中购物入口的注册操作 Mobile-WX；6： 移动设备QQ客户端中购物入口的注册操作 Mobile-QQ；7： 移动设备微信客户端中微信小程序注册操作- Mobile-WX；0：其他
     */
    private Integer channel;

    /**
     * 小写referUrl
     */
    private String referUrlLower;

    /**
     * 登录方式，1：手动帐号密码输入；2：动态短信密码登录；3：二维码扫描登录；0：其他
     */
    private Integer loginType;

    /**
     * 登录时间，用户最近登录完成时间，UNIX时间戳
     */
    private Long lastLoginTime;

    /**
     * 注册时间，UNIX时间戳
     */
    private Integer regTime;

    /**
     * 注册来源的外网 IP，IPV4 或 IPV6
     */
    private String regIp;

    /**
     * 注册类型，1：手机注册；2：邮箱注册；3：pin注册；0：其他。
     */
    private Integer regType;

    /**
     * 注册帐号名，用户注册使用名称
     */
    private String regName;

    /**
     * 注册渠道或注册终端，1： PC端web浏览器注册 PC-Brower；2：PC客户端注册 PC-Client；3：移动设备各种APP注册 Mobile-APP；4 ：移动设备浏览器登录，移动端M页注册 Mobile-Brower；5：移动设备微信客户端中购物入口的注册操作 Mobile-WX；6： 移动设备QQ客户端中购物入口的注册操作 Mobile-QQ；7： 移动设备微信客户端中微信小程序注册操作- Mobile-WX；0：其他
     */
    private Integer regChannel;

    /**
     * 参加活动设备uid，UID是使用iOS系统非隐私参数，用一套统一规则生成的用于标识苹果手机的ID
     */
    private String uid;

    /**
     * 参与活动登录的设备号，设备指纹编码
     */
    private String eid;

    /**
     * MAC地址，MAC 地址或设备唯一标识。
     */
    private String macAddress;

    /**
     * 手机制造商 ID，手机制造商 ID，如果手机注册，请带上此信息。
     */
    private String vendorId;

    /**
     * 手机设备号，Android：imei，IOS：idfa
     */
    private String imei;

    /**
     * 手机设备号，Android：imei，IOS：idfa
     */
    private String idfa;

    /**
     * App 客户端版本，如果使用App操作，请带上此信息
     */
    private String appVersion;

    /**
     * 业务 ID， 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     */
    private Integer businessId;

    /**
     * 对于新人的类型做分类，用于新人权益互斥的场景做领券限制，不同业务场景的解释会有变化。例如：1001：新人188大礼包；1002：全链路新人礼包；1003：市场部新人；1004： 极速版拉新；1005：事业部拉新
     */
    private Integer newPersonType;

    /**
     * 优惠券ID
     */
    private String batchId;

    /**
     * 活动key
     */
    private String activityKeyRaw;

    /**
     * 业务来源，基础账号侧配置的业务来源，用来识别和区分独立业务，枚举可根据客户具体需求调整。
     */
    private Integer source;

    /**
     * cookie 的Hash值，用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。
     */
    private String cookieHash;

    /**
     * 用户领取奖品邮寄地址
     */
    private String address;

    /**
     * 用户 HTTP 请求的 userAgent
     */
    private String userAgent;

    /**
     * 用户 HTTP 请求中的 x_forward_for。
     */
    private String xForwardedFor;

    /**
     * 用户操作过程中鼠标单击次数。
     */
    private Integer mouseClickCount;

    /**
     * 用户操作过程中键盘单击次数。
     */
    private Integer keyboardClickCount;

    /**
     * 登录耗时，从出登录页到登录提交之间的时间差（出登录视图埋点，提交时计算时间差），如果为免密码登录方式，可以在换取认证token时生成时间戳，验证token时计算时间差，单位ms
     */
    private Integer loginSpend;

    /**
     * 最后登录设备号（eid），设备指纹编码
     */
    private String lastLoginEid;

    /**
     * 登录成功后跳转页面。
     */
    private String jumpUrl;

    /**
     * 注册占用时长，从用户进入注册页到点击注册提交之间的时间差，单位ms
     */
    private String elapsedTime;

    /**
     * 注册结果，成功 or 失败；如直接做拦截校验可不填，1：注册成功；2：注册失败。
     */
    private Integer regResult;

    /**
     * 用户注册邮箱
     */
    private String regEmail;

    /**
     * 单个红包允许领取的用户数量（分享红包）
     */
    private Integer share;

    /**
     * 单日内，单个账号每日领取奖励的最大次数。
     */
    private Integer dayTimes;

    /**
     * 整个活动周期内，单个账号能领取奖励的最大次数
     */
    private Integer totalTimes;

    /**
     * 维度。浮点数，范围为-90 - 90
     */
    private Number atitude;

    /**
     * 经度。浮点数，范围为-180 - 180
     */
    private Number longitude;


    /**
     * get 注册手机号，国内手机：11位手机号;海外手机：以+号开头，4位国家代码+5-11位手机号扩展位；手机注册，必填
     *
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * set 注册手机号，国内手机：11位手机号;海外手机：以+号开头，4位国家代码+5-11位手机号扩展位；手机注册，必填
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * get 参与活动IP,用户领取奖励时的真实外网 IP（非服务端），IPV4 或 IPV6
     *
     * @return
     */
    public String getIp() {
        return ip;
    }

    /**
     * set 参与活动IP,用户领取奖励时的真实外网 IP（非服务端），IPV4 或 IPV6
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * get 参与活动时间戳，参与活动时间戳，UNIX时间戳
     *
     * @return
     */
    public Long getTime() {
        return time;
    }

    /**
     * set 参与活动时间戳，参与活动时间戳，UNIX时间戳
     *
     * @param time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * get 用户参加活动渠道或终端，1：PC端web浏览器注册 PC-Brower；2：PC客户端注册 PC-Client；3：移动设备各种APP注册 Mobile-APP；4 ：移动设备浏览器登录，移动端M页注册 Mobile-Brower；5：移动设备微信客户端中购物入口的注册操作 Mobile-WX；6： 移动设备QQ客户端中购物入口的注册操作 Mobile-QQ；7： 移动设备微信客户端中微信小程序注册操作- Mobile-WX；0：其他
     *
     * @return
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * set 用户参加活动渠道或终端，1：PC端web浏览器注册 PC-Brower；2：PC客户端注册 PC-Client；3：移动设备各种APP注册 Mobile-APP；4 ：移动设备浏览器登录，移动端M页注册 Mobile-Brower；5：移动设备微信客户端中购物入口的注册操作 Mobile-WX；6： 移动设备QQ客户端中购物入口的注册操作 Mobile-QQ；7： 移动设备微信客户端中微信小程序注册操作- Mobile-WX；0：其他
     *
     * @param channel
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * get 小写referUrl
     *
     * @return
     */
    public String getReferUrlLower() {
        return referUrlLower;
    }

    /**
     * set 小写referUrl
     *
     * @param referUrlLower
     */
    public void setReferUrlLower(String referUrlLower) {
        this.referUrlLower = referUrlLower;
    }

    /**
     * get 登录方式，1：手动帐号密码输入；2：动态短信密码登录；3：二维码扫描登录；0：其他
     *
     * @return
     */
    public Integer getLoginType() {
        return loginType;
    }

    /**
     * set 登录方式，1：手动帐号密码输入；2：动态短信密码登录；3：二维码扫描登录；0：其他
     *
     * @param loginType
     */
    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    /**
     * get 登录时间，用户最近登录完成时间，UNIX时间戳
     *
     * @return
     */
    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * set 登录时间，用户最近登录完成时间，UNIX时间戳
     *
     * @param lastLoginTime
     */
    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * get 注册时间，UNIX时间戳
     *
     * @return
     */
    public Integer getRegTime() {
        return regTime;
    }

    /**
     * set 注册时间，UNIX时间戳
     *
     * @param regTime
     */
    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    /**
     * get 注册来源的外网 IP，IPV4 或 IPV6
     *
     * @return
     */
    public String getRegIp() {
        return regIp;
    }

    /**
     * set 注册来源的外网 IP，IPV4 或 IPV6
     *
     * @param regIp
     */
    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    /**
     * get 注册类型，1：手机注册；2：邮箱注册；3：pin注册；0：其他。
     *
     * @return
     */
    public Integer getRegType() {
        return regType;
    }

    /**
     * set 注册类型，1：手机注册；2：邮箱注册；3：pin注册；0：其他。
     *
     * @param regType
     */
    public void setRegType(Integer regType) {
        this.regType = regType;
    }

    /**
     * get 注册帐号名，用户注册使用名称
     *
     * @return
     */
    public String getRegName() {
        return regName;
    }

    /**
     * set 注册帐号名，用户注册使用名称
     *
     * @param regName
     */
    public void setRegName(String regName) {
        this.regName = regName;
    }

    /**
     * get 注册渠道或注册终端，1： PC端web浏览器注册 PC-Brower；2：PC客户端注册 PC-Client；3：移动设备各种APP注册 Mobile-APP；4 ：移动设备浏览器登录，移动端M页注册 Mobile-Brower；5：移动设备微信客户端中购物入口的注册操作 Mobile-WX；6： 移动设备QQ客户端中购物入口的注册操作 Mobile-QQ；7： 移动设备微信客户端中微信小程序注册操作- Mobile-WX；0：其他
     *
     * @return
     */
    public Integer getRegChannel() {
        return regChannel;
    }

    /**
     * set 注册渠道或注册终端，1： PC端web浏览器注册 PC-Brower；2：PC客户端注册 PC-Client；3：移动设备各种APP注册 Mobile-APP；4 ：移动设备浏览器登录，移动端M页注册 Mobile-Brower；5：移动设备微信客户端中购物入口的注册操作 Mobile-WX；6： 移动设备QQ客户端中购物入口的注册操作 Mobile-QQ；7： 移动设备微信客户端中微信小程序注册操作- Mobile-WX；0：其他
     *
     * @param regChannel
     */
    public void setRegChannel(Integer regChannel) {
        this.regChannel = regChannel;
    }

    /**
     * get 参加活动设备uid，UID是使用iOS系统非隐私参数，用一套统一规则生成的用于标识苹果手机的ID
     *
     * @return
     */
    public String getUid() {
        return uid;
    }

    /**
     * set 参加活动设备uid，UID是使用iOS系统非隐私参数，用一套统一规则生成的用于标识苹果手机的ID
     *
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * get 参与活动登录的设备号，设备指纹编码
     *
     * @return
     */
    public String getEid() {
        return eid;
    }

    /**
     * set 参与活动登录的设备号，设备指纹编码
     *
     * @param eid
     */
    public void setEid(String eid) {
        this.eid = eid;
    }

    /**
     * get MAC地址，MAC 地址或设备唯一标识。
     *
     * @return
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * set MAC地址，MAC 地址或设备唯一标识。
     *
     * @param macAddress
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * get 手机制造商 ID，手机制造商 ID，如果手机注册，请带上此信息。
     *
     * @return
     */
    public String getVendorId() {
        return vendorId;
    }

    /**
     * set 手机制造商 ID，手机制造商 ID，如果手机注册，请带上此信息。
     *
     * @param vendorId
     */
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    /**
     * get 手机设备号，Android：imei，IOS：idfa
     *
     * @return
     */
    public String getImei() {
        return imei;
    }

    /**
     * set 手机设备号，Android：imei，IOS：idfa
     *
     * @param imei
     */
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * get 手机设备号，Android：imei，IOS：idfa
     *
     * @return
     */
    public String getIdfa() {
        return idfa;
    }

    /**
     * set 手机设备号，Android：imei，IOS：idfa
     *
     * @param idfa
     */
    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    /**
     * get App 客户端版本，如果使用App操作，请带上此信息
     *
     * @return
     */
    public String getAppVersion() {
        return appVersion;
    }

    /**
     * set App 客户端版本，如果使用App操作，请带上此信息
     *
     * @param appVersion
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * get 业务 ID， 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     *
     * @return
     */
    public Integer getBusinessId() {
        return businessId;
    }

    /**
     * set 业务 ID， 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     *
     * @param businessId
     */
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    /**
     * get 对于新人的类型做分类，用于新人权益互斥的场景做领券限制，不同业务场景的解释会有变化。例如：1001：新人188大礼包；1002：全链路新人礼包；1003：市场部新人；1004： 极速版拉新；1005：事业部拉新
     *
     * @return
     */
    public Integer getNewPersonType() {
        return newPersonType;
    }

    /**
     * set 对于新人的类型做分类，用于新人权益互斥的场景做领券限制，不同业务场景的解释会有变化。例如：1001：新人188大礼包；1002：全链路新人礼包；1003：市场部新人；1004： 极速版拉新；1005：事业部拉新
     *
     * @param newPersonType
     */
    public void setNewPersonType(Integer newPersonType) {
        this.newPersonType = newPersonType;
    }

    /**
     * get 优惠券ID
     *
     * @return
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * set 优惠券ID
     *
     * @param batchId
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * get 活动key
     *
     * @return
     */
    public String getActivityKeyRaw() {
        return activityKeyRaw;
    }

    /**
     * set 活动key
     *
     * @param activityKeyRaw
     */
    public void setActivityKeyRaw(String activityKeyRaw) {
        this.activityKeyRaw = activityKeyRaw;
    }

    /**
     * get 业务来源，基础账号侧配置的业务来源，用来识别和区分独立业务，枚举可根据客户具体需求调整。
     *
     * @return
     */
    public Integer getSource() {
        return source;
    }

    /**
     * set 业务来源，基础账号侧配置的业务来源，用来识别和区分独立业务，枚举可根据客户具体需求调整。
     *
     * @param source
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * get cookie 的Hash值，用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。
     *
     * @return
     */
    public String getCookieHash() {
        return cookieHash;
    }

    /**
     * set cookie 的Hash值，用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。
     *
     * @param cookieHash
     */
    public void setCookieHash(String cookieHash) {
        this.cookieHash = cookieHash;
    }

    /**
     * get 用户领取奖品邮寄地址
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * set 用户领取奖品邮寄地址
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get 用户 HTTP 请求的 userAgent
     *
     * @return
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * set 用户 HTTP 请求的 userAgent
     *
     * @param userAgent
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * get 用户 HTTP 请求中的 x_forward_for。
     *
     * @return
     */
    public String getXForwardedFor() {
        return xForwardedFor;
    }

    /**
     * set 用户 HTTP 请求中的 x_forward_for。
     *
     * @param xForwardedFor
     */
    public void setXForwardedFor(String xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
    }

    /**
     * get 用户操作过程中鼠标单击次数。
     *
     * @return
     */
    public Integer getMouseClickCount() {
        return mouseClickCount;
    }

    /**
     * set 用户操作过程中鼠标单击次数。
     *
     * @param mouseClickCount
     */
    public void setMouseClickCount(Integer mouseClickCount) {
        this.mouseClickCount = mouseClickCount;
    }

    /**
     * get 用户操作过程中键盘单击次数。
     *
     * @return
     */
    public Integer getKeyboardClickCount() {
        return keyboardClickCount;
    }

    /**
     * set 用户操作过程中键盘单击次数。
     *
     * @param keyboardClickCount
     */
    public void setKeyboardClickCount(Integer keyboardClickCount) {
        this.keyboardClickCount = keyboardClickCount;
    }

    /**
     * get 登录耗时，从出登录页到登录提交之间的时间差（出登录视图埋点，提交时计算时间差），如果为免密码登录方式，可以在换取认证token时生成时间戳，验证token时计算时间差，单位ms
     *
     * @return
     */
    public Integer getLoginSpend() {
        return loginSpend;
    }

    /**
     * set 登录耗时，从出登录页到登录提交之间的时间差（出登录视图埋点，提交时计算时间差），如果为免密码登录方式，可以在换取认证token时生成时间戳，验证token时计算时间差，单位ms
     *
     * @param loginSpend
     */
    public void setLoginSpend(Integer loginSpend) {
        this.loginSpend = loginSpend;
    }

    /**
     * get 最后登录设备号（eid），设备指纹编码
     *
     * @return
     */
    public String getLastLoginEid() {
        return lastLoginEid;
    }

    /**
     * set 最后登录设备号（eid），设备指纹编码
     *
     * @param lastLoginEid
     */
    public void setLastLoginEid(String lastLoginEid) {
        this.lastLoginEid = lastLoginEid;
    }

    /**
     * get 登录成功后跳转页面。
     *
     * @return
     */
    public String getJumpUrl() {
        return jumpUrl;
    }

    /**
     * set 登录成功后跳转页面。
     *
     * @param jumpUrl
     */
    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    /**
     * get 注册占用时长，从用户进入注册页到点击注册提交之间的时间差，单位ms
     *
     * @return
     */
    public String getElapsedTime() {
        return elapsedTime;
    }

    /**
     * set 注册占用时长，从用户进入注册页到点击注册提交之间的时间差，单位ms
     *
     * @param elapsedTime
     */
    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    /**
     * get 注册结果，成功 or 失败；如直接做拦截校验可不填，1：注册成功；2：注册失败。
     *
     * @return
     */
    public Integer getRegResult() {
        return regResult;
    }

    /**
     * set 注册结果，成功 or 失败；如直接做拦截校验可不填，1：注册成功；2：注册失败。
     *
     * @param regResult
     */
    public void setRegResult(Integer regResult) {
        this.regResult = regResult;
    }

    /**
     * get 用户注册邮箱
     *
     * @return
     */
    public String getRegEmail() {
        return regEmail;
    }

    /**
     * set 用户注册邮箱
     *
     * @param regEmail
     */
    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }

    /**
     * get 单个红包允许领取的用户数量（分享红包）
     *
     * @return
     */
    public Integer getShare() {
        return share;
    }

    /**
     * set 单个红包允许领取的用户数量（分享红包）
     *
     * @param share
     */
    public void setShare(Integer share) {
        this.share = share;
    }

    /**
     * get 单日内，单个账号每日领取奖励的最大次数。
     *
     * @return
     */
    public Integer getDayTimes() {
        return dayTimes;
    }

    /**
     * set 单日内，单个账号每日领取奖励的最大次数。
     *
     * @param dayTimes
     */
    public void setDayTimes(Integer dayTimes) {
        this.dayTimes = dayTimes;
    }

    /**
     * get 整个活动周期内，单个账号能领取奖励的最大次数
     *
     * @return
     */
    public Integer getTotalTimes() {
        return totalTimes;
    }

    /**
     * set 整个活动周期内，单个账号能领取奖励的最大次数
     *
     * @param totalTimes
     */
    public void setTotalTimes(Integer totalTimes) {
        this.totalTimes = totalTimes;
    }

    /**
     * get 维度。浮点数，范围为-90 - 90
     *
     * @return
     */
    public Number getAtitude() {
        return atitude;
    }

    /**
     * set 维度。浮点数，范围为-90 - 90
     *
     * @param atitude
     */
    public void setAtitude(Number atitude) {
        this.atitude = atitude;
    }

    /**
     * get 经度。浮点数，范围为-180 - 180
     *
     * @return
     */
    public Number getLongitude() {
        return longitude;
    }

    /**
     * set 经度。浮点数，范围为-180 - 180
     *
     * @param longitude
     */
    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }


    /**
     * set 注册手机号，国内手机：11位手机号;海外手机：以+号开头，4位国家代码+5-11位手机号扩展位；手机注册，必填
     *
     * @param phone
     */
    public CreditTaskMarketingDetail phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * set 参与活动IP,用户领取奖励时的真实外网 IP（非服务端），IPV4 或 IPV6
     *
     * @param ip
     */
    public CreditTaskMarketingDetail ip(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * set 参与活动时间戳，参与活动时间戳，UNIX时间戳
     *
     * @param time
     */
    public CreditTaskMarketingDetail time(Long time) {
        this.time = time;
        return this;
    }

    /**
     * set 用户参加活动渠道或终端，1：PC端web浏览器注册 PC-Brower；2：PC客户端注册 PC-Client；3：移动设备各种APP注册 Mobile-APP；4 ：移动设备浏览器登录，移动端M页注册 Mobile-Brower；5：移动设备微信客户端中购物入口的注册操作 Mobile-WX；6： 移动设备QQ客户端中购物入口的注册操作 Mobile-QQ；7： 移动设备微信客户端中微信小程序注册操作- Mobile-WX；0：其他
     *
     * @param channel
     */
    public CreditTaskMarketingDetail channel(Integer channel) {
        this.channel = channel;
        return this;
    }

    /**
     * set 小写referUrl
     *
     * @param referUrlLower
     */
    public CreditTaskMarketingDetail referUrlLower(String referUrlLower) {
        this.referUrlLower = referUrlLower;
        return this;
    }

    /**
     * set 登录方式，1：手动帐号密码输入；2：动态短信密码登录；3：二维码扫描登录；0：其他
     *
     * @param loginType
     */
    public CreditTaskMarketingDetail loginType(Integer loginType) {
        this.loginType = loginType;
        return this;
    }

    /**
     * set 登录时间，用户最近登录完成时间，UNIX时间戳
     *
     * @param lastLoginTime
     */
    public CreditTaskMarketingDetail lastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
        return this;
    }

    /**
     * set 注册时间，UNIX时间戳
     *
     * @param regTime
     */
    public CreditTaskMarketingDetail regTime(Integer regTime) {
        this.regTime = regTime;
        return this;
    }

    /**
     * set 注册来源的外网 IP，IPV4 或 IPV6
     *
     * @param regIp
     */
    public CreditTaskMarketingDetail regIp(String regIp) {
        this.regIp = regIp;
        return this;
    }

    /**
     * set 注册类型，1：手机注册；2：邮箱注册；3：pin注册；0：其他。
     *
     * @param regType
     */
    public CreditTaskMarketingDetail regType(Integer regType) {
        this.regType = regType;
        return this;
    }

    /**
     * set 注册帐号名，用户注册使用名称
     *
     * @param regName
     */
    public CreditTaskMarketingDetail regName(String regName) {
        this.regName = regName;
        return this;
    }

    /**
     * set 注册渠道或注册终端，1： PC端web浏览器注册 PC-Brower；2：PC客户端注册 PC-Client；3：移动设备各种APP注册 Mobile-APP；4 ：移动设备浏览器登录，移动端M页注册 Mobile-Brower；5：移动设备微信客户端中购物入口的注册操作 Mobile-WX；6： 移动设备QQ客户端中购物入口的注册操作 Mobile-QQ；7： 移动设备微信客户端中微信小程序注册操作- Mobile-WX；0：其他
     *
     * @param regChannel
     */
    public CreditTaskMarketingDetail regChannel(Integer regChannel) {
        this.regChannel = regChannel;
        return this;
    }

    /**
     * set 参加活动设备uid，UID是使用iOS系统非隐私参数，用一套统一规则生成的用于标识苹果手机的ID
     *
     * @param uid
     */
    public CreditTaskMarketingDetail uid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * set 参与活动登录的设备号，设备指纹编码
     *
     * @param eid
     */
    public CreditTaskMarketingDetail eid(String eid) {
        this.eid = eid;
        return this;
    }

    /**
     * set MAC地址，MAC 地址或设备唯一标识。
     *
     * @param macAddress
     */
    public CreditTaskMarketingDetail macAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * set 手机制造商 ID，手机制造商 ID，如果手机注册，请带上此信息。
     *
     * @param vendorId
     */
    public CreditTaskMarketingDetail vendorId(String vendorId) {
        this.vendorId = vendorId;
        return this;
    }

    /**
     * set 手机设备号，Android：imei，IOS：idfa
     *
     * @param imei
     */
    public CreditTaskMarketingDetail imei(String imei) {
        this.imei = imei;
        return this;
    }

    /**
     * set 手机设备号，Android：imei，IOS：idfa
     *
     * @param idfa
     */
    public CreditTaskMarketingDetail idfa(String idfa) {
        this.idfa = idfa;
        return this;
    }

    /**
     * set App 客户端版本，如果使用App操作，请带上此信息
     *
     * @param appVersion
     */
    public CreditTaskMarketingDetail appVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * set 业务 ID， 网站或应用在多个业务中使用此服务，通过此 ID 区分统计数据
     *
     * @param businessId
     */
    public CreditTaskMarketingDetail businessId(Integer businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * set 对于新人的类型做分类，用于新人权益互斥的场景做领券限制，不同业务场景的解释会有变化。例如：1001：新人188大礼包；1002：全链路新人礼包；1003：市场部新人；1004： 极速版拉新；1005：事业部拉新
     *
     * @param newPersonType
     */
    public CreditTaskMarketingDetail newPersonType(Integer newPersonType) {
        this.newPersonType = newPersonType;
        return this;
    }

    /**
     * set 优惠券ID
     *
     * @param batchId
     */
    public CreditTaskMarketingDetail batchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * set 活动key
     *
     * @param activityKeyRaw
     */
    public CreditTaskMarketingDetail activityKeyRaw(String activityKeyRaw) {
        this.activityKeyRaw = activityKeyRaw;
        return this;
    }

    /**
     * set 业务来源，基础账号侧配置的业务来源，用来识别和区分独立业务，枚举可根据客户具体需求调整。
     *
     * @param source
     */
    public CreditTaskMarketingDetail source(Integer source) {
        this.source = source;
        return this;
    }

    /**
     * set cookie 的Hash值，用户 HTTP 请求中的 cookie 进行2次 hash 的值，只要保证相同 cookie 的 hash 值一致即可。
     *
     * @param cookieHash
     */
    public CreditTaskMarketingDetail cookieHash(String cookieHash) {
        this.cookieHash = cookieHash;
        return this;
    }

    /**
     * set 用户领取奖品邮寄地址
     *
     * @param address
     */
    public CreditTaskMarketingDetail address(String address) {
        this.address = address;
        return this;
    }

    /**
     * set 用户 HTTP 请求的 userAgent
     *
     * @param userAgent
     */
    public CreditTaskMarketingDetail userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * set 用户 HTTP 请求中的 x_forward_for。
     *
     * @param xForwardedFor
     */
    public CreditTaskMarketingDetail xForwardedFor(String xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
        return this;
    }

    /**
     * set 用户操作过程中鼠标单击次数。
     *
     * @param mouseClickCount
     */
    public CreditTaskMarketingDetail mouseClickCount(Integer mouseClickCount) {
        this.mouseClickCount = mouseClickCount;
        return this;
    }

    /**
     * set 用户操作过程中键盘单击次数。
     *
     * @param keyboardClickCount
     */
    public CreditTaskMarketingDetail keyboardClickCount(Integer keyboardClickCount) {
        this.keyboardClickCount = keyboardClickCount;
        return this;
    }

    /**
     * set 登录耗时，从出登录页到登录提交之间的时间差（出登录视图埋点，提交时计算时间差），如果为免密码登录方式，可以在换取认证token时生成时间戳，验证token时计算时间差，单位ms
     *
     * @param loginSpend
     */
    public CreditTaskMarketingDetail loginSpend(Integer loginSpend) {
        this.loginSpend = loginSpend;
        return this;
    }

    /**
     * set 最后登录设备号（eid），设备指纹编码
     *
     * @param lastLoginEid
     */
    public CreditTaskMarketingDetail lastLoginEid(String lastLoginEid) {
        this.lastLoginEid = lastLoginEid;
        return this;
    }

    /**
     * set 登录成功后跳转页面。
     *
     * @param jumpUrl
     */
    public CreditTaskMarketingDetail jumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
        return this;
    }

    /**
     * set 注册占用时长，从用户进入注册页到点击注册提交之间的时间差，单位ms
     *
     * @param elapsedTime
     */
    public CreditTaskMarketingDetail elapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    /**
     * set 注册结果，成功 or 失败；如直接做拦截校验可不填，1：注册成功；2：注册失败。
     *
     * @param regResult
     */
    public CreditTaskMarketingDetail regResult(Integer regResult) {
        this.regResult = regResult;
        return this;
    }

    /**
     * set 用户注册邮箱
     *
     * @param regEmail
     */
    public CreditTaskMarketingDetail regEmail(String regEmail) {
        this.regEmail = regEmail;
        return this;
    }

    /**
     * set 单个红包允许领取的用户数量（分享红包）
     *
     * @param share
     */
    public CreditTaskMarketingDetail share(Integer share) {
        this.share = share;
        return this;
    }

    /**
     * set 单日内，单个账号每日领取奖励的最大次数。
     *
     * @param dayTimes
     */
    public CreditTaskMarketingDetail dayTimes(Integer dayTimes) {
        this.dayTimes = dayTimes;
        return this;
    }

    /**
     * set 整个活动周期内，单个账号能领取奖励的最大次数
     *
     * @param totalTimes
     */
    public CreditTaskMarketingDetail totalTimes(Integer totalTimes) {
        this.totalTimes = totalTimes;
        return this;
    }

    /**
     * set 维度。浮点数，范围为-90 - 90
     *
     * @param atitude
     */
    public CreditTaskMarketingDetail atitude(Number atitude) {
        this.atitude = atitude;
        return this;
    }

    /**
     * set 经度。浮点数，范围为-180 - 180
     *
     * @param longitude
     */
    public CreditTaskMarketingDetail longitude(Number longitude) {
        this.longitude = longitude;
        return this;
    }


}
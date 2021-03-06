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

package com.jdcloud.sdk.service.portal.model;


/**
 * noticeVo
 */
public class NoticeVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * uuid
     */
    private Integer uuid;

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 公告类型; 1:产品公告; 2:域名公告; 3:活动公告; 4:其他公告
     */
    private String type;

    /**
     * 置顶; 100:不置顶; 1;2;3;4;5:置顶位置(数字不能重复)
     */
    private String goTop;

    /**
     * 位置; 0:不显示; 1:左边; 2:左中; 3:中; 4:右中; 5:右
     */
    private String inlet;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;

    /**
     * 创建人
     */
    private String createPin;

    /**
     * 是否失效; 0:生效; 1:失效
     */
    private String yn;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 发送开始时间
     */
    private String startTime;

    /**
     * 发送结束时间
     */
    private String endTime;

    /**
     * 位置; 1:置顶; 2:入口
     */
    private Integer site;

    /**
     * 页码数
     */
    private Integer pageNum;

    /**
     * 页显示数量
     */
    private Integer pageSize;

    /**
     * 语言
     */
    private String lang;

    /**
     * 中英文关联id
     */
    private Integer langId;

    /**
     * 查询时间
     */
    private String ts;


    /**
     * get uuid
     *
     * @return
     */
    public Integer getUuid() {
        return uuid;
    }

    /**
     * set uuid
     *
     * @param uuid
     */
    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    /**
     * get 主键id
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * set 主键id
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 标题
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 标题
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get 公告类型; 1:产品公告; 2:域名公告; 3:活动公告; 4:其他公告
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * set 公告类型; 1:产品公告; 2:域名公告; 3:活动公告; 4:其他公告
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * get 置顶; 100:不置顶; 1;2;3;4;5:置顶位置(数字不能重复)
     *
     * @return
     */
    public String getGoTop() {
        return goTop;
    }

    /**
     * set 置顶; 100:不置顶; 1;2;3;4;5:置顶位置(数字不能重复)
     *
     * @param goTop
     */
    public void setGoTop(String goTop) {
        this.goTop = goTop;
    }

    /**
     * get 位置; 0:不显示; 1:左边; 2:左中; 3:中; 4:右中; 5:右
     *
     * @return
     */
    public String getInlet() {
        return inlet;
    }

    /**
     * set 位置; 0:不显示; 1:左边; 2:左中; 3:中; 4:右中; 5:右
     *
     * @param inlet
     */
    public void setInlet(String inlet) {
        this.inlet = inlet;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 修改时间
     *
     * @return
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 创建人
     *
     * @return
     */
    public String getCreatePin() {
        return createPin;
    }

    /**
     * set 创建人
     *
     * @param createPin
     */
    public void setCreatePin(String createPin) {
        this.createPin = createPin;
    }

    /**
     * get 是否失效; 0:生效; 1:失效
     *
     * @return
     */
    public String getYn() {
        return yn;
    }

    /**
     * set 是否失效; 0:生效; 1:失效
     *
     * @param yn
     */
    public void setYn(String yn) {
        this.yn = yn;
    }

    /**
     * get 公告内容
     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 公告内容
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * get 发送开始时间
     *
     * @return
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * set 发送开始时间
     *
     * @param startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * get 发送结束时间
     *
     * @return
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * set 发送结束时间
     *
     * @param endTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * get 位置; 1:置顶; 2:入口
     *
     * @return
     */
    public Integer getSite() {
        return site;
    }

    /**
     * set 位置; 1:置顶; 2:入口
     *
     * @param site
     */
    public void setSite(Integer site) {
        this.site = site;
    }

    /**
     * get 页码数
     *
     * @return
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * set 页码数
     *
     * @param pageNum
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * get 页显示数量
     *
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * set 页显示数量
     *
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get 语言
     *
     * @return
     */
    public String getLang() {
        return lang;
    }

    /**
     * set 语言
     *
     * @param lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * get 中英文关联id
     *
     * @return
     */
    public Integer getLangId() {
        return langId;
    }

    /**
     * set 中英文关联id
     *
     * @param langId
     */
    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    /**
     * get 查询时间
     *
     * @return
     */
    public String getTs() {
        return ts;
    }

    /**
     * set 查询时间
     *
     * @param ts
     */
    public void setTs(String ts) {
        this.ts = ts;
    }


    /**
     * set uuid
     *
     * @param uuid
     */
    public NoticeVo uuid(Integer uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * set 主键id
     *
     * @param id
     */
    public NoticeVo id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * set 标题
     *
     * @param title
     */
    public NoticeVo title(String title) {
        this.title = title;
        return this;
    }

    /**
     * set 公告类型; 1:产品公告; 2:域名公告; 3:活动公告; 4:其他公告
     *
     * @param type
     */
    public NoticeVo type(String type) {
        this.type = type;
        return this;
    }

    /**
     * set 置顶; 100:不置顶; 1;2;3;4;5:置顶位置(数字不能重复)
     *
     * @param goTop
     */
    public NoticeVo goTop(String goTop) {
        this.goTop = goTop;
        return this;
    }

    /**
     * set 位置; 0:不显示; 1:左边; 2:左中; 3:中; 4:右中; 5:右
     *
     * @param inlet
     */
    public NoticeVo inlet(String inlet) {
        this.inlet = inlet;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public NoticeVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * set 修改时间
     *
     * @param updateTime
     */
    public NoticeVo updateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * set 创建人
     *
     * @param createPin
     */
    public NoticeVo createPin(String createPin) {
        this.createPin = createPin;
        return this;
    }

    /**
     * set 是否失效; 0:生效; 1:失效
     *
     * @param yn
     */
    public NoticeVo yn(String yn) {
        this.yn = yn;
        return this;
    }

    /**
     * set 公告内容
     *
     * @param content
     */
    public NoticeVo content(String content) {
        this.content = content;
        return this;
    }

    /**
     * set 发送开始时间
     *
     * @param startTime
     */
    public NoticeVo startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 发送结束时间
     *
     * @param endTime
     */
    public NoticeVo endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * set 位置; 1:置顶; 2:入口
     *
     * @param site
     */
    public NoticeVo site(Integer site) {
        this.site = site;
        return this;
    }

    /**
     * set 页码数
     *
     * @param pageNum
     */
    public NoticeVo pageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * set 页显示数量
     *
     * @param pageSize
     */
    public NoticeVo pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * set 语言
     *
     * @param lang
     */
    public NoticeVo lang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * set 中英文关联id
     *
     * @param langId
     */
    public NoticeVo langId(Integer langId) {
        this.langId = langId;
        return this;
    }

    /**
     * set 查询时间
     *
     * @param ts
     */
    public NoticeVo ts(String ts) {
        this.ts = ts;
        return this;
    }


}
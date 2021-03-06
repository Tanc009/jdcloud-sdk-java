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

package com.jdcloud.sdk.service.mps.model;

import com.jdcloud.sdk.annotation.Required;

/**
 * 创建截图模板请求信息
 */
public class CreateSnapshotTemplateRequestInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模板标题。长度不超过 128 个字节。UTF-8 编码。
     * Required:true
     */
    @Required
    private String title;

    /**
     * 截图起始时间，取值范围单位为秒，缺省值为 0

     */
    private Integer startTime;

    /**
     * 截图帧类型。取值范围：
  any - 任意帧
  intra - 关键帧
缺省值为 any

     */
    private String frameType;

    /**
     * 截图格式。取值范围：
  jpg - 对应的截图或雪碧图输出文件扩展名为 jpg
  png - 对应的截图或雪碧图输出文件扩展名为 png
缺省值为 jpg

     */
    private String format;

    /**
     * 截图数量。取值范围：[1, 3600]
缺省值为 10
若雪碧图配置不为空，则生成雪碧图，提交的截图任务中，此字段会被雪碧图的行列积所覆盖。

     */
    private Integer number;

    /**
     * 截图时间间隔。取值范围：[1, 100]，单位为秒
若未设置，则对于普通截图，按照截图张数做平均截图；对于雪碧图，则按照行列数乘积做平均截图

     */
    private Integer interval;

    /**
     * 截图宽度，取值范围：[8, 4096]
若宽度和高度同时设置，则按照设置的宽高截图；
若宽度和高度均未设置，则截图保持与源视频相同的宽高值；
若宽度和高度其中一项未设置，则截图保持与源视频相同的宽高比；

     */
    private Integer width;

    /**
     * 截图高度，取值范围：[8, 4096]
若宽度和高度同时设置，则按照设置的宽高截图；
若宽度和高度均未设置，则截图保持与源视频相同的宽高值；
若宽度和高度其中一项未设置，则截图保持与源视频相同的宽高比；

     */
    private Integer height;

    /**
     * 填充方式，当视频宽高与截图宽高指定值不能匹配时的填充处理方式。取值范围：
  stretch - 伸缩
  black - 留黑
  white - 留白
  gauss - 高斯模糊
缺省值为 black

     */
    private String fillType;

    /**
     * 雪碧图配置。若此字段有值，则生成雪碧图。

     */
    private SpriteConfig spriteConfig;


    /**
     * get 模板标题。长度不超过 128 个字节。UTF-8 编码。
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * set 模板标题。长度不超过 128 个字节。UTF-8 编码。
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * get 截图起始时间，取值范围单位为秒，缺省值为 0

     *
     * @return
     */
    public Integer getStartTime() {
        return startTime;
    }

    /**
     * set 截图起始时间，取值范围单位为秒，缺省值为 0

     *
     * @param startTime
     */
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    /**
     * get 截图帧类型。取值范围：
  any - 任意帧
  intra - 关键帧
缺省值为 any

     *
     * @return
     */
    public String getFrameType() {
        return frameType;
    }

    /**
     * set 截图帧类型。取值范围：
  any - 任意帧
  intra - 关键帧
缺省值为 any

     *
     * @param frameType
     */
    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    /**
     * get 截图格式。取值范围：
  jpg - 对应的截图或雪碧图输出文件扩展名为 jpg
  png - 对应的截图或雪碧图输出文件扩展名为 png
缺省值为 jpg

     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     * set 截图格式。取值范围：
  jpg - 对应的截图或雪碧图输出文件扩展名为 jpg
  png - 对应的截图或雪碧图输出文件扩展名为 png
缺省值为 jpg

     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * get 截图数量。取值范围：[1, 3600]
缺省值为 10
若雪碧图配置不为空，则生成雪碧图，提交的截图任务中，此字段会被雪碧图的行列积所覆盖。

     *
     * @return
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * set 截图数量。取值范围：[1, 3600]
缺省值为 10
若雪碧图配置不为空，则生成雪碧图，提交的截图任务中，此字段会被雪碧图的行列积所覆盖。

     *
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * get 截图时间间隔。取值范围：[1, 100]，单位为秒
若未设置，则对于普通截图，按照截图张数做平均截图；对于雪碧图，则按照行列数乘积做平均截图

     *
     * @return
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * set 截图时间间隔。取值范围：[1, 100]，单位为秒
若未设置，则对于普通截图，按照截图张数做平均截图；对于雪碧图，则按照行列数乘积做平均截图

     *
     * @param interval
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * get 截图宽度，取值范围：[8, 4096]
若宽度和高度同时设置，则按照设置的宽高截图；
若宽度和高度均未设置，则截图保持与源视频相同的宽高值；
若宽度和高度其中一项未设置，则截图保持与源视频相同的宽高比；

     *
     * @return
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * set 截图宽度，取值范围：[8, 4096]
若宽度和高度同时设置，则按照设置的宽高截图；
若宽度和高度均未设置，则截图保持与源视频相同的宽高值；
若宽度和高度其中一项未设置，则截图保持与源视频相同的宽高比；

     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * get 截图高度，取值范围：[8, 4096]
若宽度和高度同时设置，则按照设置的宽高截图；
若宽度和高度均未设置，则截图保持与源视频相同的宽高值；
若宽度和高度其中一项未设置，则截图保持与源视频相同的宽高比；

     *
     * @return
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * set 截图高度，取值范围：[8, 4096]
若宽度和高度同时设置，则按照设置的宽高截图；
若宽度和高度均未设置，则截图保持与源视频相同的宽高值；
若宽度和高度其中一项未设置，则截图保持与源视频相同的宽高比；

     *
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * get 填充方式，当视频宽高与截图宽高指定值不能匹配时的填充处理方式。取值范围：
  stretch - 伸缩
  black - 留黑
  white - 留白
  gauss - 高斯模糊
缺省值为 black

     *
     * @return
     */
    public String getFillType() {
        return fillType;
    }

    /**
     * set 填充方式，当视频宽高与截图宽高指定值不能匹配时的填充处理方式。取值范围：
  stretch - 伸缩
  black - 留黑
  white - 留白
  gauss - 高斯模糊
缺省值为 black

     *
     * @param fillType
     */
    public void setFillType(String fillType) {
        this.fillType = fillType;
    }

    /**
     * get 雪碧图配置。若此字段有值，则生成雪碧图。

     *
     * @return
     */
    public SpriteConfig getSpriteConfig() {
        return spriteConfig;
    }

    /**
     * set 雪碧图配置。若此字段有值，则生成雪碧图。

     *
     * @param spriteConfig
     */
    public void setSpriteConfig(SpriteConfig spriteConfig) {
        this.spriteConfig = spriteConfig;
    }


    /**
     * set 模板标题。长度不超过 128 个字节。UTF-8 编码。
     *
     * @param title
     */
    public CreateSnapshotTemplateRequestInfo title(String title) {
        this.title = title;
        return this;
    }

    /**
     * set 截图起始时间，取值范围单位为秒，缺省值为 0

     *
     * @param startTime
     */
    public CreateSnapshotTemplateRequestInfo startTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * set 截图帧类型。取值范围：
  any - 任意帧
  intra - 关键帧
缺省值为 any

     *
     * @param frameType
     */
    public CreateSnapshotTemplateRequestInfo frameType(String frameType) {
        this.frameType = frameType;
        return this;
    }

    /**
     * set 截图格式。取值范围：
  jpg - 对应的截图或雪碧图输出文件扩展名为 jpg
  png - 对应的截图或雪碧图输出文件扩展名为 png
缺省值为 jpg

     *
     * @param format
     */
    public CreateSnapshotTemplateRequestInfo format(String format) {
        this.format = format;
        return this;
    }

    /**
     * set 截图数量。取值范围：[1, 3600]
缺省值为 10
若雪碧图配置不为空，则生成雪碧图，提交的截图任务中，此字段会被雪碧图的行列积所覆盖。

     *
     * @param number
     */
    public CreateSnapshotTemplateRequestInfo number(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * set 截图时间间隔。取值范围：[1, 100]，单位为秒
若未设置，则对于普通截图，按照截图张数做平均截图；对于雪碧图，则按照行列数乘积做平均截图

     *
     * @param interval
     */
    public CreateSnapshotTemplateRequestInfo interval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * set 截图宽度，取值范围：[8, 4096]
若宽度和高度同时设置，则按照设置的宽高截图；
若宽度和高度均未设置，则截图保持与源视频相同的宽高值；
若宽度和高度其中一项未设置，则截图保持与源视频相同的宽高比；

     *
     * @param width
     */
    public CreateSnapshotTemplateRequestInfo width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * set 截图高度，取值范围：[8, 4096]
若宽度和高度同时设置，则按照设置的宽高截图；
若宽度和高度均未设置，则截图保持与源视频相同的宽高值；
若宽度和高度其中一项未设置，则截图保持与源视频相同的宽高比；

     *
     * @param height
     */
    public CreateSnapshotTemplateRequestInfo height(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * set 填充方式，当视频宽高与截图宽高指定值不能匹配时的填充处理方式。取值范围：
  stretch - 伸缩
  black - 留黑
  white - 留白
  gauss - 高斯模糊
缺省值为 black

     *
     * @param fillType
     */
    public CreateSnapshotTemplateRequestInfo fillType(String fillType) {
        this.fillType = fillType;
        return this;
    }

    /**
     * set 雪碧图配置。若此字段有值，则生成雪碧图。

     *
     * @param spriteConfig
     */
    public CreateSnapshotTemplateRequestInfo spriteConfig(SpriteConfig spriteConfig) {
        this.spriteConfig = spriteConfig;
        return this;
    }


}
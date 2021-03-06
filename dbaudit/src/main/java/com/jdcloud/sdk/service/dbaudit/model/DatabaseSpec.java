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

package com.jdcloud.sdk.service.dbaudit.model;


/**
 * 新建数据库的配置
 */
public class DatabaseSpec  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名称，库名,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     */
    private String dbName;

    /**
     * 数据库地址, 可以是IP或域名，支持IPv6
     */
    private String dbAddr;

    /**
     * 数据库端口
     */
    private Integer dbPort;

    /**
     * 数据库类型: 
0-&gt;Oracle
1-&gt;SQLServer
2-&gt;DB2
3-&gt;MySQL
4-&gt;Cache
5-&gt;Sybase
6-&gt;DM7
7-&gt;Informix
9-&gt;人大金仓
10-&gt;Teradata
11-&gt;Postgresql
12-&gt;Gbase
16-&gt;Hive
17-&gt;MongoDB

     */
    private Integer dbType;

    /**
     * 数据库版本
     */
    private String dbVersion;

    /**
     * 用户名，SQLServer获取登录信息使用
     */
    private String username;

    /**
     * 密码，SQLServer获取登录信息使用
     */
    private String password;

    /**
     * 数据库的描述
     */
    private String dbDesc;

    /**
     * 是否对数据进行掩码
     */
    private Boolean dataMask;

    /**
     * 是否对响应进行审计
     */
    private Boolean auditResponse;


    /**
     * get 数据库名称，库名,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名称，库名,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get 数据库地址, 可以是IP或域名，支持IPv6
     *
     * @return
     */
    public String getDbAddr() {
        return dbAddr;
    }

    /**
     * set 数据库地址, 可以是IP或域名，支持IPv6
     *
     * @param dbAddr
     */
    public void setDbAddr(String dbAddr) {
        this.dbAddr = dbAddr;
    }

    /**
     * get 数据库端口
     *
     * @return
     */
    public Integer getDbPort() {
        return dbPort;
    }

    /**
     * set 数据库端口
     *
     * @param dbPort
     */
    public void setDbPort(Integer dbPort) {
        this.dbPort = dbPort;
    }

    /**
     * get 数据库类型: 
0-&gt;Oracle
1-&gt;SQLServer
2-&gt;DB2
3-&gt;MySQL
4-&gt;Cache
5-&gt;Sybase
6-&gt;DM7
7-&gt;Informix
9-&gt;人大金仓
10-&gt;Teradata
11-&gt;Postgresql
12-&gt;Gbase
16-&gt;Hive
17-&gt;MongoDB

     *
     * @return
     */
    public Integer getDbType() {
        return dbType;
    }

    /**
     * set 数据库类型: 
0-&gt;Oracle
1-&gt;SQLServer
2-&gt;DB2
3-&gt;MySQL
4-&gt;Cache
5-&gt;Sybase
6-&gt;DM7
7-&gt;Informix
9-&gt;人大金仓
10-&gt;Teradata
11-&gt;Postgresql
12-&gt;Gbase
16-&gt;Hive
17-&gt;MongoDB

     *
     * @param dbType
     */
    public void setDbType(Integer dbType) {
        this.dbType = dbType;
    }

    /**
     * get 数据库版本
     *
     * @return
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * set 数据库版本
     *
     * @param dbVersion
     */
    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    /**
     * get 用户名，SQLServer获取登录信息使用
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * set 用户名，SQLServer获取登录信息使用
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * get 密码，SQLServer获取登录信息使用
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * set 密码，SQLServer获取登录信息使用
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get 数据库的描述
     *
     * @return
     */
    public String getDbDesc() {
        return dbDesc;
    }

    /**
     * set 数据库的描述
     *
     * @param dbDesc
     */
    public void setDbDesc(String dbDesc) {
        this.dbDesc = dbDesc;
    }

    /**
     * get 是否对数据进行掩码
     *
     * @return
     */
    public Boolean getDataMask() {
        return dataMask;
    }

    /**
     * set 是否对数据进行掩码
     *
     * @param dataMask
     */
    public void setDataMask(Boolean dataMask) {
        this.dataMask = dataMask;
    }

    /**
     * get 是否对响应进行审计
     *
     * @return
     */
    public Boolean getAuditResponse() {
        return auditResponse;
    }

    /**
     * set 是否对响应进行审计
     *
     * @param auditResponse
     */
    public void setAuditResponse(Boolean auditResponse) {
        this.auditResponse = auditResponse;
    }


    /**
     * set 数据库名称，库名,长度限制32字节,允许英文字母,数字,下划线,中划线和中文
     *
     * @param dbName
     */
    public DatabaseSpec dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set 数据库地址, 可以是IP或域名，支持IPv6
     *
     * @param dbAddr
     */
    public DatabaseSpec dbAddr(String dbAddr) {
        this.dbAddr = dbAddr;
        return this;
    }

    /**
     * set 数据库端口
     *
     * @param dbPort
     */
    public DatabaseSpec dbPort(Integer dbPort) {
        this.dbPort = dbPort;
        return this;
    }

    /**
     * set 数据库类型: 
0-&gt;Oracle
1-&gt;SQLServer
2-&gt;DB2
3-&gt;MySQL
4-&gt;Cache
5-&gt;Sybase
6-&gt;DM7
7-&gt;Informix
9-&gt;人大金仓
10-&gt;Teradata
11-&gt;Postgresql
12-&gt;Gbase
16-&gt;Hive
17-&gt;MongoDB

     *
     * @param dbType
     */
    public DatabaseSpec dbType(Integer dbType) {
        this.dbType = dbType;
        return this;
    }

    /**
     * set 数据库版本
     *
     * @param dbVersion
     */
    public DatabaseSpec dbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }

    /**
     * set 用户名，SQLServer获取登录信息使用
     *
     * @param username
     */
    public DatabaseSpec username(String username) {
        this.username = username;
        return this;
    }

    /**
     * set 密码，SQLServer获取登录信息使用
     *
     * @param password
     */
    public DatabaseSpec password(String password) {
        this.password = password;
        return this;
    }

    /**
     * set 数据库的描述
     *
     * @param dbDesc
     */
    public DatabaseSpec dbDesc(String dbDesc) {
        this.dbDesc = dbDesc;
        return this;
    }

    /**
     * set 是否对数据进行掩码
     *
     * @param dataMask
     */
    public DatabaseSpec dataMask(Boolean dataMask) {
        this.dataMask = dataMask;
        return this;
    }

    /**
     * set 是否对响应进行审计
     *
     * @param auditResponse
     */
    public DatabaseSpec auditResponse(Boolean auditResponse) {
        this.auditResponse = auditResponse;
        return this;
    }


}
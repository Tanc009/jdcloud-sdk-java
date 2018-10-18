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

package com.jdcloud.sdk.service.rds.model;


/**
 * slowLogDigest
 */
public class SlowLogDigest  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据库名，表示该SQL是在哪个数据库中执行的
     */
    private String dbName;

    /**
     * SQL语句
     */
    private String sql;

    /**
     * SQL语句执行的开始时间，格式为YYYY-MM-DD hh:mm:ss
     */
    private String executionTime;

    /**
     * SQL语句的执行次数
     */
    private Integer executionCount;

    /**
     * SQL语句执行的时长，单位秒
     */
    private DigestData elapsedTime;

    /**
     * SQL语句等待锁的时间，单位秒
     */
    private DigestData lockTime;

    /**
     * SQL语句的长度
     */
    private DigestData sqlLength;

    /**
     * SQL语句扫描的行数
     */
    private DigestData rowsExamined;

    /**
     * SQL语句返回的行数
     */
    private DigestData rowsReturned;


    /**
     * get 数据库名，表示该SQL是在哪个数据库中执行的
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * set 数据库名，表示该SQL是在哪个数据库中执行的
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     * get SQL语句
     *
     * @return
     */
    public String getSql() {
        return sql;
    }

    /**
     * set SQL语句
     *
     * @param sql
     */
    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * get SQL语句执行的开始时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @return
     */
    public String getExecutionTime() {
        return executionTime;
    }

    /**
     * set SQL语句执行的开始时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param executionTime
     */
    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * get SQL语句的执行次数
     *
     * @return
     */
    public Integer getExecutionCount() {
        return executionCount;
    }

    /**
     * set SQL语句的执行次数
     *
     * @param executionCount
     */
    public void setExecutionCount(Integer executionCount) {
        this.executionCount = executionCount;
    }

    /**
     * get SQL语句执行的时长，单位秒
     *
     * @return
     */
    public DigestData getElapsedTime() {
        return elapsedTime;
    }

    /**
     * set SQL语句执行的时长，单位秒
     *
     * @param elapsedTime
     */
    public void setElapsedTime(DigestData elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    /**
     * get SQL语句等待锁的时间，单位秒
     *
     * @return
     */
    public DigestData getLockTime() {
        return lockTime;
    }

    /**
     * set SQL语句等待锁的时间，单位秒
     *
     * @param lockTime
     */
    public void setLockTime(DigestData lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * get SQL语句的长度
     *
     * @return
     */
    public DigestData getSqlLength() {
        return sqlLength;
    }

    /**
     * set SQL语句的长度
     *
     * @param sqlLength
     */
    public void setSqlLength(DigestData sqlLength) {
        this.sqlLength = sqlLength;
    }

    /**
     * get SQL语句扫描的行数
     *
     * @return
     */
    public DigestData getRowsExamined() {
        return rowsExamined;
    }

    /**
     * set SQL语句扫描的行数
     *
     * @param rowsExamined
     */
    public void setRowsExamined(DigestData rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * get SQL语句返回的行数
     *
     * @return
     */
    public DigestData getRowsReturned() {
        return rowsReturned;
    }

    /**
     * set SQL语句返回的行数
     *
     * @param rowsReturned
     */
    public void setRowsReturned(DigestData rowsReturned) {
        this.rowsReturned = rowsReturned;
    }


    /**
     * set 数据库名，表示该SQL是在哪个数据库中执行的
     *
     * @param dbName
     */
    public SlowLogDigest dbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * set SQL语句
     *
     * @param sql
     */
    public SlowLogDigest sql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * set SQL语句执行的开始时间，格式为YYYY-MM-DD hh:mm:ss
     *
     * @param executionTime
     */
    public SlowLogDigest executionTime(String executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * set SQL语句的执行次数
     *
     * @param executionCount
     */
    public SlowLogDigest executionCount(Integer executionCount) {
        this.executionCount = executionCount;
        return this;
    }

    /**
     * set SQL语句执行的时长，单位秒
     *
     * @param elapsedTime
     */
    public SlowLogDigest elapsedTime(DigestData elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    /**
     * set SQL语句等待锁的时间，单位秒
     *
     * @param lockTime
     */
    public SlowLogDigest lockTime(DigestData lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * set SQL语句的长度
     *
     * @param sqlLength
     */
    public SlowLogDigest sqlLength(DigestData sqlLength) {
        this.sqlLength = sqlLength;
        return this;
    }

    /**
     * set SQL语句扫描的行数
     *
     * @param rowsExamined
     */
    public SlowLogDigest rowsExamined(DigestData rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * set SQL语句返回的行数
     *
     * @param rowsReturned
     */
    public SlowLogDigest rowsReturned(DigestData rowsReturned) {
        this.rowsReturned = rowsReturned;
        return this;
    }


}
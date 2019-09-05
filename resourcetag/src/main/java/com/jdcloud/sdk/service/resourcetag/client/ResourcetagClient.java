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
 * Resource-Tag API
 * 资源标签相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.resourcetag.client;

import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.client.Environment;
import com.jdcloud.sdk.client.Jdcloud;
import com.jdcloud.sdk.client.JdcloudClient;
import com.jdcloud.sdk.client.JdcloudValidateException;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.service.resourcetag.model.DescribeResourcesRequest;
import com.jdcloud.sdk.service.resourcetag.model.DescribeResourcesResponse;
import com.jdcloud.sdk.service.resourcetag.client.DescribeResourcesExecutor;
import com.jdcloud.sdk.service.resourcetag.model.DescribeTagsRequest;
import com.jdcloud.sdk.service.resourcetag.model.DescribeTagsResponse;
import com.jdcloud.sdk.service.resourcetag.client.DescribeTagsExecutor;
import com.jdcloud.sdk.service.resourcetag.model.TagResourcesRequest;
import com.jdcloud.sdk.service.resourcetag.model.TagResourcesResponse;
import com.jdcloud.sdk.service.resourcetag.client.TagResourcesExecutor;
import com.jdcloud.sdk.service.resourcetag.model.UnTagResourcesRequest;
import com.jdcloud.sdk.service.resourcetag.model.UnTagResourcesResponse;
import com.jdcloud.sdk.service.resourcetag.client.UnTagResourcesExecutor;
import com.jdcloud.sdk.service.resourcetag.model.QueryResourceRequest;
import com.jdcloud.sdk.service.resourcetag.model.QueryResourceResponse;
import com.jdcloud.sdk.service.resourcetag.client.QueryResourceExecutor;

/**
 * resourcetagClient
 */
public class ResourcetagClient extends JdcloudClient {

    public final static String ApiVersion = "v1";
    private final static String UserAgentPrefix = "JdcloudSdkJava";
    public final static String ClientVersion = "1.2.0";
    public final static String DefaultEndpoint = "resource-tag.jdcloud-api.com";
    public final static String ServiceName = "resourcetag";
    public final static String UserAgent = UserAgentPrefix + "/" + ClientVersion + " " + ServiceName + "/" + ApiVersion;

    CredentialsProvider credentialsProvider;
    HttpRequestConfig httpRequestConfig;
    Environment environment = new Environment.Builder().endpoint(DefaultEndpoint).build();

    public CredentialsProvider getCredentialsProvider() {
        return credentialsProvider;
    }

    public HttpRequestConfig getHttpRequestConfig() {
        return httpRequestConfig;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public String getVersion() {
        return ApiVersion;
    }

    private ResourcetagClient() {

    }

    public static Builder builder() {
        return new DefaultBuilder();
    }


    /**
     * 获得资源与对应标签列表详情，不含资源名称和可用区。&lt;br/&gt;
注意查询cdn的资源时url中regionId必须指定为cn-all。&lt;br/&gt;
该接口目前不支持分页功能。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeResourcesResponse describeResources(DescribeResourcesRequest request) throws JdcloudSdkException {
        return new DescribeResourcesExecutor().client(this).execute(request);
    }

    /**
     * 获取资源标签。&lt;br/&gt;
注意查询cdn资源的标签时url中regionId必须指定为cn-all。&lt;br/&gt;
注意查询不限制地域时url中regionId必须指定为all-region。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws JdcloudSdkException {
        return new DescribeTagsExecutor().client(this).execute(request);
    }

    /**
     * 资源标签绑定。&lt;br/&gt;
注意cdn资源绑定标签时url中regionId必须指定为cn-all。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws JdcloudSdkException {
        return new TagResourcesExecutor().client(this).execute(request);
    }

    /**
     * 资源标签解绑。&lt;br/&gt;
注意cdn资源解绑标签时url中regionId必须指定为cn-all。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws JdcloudSdkException {
        return new UnTagResourcesExecutor().client(this).execute(request);
    }

    /**
     * 根据标签查找资源。 &lt;br/&gt;
若要查找cdn产品线的资源则url中的regionId必须指定为cn-all。

     *
     * @param request
     * @return
     * @throws JdcloudSdkException
     */
    public QueryResourceResponse queryResource(QueryResourceRequest request) throws JdcloudSdkException {
        return new QueryResourceExecutor().client(this).execute(request);
    }


    public interface Builder {
        public Builder credentialsProvider(CredentialsProvider provider);
        public Builder environment(Environment environment);
        public Builder httpRequestConfig(HttpRequestConfig config);
        public ResourcetagClient build() throws JdcloudSdkException;
    }

    private static class DefaultBuilder implements Builder {

        private ResourcetagClient resourcetagClient;

        public DefaultBuilder() {
            resourcetagClient = new ResourcetagClient();
        }

        public DefaultBuilder credentialsProvider(CredentialsProvider provider) {
            resourcetagClient.credentialsProvider = provider;
            return this;
        }

        public DefaultBuilder httpRequestConfig(HttpRequestConfig config) {
            resourcetagClient.httpRequestConfig = config;
            return this;
        }

        public ResourcetagClient build() throws JdcloudSdkException {

            if (resourcetagClient.credentialsProvider == null) {
                //if credentialsProvider not set, try load jdcloud global default  credentials provider
                resourcetagClient.credentialsProvider = Jdcloud.defaultInstance().getCredentialsProvider();
                if (resourcetagClient.credentialsProvider == null) {
                    throw new JdcloudValidateException("ResourcetagClient build error: jdcloud credentials provider not set");
                }
            }
            if (resourcetagClient.httpRequestConfig == null) {
                resourcetagClient.httpRequestConfig = Jdcloud.defaultInstance().getHttpRequestConfig();
                if (resourcetagClient.httpRequestConfig == null) {
                    throw new JdcloudValidateException("ResourcetagClient build error: http request config not set");
                }
            }
            return resourcetagClient;
        }

        public Builder environment(Environment environment) {
            resourcetagClient.environment = environment;
            return this;
        }
    }
}

package com.kuang.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: spring du
 * @description:
 * @date: 2020/12/16 11:21
 *
 * 两步骤：
 * 1. 找对象
 * 2. 放到Spring中待用
 *
 */
@Configuration
public class ElasticSearchClientConfig {

    @Bean
    public RestHighLevelClient restHighLevelClient() {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("10.40.70.176", 9200, "http")));
        return client;
    }
}

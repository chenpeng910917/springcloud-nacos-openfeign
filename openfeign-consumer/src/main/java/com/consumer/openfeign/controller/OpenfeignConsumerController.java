package com.consumer.openfeign.controller;

import com.consumer.openfeign.rpc.OpenfeignProviderInterfaceRpc;
import com.consumer.openfeign.rpc.OpenfeignProviderRpc;
import com.springcloud.rpc.model.param.HelloProviderParam;
import com.springcloud.rpc.model.vo.HelloProviderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 声明式调用
 *
 * @author chenpeng
 */
@Slf4j
@RestController
public class OpenfeignConsumerController {

    @Resource
    private OpenfeignProviderRpc openfeignProviderRpc;

    @Resource
    private OpenfeignProviderInterfaceRpc openfeignProviderInterfaceRpc;

    /**
     * 自己写接口 声明式调用
     *
     * 127.0.0.1:9001/consumer/getId/1
     * @param id id
     * @return string
     */
    @GetMapping(value = "consumer/getId/{id}")
    public String getId(@PathVariable("id") String id) {
        log.info("getId id={}", id);
        return openfeignProviderRpc.getId(id);
    }

    /**
     * 提供方提供接口 声明式调用
     *
     * 127.0.0.1:9001/consumer/hello?name=张三&age=20
     * @param param 入参
     * @return string
     */
    @GetMapping(value = "consumer/hello")
    public HelloProviderVO hello(HelloProviderParam param) {
        log.info("hello param={}", param);
        return openfeignProviderInterfaceRpc.hello(param);
    }
}

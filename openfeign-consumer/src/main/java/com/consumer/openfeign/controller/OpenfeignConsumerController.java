package com.consumer.openfeign.controller;

import com.consumer.openfeign.rpc.OpenfeignProviderInterfaceRpc;
import com.consumer.openfeign.rpc.OpenfeignProviderRpc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 声明式调用
 *
 * @author chenpeng
 */
@RestController
public class OpenfeignConsumerController {

    @Resource
    private OpenfeignProviderRpc openfeignProviderRpc;

    @Resource
    private OpenfeignProviderInterfaceRpc openfeignProviderInterfaceRpc;

    /**
     * 自己写接口 声明式调用
     *
     * @param id id
     * @return string
     */
    @GetMapping(value = "consumer/getId/{id}")
    public String getId(@PathVariable("id") String id) {
        return openfeignProviderRpc.getId(id);
    }

    /**
     * 提供方提供接口 声明式调用
     *
     * @param id id
     * @return string
     */
    @GetMapping(value = "consumer/getId1/{id}")
    public String getId1(@PathVariable("id") String id) {
        return openfeignProviderInterfaceRpc.getId(id);
    }
}

package com.consumer.openfeign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chenpeng
 */
@FeignClient(value = "nacos-provider1", fallback = OpenfeignProviderRpcFallback.class)
public interface OpenfeignProviderRpc {

    @GetMapping(value = "/provider/getId/{id}")
    String getId(@PathVariable("id") String id);

}
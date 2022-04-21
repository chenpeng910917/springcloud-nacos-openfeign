package com.consumer.openfeign.rpc;

import com.springcloud.rpc.OpenfeignProvider;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author chenpeng
 */
@FeignClient(value = "nacos-provider", fallback = OpenfeignProviderInterfaceRpcFallback.class)
public interface OpenfeignProviderInterfaceRpc extends OpenfeignProvider {
}

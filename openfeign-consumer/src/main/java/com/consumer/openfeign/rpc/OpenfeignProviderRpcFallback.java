package com.consumer.openfeign.rpc;

import org.springframework.stereotype.Component;

/**
 * @author chenpeng
 */
@Component
public class OpenfeignProviderRpcFallback implements OpenfeignProviderRpc {
    @Override
    public String getId(String id) {
        return "降级处理";
    }
}

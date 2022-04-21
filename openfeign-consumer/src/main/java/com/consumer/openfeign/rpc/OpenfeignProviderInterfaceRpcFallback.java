package com.consumer.openfeign.rpc;

import com.springcloud.rpc.model.param.HelloProviderParam;
import com.springcloud.rpc.model.vo.HelloProviderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author chenpeng
 */
@Slf4j
@Component
public class OpenfeignProviderInterfaceRpcFallback implements OpenfeignProviderInterfaceRpc {
    @Override
    public HelloProviderVO hello(HelloProviderParam param) {
        log.info("降级处理");
        return null;
    }
}

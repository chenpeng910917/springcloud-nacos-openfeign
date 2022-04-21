package com.provider.openfeign.controller;

import com.springcloud.rpc.OpenfeignProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenpeng
 */
@Slf4j
@RestController
public class OpenfeignProviderInterfaceController implements OpenfeignProvider {
    @Override
    public String getId(String id) {
        log.info("OpenfeignProviderInterfaceController 声明式提供接口调用 id={}", id);
        return id;
    }
}

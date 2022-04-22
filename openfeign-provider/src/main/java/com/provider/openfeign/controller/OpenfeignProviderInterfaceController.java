package com.provider.openfeign.controller;

import com.springcloud.rpc.OpenfeignProvider;
import com.springcloud.rpc.model.param.HelloProviderParam;
import com.springcloud.rpc.model.vo.HelloProviderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenpeng
 */
@Slf4j
@RestController
public class OpenfeignProviderInterfaceController implements OpenfeignProvider {

    /**
     * 127.0.0.1:9000/provider/hello
     * {
     *     "name":"多个",
     *     "age":44
     * }
     *
     * @param param
     * @return
     */
    @Override
    public HelloProviderVO hello(HelloProviderParam param) {
        log.info("OpenfeignProviderInterfaceController 声明式提供接口调用 param={}", param);
        HelloProviderVO helloProviderVO = new HelloProviderVO();
        helloProviderVO.setName(param.getName());
        helloProviderVO.setAge(param.getAge());
        return helloProviderVO;
    }
}

package com.springcloud.rpc;

import com.springcloud.rpc.model.param.HelloProviderParam;
import com.springcloud.rpc.model.vo.HelloProviderVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author chenpeng
 */
public interface OpenfeignProvider {

    @PostMapping(value = "/provider/hello")
    HelloProviderVO hello(@RequestBody HelloProviderParam param);

}
package com.springcloud.rpc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author chenpeng
 */
public interface OpenfeignProvider {

    @GetMapping(value = "/provider/getId1/{id}")
    String getId(@PathVariable("id") String id);

}
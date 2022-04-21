package com.provider.openfeign.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenpeng
 */
@Slf4j
@RestController
public class OpenfeignProviderController {

    @GetMapping(value = "/provider/getId/{id}")
    public String getId(@PathVariable("id") String id) {
        log.info("OpenfeignProviderController收到请求id={}", id);
        return id;
    }
}

package dev.be.moduleapi.logback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 사용할 logger
@Slf4j(topic = "SQL_LOG1")
@RestController
public class QueryController {

    @GetMapping("/query1")
    public String query1(){
        log.trace("log --> trace");
        log.debug("log --> debug");
        log.info("log --> info");
        log.warn("log --> warn");
        log.error("log --> error");
        return "query1";
    }

}

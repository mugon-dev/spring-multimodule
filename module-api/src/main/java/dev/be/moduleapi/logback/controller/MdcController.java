package dev.be.moduleapi.logback.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MdcController {

    /*
    MDC -> 멀티쓰레드 환경에서 로그를 남길 때 사용하는 개념
    로그백에서 해당 값에 저장된 값을 동적으로 가져와서 출력시키기 위해 사용
     */
    @GetMapping("/mdc")
    public String mdc() {
        MDC.put("job","dev");
        log.trace("log --> trace");
        log.debug("log --> debug");
        log.info("log --> info");
        log.warn("log --> warn");
        log.error("log --> error");
        MDC.clear(); // 반드시 clear 해야함
        return "mdc";
    }
}

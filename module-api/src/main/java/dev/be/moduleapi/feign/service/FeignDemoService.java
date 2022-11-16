package dev.be.moduleapi.feign.service;

import dev.be.moduleapi.feign.common.dto.BaseRequestInfo;
import dev.be.moduleapi.feign.common.dto.BaseResponseInfo;
import dev.be.moduleapi.feign.custom.client.DemoFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeignDemoService {

    private final DemoFeignClient feignClient;

    public String get() {
        ResponseEntity<BaseResponseInfo> response = feignClient.callGet(
            "CustomHeader", "CustomName", 1L);
        System.out.println("Name : "+response.getBody().getName());
        System.out.println("Age : "+response.getBody().getAge());
        System.out.println("Header : "+response.getBody().getHeader());
        return "get";
    }

    public String post() {
        BaseRequestInfo baseRequestInfo = BaseRequestInfo.builder().name("customName").age(2L).build();
        ResponseEntity<BaseResponseInfo> response = feignClient.callPost(
            "CustomHeader", baseRequestInfo);
        System.out.println("Name : "+response.getBody().getName());
        System.out.println("Age : "+response.getBody().getAge());
        System.out.println("Header : "+response.getBody().getHeader());
        return "post";
    }


}

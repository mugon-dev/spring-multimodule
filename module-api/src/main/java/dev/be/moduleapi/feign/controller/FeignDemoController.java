package dev.be.moduleapi.feign.controller;

import dev.be.moduleapi.feign.service.FeignDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FeignDemoController {

    private final FeignDemoService feignDemoService;

    @GetMapping("/get")
    public String getController() {
        return feignDemoService.get();
    }

    @GetMapping("/post")
    public String postController() {
        return feignDemoService.post();
    }
}

package dev.be.moduleapi.feign.custom.interceptor;

import feign.Request.HttpMethod;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
public class DemoFeignInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        // get 요청일 경우
        if(template.method() == HttpMethod.GET.name()){
            System.out.println("[GET] [DemoFeignInterceptor] queries: "+template.queries());
            return;
        }
        // post 요청일 경우

    }
}

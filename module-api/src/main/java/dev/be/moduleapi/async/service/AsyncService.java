package dev.be.moduleapi.async.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AsyncService {

    private final EmailService emailService;

    public void asyncCall_1() {
        System.out.println("[asyncCall_1] :: " + Thread.currentThread().getName());
        // bean 주입을 받아서 사용하는 async
        emailService.sendMail();
        emailService.sendMailWithCustomThreadPool();
        /*
        - 비동기로 동작할 수 있게 Sub Thread에게 위임
        - emailService.sendMail()
         */
    }

    public void asyncCall_2() {
        System.out.println("[asyncCall_2] :: " + Thread.currentThread().getName());
        // instance 생성 - Spring container에 등록된 bean 사용 x
        EmailService emailService1 = new EmailService();
        emailService1.sendMail();
        emailService1.sendMailWithCustomThreadPool();
    }

    public void asyncCall_3() {
        System.out.println("[asyncCall_3] :: " + Thread.currentThread().getName());
        // Bean을 사용해야 스프링 프레임워크의 도움을 받을 수 있음
        // 사실상 @Async 붙이지 않은 것처럼 동작함 -> 비동기하기 동작 X
        sendMail();
    }

    @Async
    public void sendMail() {
        System.out.println("[sendMail] :: " + Thread.currentThread().getName());
    }
}

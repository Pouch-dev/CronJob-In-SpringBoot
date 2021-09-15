package com.example.springboot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SpringConfigure {

    @Scheduled(fixedDelay = 5000)
    public void scheduleFixedDelayTask() {
    //fixedDelay: Khoảng thời gian từ khi hoàn thành công việc cũ và bắt đầu một công việc mới được gán cố định là 5 giây.
        System.out.println("---------------------------------------------------------");
        System.out.println("Tui là Phước Fixed delay");
        System.out.println("Fixed delay task - " + System.currentTimeMillis() / 5000);
    }

    @Scheduled(fixedRate = 5000)
    public void scheduleFixedRateTask() {
    //fixedRate: Khoảng thời gian từ khi bắt đầu một công việc mới được gán cố định là 5 giây.
        System.out.println("Tui là Phước Fixed rate");
        System.out.println("Fixed rate task - " + System.currentTimeMillis() / 5000);
        System.out.println("---------------------------------------------------------");
    }
}

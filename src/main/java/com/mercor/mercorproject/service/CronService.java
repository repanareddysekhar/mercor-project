package com.mercor.mercorproject.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Log4j2
@Service
public class CronService {

    @PostConstruct
    public void onStart() {
        log.info("App started: Cron initialised [Migration starting]");
    }

    @PreDestroy
    public void onShutdown() {
        log.info("App shutdown: Cron shutdown [Migration shutdown]");
    }

    @Scheduled(fixedRate = 10000)
    public void cron() {
        log.info("Migration Check Executed at {}", LocalDateTime.now());
    }
}

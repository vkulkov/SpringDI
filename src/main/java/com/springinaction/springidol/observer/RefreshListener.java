package com.springinaction.springidol.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class RefreshListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("event!");
    }
}

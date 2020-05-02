package com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CaliforniaRoll implements Maki {

    @Override
    public void addFish() {
        log.info("california roll fish: imitation crab");
    }

    @Override
    public void addFillings() {
        log.info("california roll fillings: avocado and cucumber");
    }

    @Override
    public void addTopics() {
        log.info("california roll topic: no topic");
    }
}
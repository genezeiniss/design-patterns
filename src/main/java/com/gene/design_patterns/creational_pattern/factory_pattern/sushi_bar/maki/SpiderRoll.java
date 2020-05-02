package com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpiderRoll implements Maki {

    @Override
    public void addFish() {
        log.info("spider roll fish: deep fried soft-shell crab");
    }

    @Override
    public void addFillings() {
        log.info("spider roll fillings: cucumber, avocado, daikon sprouts or lettuce, roe and spicy mayonnaise");
    }

    @Override
    public void addTopics() {
        log.info("spider roll topics: no topic");
    }
}
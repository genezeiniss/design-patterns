package com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DragonRoll implements Maki {

    @Override
    public void addFish() {
        log.info("dragon roll fish: shrimp tempura");
    }

    @Override
    public void addFillings() {
        log.info("dragon roll fillings: avocado and cucumber");
    }

    @Override
    public void addTopics() {
        log.info("dragon roll topics: slices of avocado along with tobiko");
    }
}
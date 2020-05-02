package com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpicyTunaRoll implements Maki {

    @Override
    public void addFish() {
        log.info("spicy tuna roll fish: raw tuna mixed with spicy mayonnaise");
    }

    @Override
    public void addFillings() {
        log.info("spicy tuna roll fillings: no fillings");
    }

    @Override
    public void addTopics() {
        log.info("spicy tuna roll topics: no topic");
    }
}
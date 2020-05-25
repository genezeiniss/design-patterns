package com.gene.design_patterns.behavioral_pattern.template_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Outfit {

    public void createDailyLook() {
        describeTop();
        describeBottom();
        describeFootwear();
        drawDescribedOutfit();
        cutDrawnOutfit();
    }

    public abstract void describeTop();

    public abstract void describeBottom();

    public abstract void describeFootwear();

    public void drawDescribedOutfit() {
        log.info("drawing outfit according to selections");
    }

    public void cutDrawnOutfit() {
        log.info("cutting drawn outfit");
    }
}
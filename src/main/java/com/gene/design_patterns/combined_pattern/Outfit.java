package com.gene.design_patterns.combined_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Outfit {

    public final void createDailyLook() {
        describeTop();
        describeBottom();
        describeFootwear();
        drawDescribedOutfit();
        cutDrawnOutfit();
    }

    public abstract void describeTop();

    public abstract void describeBottom();

    public abstract void describeFootwear();

    private void drawDescribedOutfit() {
        log.info("drawing outfit according to selections");
    }

    private void cutDrawnOutfit() {
        log.info("cutting drawn outfit");
    }
}
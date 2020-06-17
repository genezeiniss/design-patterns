package com.gene.design_patterns.behavioral_pattern.strategy_pattern.breathing;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BreathAtEndOfUnderwaterArmPull implements BreathingStrategy {

    @Override
    public void breathing() {
        log.info("To breathe, the swimmer turns his head to the side during the arm recovery until the mouth is above the water surface.");
    }
}
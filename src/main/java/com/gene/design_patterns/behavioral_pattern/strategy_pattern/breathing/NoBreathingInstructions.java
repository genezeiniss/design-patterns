package com.gene.design_patterns.behavioral_pattern.strategy_pattern.breathing;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoBreathingInstructions implements BreathingStrategy {

    @Override
    public void breathing() {
        log.info("No breathing instructions");
    }
}

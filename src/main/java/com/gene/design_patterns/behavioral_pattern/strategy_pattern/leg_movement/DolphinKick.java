package com.gene.design_patterns.behavioral_pattern.strategy_pattern.leg_movement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DolphinKick implements LegMovementStrategy {

    @Override
    public void legMovement() {
        log.info("The legs held together and move up and down symmetrically with the feet extended.");
    }
}
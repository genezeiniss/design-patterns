package com.gene.design_patterns.behavioral_pattern.strategy_pattern.leg_movement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlutterKick implements LegMovementStrategy {

    @Override
    public void legMovement() {
        log.info("The legs perform fast, compact movements, alternating up and down with outstretch feet");
    }
}
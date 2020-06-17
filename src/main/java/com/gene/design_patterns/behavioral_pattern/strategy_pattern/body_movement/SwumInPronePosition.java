package com.gene.design_patterns.behavioral_pattern.strategy_pattern.body_movement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwumInPronePosition implements BodyMovementStrategy {

    @Override
    public void bodyMovement() {
        log.info("The body moves from a horizontal position during a short, " +
                "streamlined glide phase to a more inclined position during the arm recovery phase.");
    }
}
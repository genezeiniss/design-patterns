package com.gene.design_patterns.behavioral_pattern.strategy_pattern.body_movement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwumInHorizontalPosition implements BodyMovementStrategy {

    @Override
    public void bodyMovement() {
        log.info("The body rolls from side to side, always turning to the side of the arm that is currently pulling in the water.");
    }
}
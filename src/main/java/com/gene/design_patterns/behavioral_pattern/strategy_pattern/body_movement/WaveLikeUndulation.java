package com.gene.design_patterns.behavioral_pattern.strategy_pattern.body_movement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaveLikeUndulation implements BodyMovementStrategy {

    @Override
    public void bodyMovement() {
        log.info(
                "The body executes a wave-like undulation, where the chest and the hips move up and down in the water in a specific order.");
    }
}
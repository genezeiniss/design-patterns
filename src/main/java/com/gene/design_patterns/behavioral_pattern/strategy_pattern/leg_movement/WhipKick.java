package com.gene.design_patterns.behavioral_pattern.strategy_pattern.leg_movement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WhipKick implements LegMovementStrategy {

    @Override
    public void legMovement() {
        log.info("First, the legs are fully extended at the end of the glide phase." +
                "The feet then move toward the buttocks during the leg recovery.");
        log.info("Finally, during the propulsive phase of the kick, the feet move outward and backward from the buttocks, " +
                "then inward and backward, to return to the fully extended leg position.");
    }
}
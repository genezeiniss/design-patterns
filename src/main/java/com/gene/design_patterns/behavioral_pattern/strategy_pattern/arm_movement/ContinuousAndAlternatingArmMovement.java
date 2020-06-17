package com.gene.design_patterns.behavioral_pattern.strategy_pattern.arm_movement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContinuousAndAlternatingArmMovement implements ArmMovementStrategy {

    @Override
    public void armMovement() {
        log.info("While one arm pulls underwater from an extended forward position down to the hip, " +
                "the other arm recovers above the water, from the hip to the extended forward position.");
    }
}

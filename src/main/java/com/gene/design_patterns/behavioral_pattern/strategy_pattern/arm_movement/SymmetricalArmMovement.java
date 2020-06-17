package com.gene.design_patterns.behavioral_pattern.strategy_pattern.arm_movement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SymmetricalArmMovement implements ArmMovementStrategy {

    @Override
    public void armMovement() {
        log.info("The hands trace an hourglass pattern underwater, " +
                "moving from an extended forward position to below the chest and then to the hips.");
    }
}
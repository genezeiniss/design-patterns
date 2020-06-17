package com.gene.design_patterns.behavioral_pattern.strategy_pattern.arm_movement;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimultaneousAndSymmetricalArmMovement implements ArmMovementStrategy {

    @Override
    public void armMovement() {
        log.info("As the arms are pulled backward underwater, the hands create an arc, " +
                "moving from a forward extended position to a position below the chest.");
        log.info("During the arm recovery, the hands move in a straight line from the position below " +
                "the chest to the extended forward position.");
    }
}
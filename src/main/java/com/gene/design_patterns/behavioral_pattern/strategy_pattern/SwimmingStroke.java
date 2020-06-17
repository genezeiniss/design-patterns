package com.gene.design_patterns.behavioral_pattern.strategy_pattern;

import com.gene.design_patterns.behavioral_pattern.strategy_pattern.arm_movement.ArmMovementStrategy;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.body_movement.BodyMovementStrategy;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.breathing.BreathingStrategy;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.leg_movement.LegMovementStrategy;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class SwimmingStroke {

    private final BodyMovementStrategy bodyMovementStrategy;
    private final ArmMovementStrategy armMovementStrategy;
    private final LegMovementStrategy legMovementStrategy;
    private final BreathingStrategy breathingStrategy;

    public void executeBodyMovement() {
        bodyMovementStrategy.bodyMovement();
    }

    public void executeArmMovement() {
        armMovementStrategy.armMovement();
    }

    public void executeLegMovementStrategy() {
        legMovementStrategy.legMovement();
    }

    public void executeBreathingStrategy() {
        breathingStrategy.breathing();
    }
}
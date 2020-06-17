package com.gene.design_patterns.behavioral_pattern.strategy_pattern;

import com.gene.design_patterns.behavioral_pattern.strategy_pattern.arm_movement.ContinuousAndAlternatingArmMovement;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.body_movement.SwumInHorizontalPosition;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.breathing.BreathDuringTheArmRecovery;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.leg_movement.FlutterKick;

public class Freestyle extends SwimmingStroke {

    public Freestyle() {
        super(new SwumInHorizontalPosition(), new ContinuousAndAlternatingArmMovement(),
                new FlutterKick(), new BreathDuringTheArmRecovery());
    }
}
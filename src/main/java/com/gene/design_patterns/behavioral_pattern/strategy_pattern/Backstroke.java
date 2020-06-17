package com.gene.design_patterns.behavioral_pattern.strategy_pattern;

import com.gene.design_patterns.behavioral_pattern.strategy_pattern.arm_movement.ContinuousAndAlternatingArmMovement;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.body_movement.SwumInHorizontalPosition;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.breathing.NoBreathingInstructions;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.leg_movement.FlutterKick;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Backstroke extends SwimmingStroke {

    public Backstroke() {
        super(new SwumInHorizontalPosition(), new ContinuousAndAlternatingArmMovement(),
                new FlutterKick(), new NoBreathingInstructions());
    }
}
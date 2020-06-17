package com.gene.design_patterns.behavioral_pattern.strategy_pattern;

import com.gene.design_patterns.behavioral_pattern.strategy_pattern.arm_movement.SimultaneousAndSymmetricalArmMovement;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.body_movement.SwumInPronePosition;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.breathing.BreathAtEndOfUnderwaterArmPull;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.leg_movement.WhipKick;

public class Breaststroke extends SwimmingStroke {

    public Breaststroke() {
        super(new SwumInPronePosition(), new SimultaneousAndSymmetricalArmMovement(),
                new WhipKick(), new BreathAtEndOfUnderwaterArmPull());
    }
}
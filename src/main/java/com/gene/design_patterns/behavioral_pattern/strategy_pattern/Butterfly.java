package com.gene.design_patterns.behavioral_pattern.strategy_pattern;

import com.gene.design_patterns.behavioral_pattern.strategy_pattern.arm_movement.SymmetricalArmMovement;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.body_movement.WaveLikeUndulation;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.breathing.BreathDuringTheArmRecovery;
import com.gene.design_patterns.behavioral_pattern.strategy_pattern.leg_movement.DolphinKick;

public class Butterfly extends SwimmingStroke {

    public Butterfly() {
        super(new WaveLikeUndulation(), new SymmetricalArmMovement(), new DolphinKick(), new BreathDuringTheArmRecovery());
    }
}
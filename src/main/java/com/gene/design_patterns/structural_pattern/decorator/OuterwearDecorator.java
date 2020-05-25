package com.gene.design_patterns.structural_pattern.decorator;

import com.gene.design_patterns.behavioral_pattern.template_method.Outfit;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class OuterwearDecorator extends Outfit {

    public abstract void describeOuterwear();

    @Override
    public void createDailyLook() {
        describeTop();
        describeBottom();
        describeFootwear();
        describeOuterwear();
        drawDescribedOutfit();
        cutDrawnOutfit();
    }
}
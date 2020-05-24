package com.gene.design_patterns.combined_pattern;

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
package com.gene.design_patterns.structural_pattern.decorator;

import com.gene.design_patterns.behavioral_pattern.template_method.Outfit;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class CoatDecorator extends OuterwearDecorator {

    private final Outfit outfit;

    @Override
    public void describeOuterwear() {
        log.info("camel coat");
    }

    @Override
    public void describeTop() {
        outfit.describeTop();
    }

    @Override
    public void describeBottom() {
        outfit.describeBottom();
    }

    @Override
    public void describeFootwear() {
        outfit.describeFootwear();
    }
}

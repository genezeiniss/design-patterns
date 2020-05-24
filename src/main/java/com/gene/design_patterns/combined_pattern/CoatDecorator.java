package com.gene.design_patterns.combined_pattern;

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

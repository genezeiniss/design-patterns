package com.gene.design_patterns.combined_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutumnOutfit extends Outfit {

    @Override
    public void describeTop() {
        log.info("white sweater");
    }

    @Override
    public void describeBottom() {
        log.info("ripped jeans");
    }

    @Override
    public void describeFootwear() {
        log.info("veja sneakers");
    }
}

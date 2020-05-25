package com.gene.design_patterns.behavioral_pattern.template_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SummerOutfit extends Outfit {

    @Override
    public void describeTop() {
        log.info("white blouse");
    }

    @Override
    public void describeBottom() {
        log.info("denim shorts");
    }

    @Override
    public void describeFootwear() {
        log.info("neutral lace-up flats");
    }
}
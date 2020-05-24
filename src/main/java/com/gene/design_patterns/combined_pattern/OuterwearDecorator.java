package com.gene.design_patterns.combined_pattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class OuterwearDecorator extends Outfit {

    public abstract void describeOuterwear();
}
package com.gene.design_patterns.aggregation;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Thing {

    String type;
    String name;
}

package com.gene.design_patterns.what_do_we_know_about.aggregation;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Thing {

    String type;
    String name;
}

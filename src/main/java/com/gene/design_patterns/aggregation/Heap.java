package com.gene.design_patterns.aggregation;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Heap {

    private String height;
    private String location;
    private List<Thing> thing;

    public Heap createHeapOfClothes() {
        Heap heap = new Heap();
        heap.setHeight("huge");
        heap.setLocation("on the bathroom floor");
        heap.setThing(Arrays.asList(
                Thing.builder().type("clothes").name("t-shirt").build(),
                Thing.builder().type("clothes").name("jeans").build(),
                Thing.builder().type("clothes").name("right sock").build(),
                Thing.builder().type("clothes").name("left sock").build()));
        return heap;
    }
}
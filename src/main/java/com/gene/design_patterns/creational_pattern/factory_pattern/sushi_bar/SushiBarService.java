package com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar;

import com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki.Maki;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SushiBarService {

    private final SushiFactory sushiFactory;

    public Maki createRoll(RollType rollType) {

        Maki maki = sushiFactory.createMakiBase(rollType);

        // assembly sushi
        maki.addFish();
        maki.addFillings();
        maki.addTopics();

        log.info("roll sushi up");
        return maki;
    }
}
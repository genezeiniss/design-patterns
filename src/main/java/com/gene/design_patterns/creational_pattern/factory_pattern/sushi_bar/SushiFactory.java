package com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar;

import com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static io.vavr.API.*;

@Slf4j
@Service
public class SushiFactory {

    public Maki createMakiBase(RollType rollType) {
        return Match(rollType).of(
                Case($(RollType.CALIFORNIA_ROLL), new CaliforniaRoll()),
                Case($(RollType.DRAGON_ROLL), new DragonRoll()),
                Case($(RollType.SPICY_TUNA_ROLL), new SpicyTunaRoll()),
                Case($(RollType.SPIDER_ROLL), new SpiderRoll()),
                Case($(), () -> {
                    log.info("provided sushi type is undefined");
                    return null;
                })
        );
    }
}
package com.gene.design_patterns

import com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.RollType
import com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.SushiBarService
import com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.SushiFactory
import com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki.CaliforniaRoll
import com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki.DragonRoll
import com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki.SpicyTunaRoll
import com.gene.design_patterns.creational_pattern.factory_pattern.sushi_bar.maki.SpiderRoll
import spock.lang.Specification
import spock.lang.Unroll

class SushiBarServiceSpec extends Specification {

    SushiFactory sushiFactory
    SushiBarService sushiBarService

    def setup() {
        sushiFactory = new SushiFactory()
        sushiBarService = new SushiBarService(sushiFactory)
    }

    @Unroll
    def "create roll - #scenario"() {
        expect: "created roll expected to be instance of specific sub class"
        def roll = sushiBarService.createRoll(rollType)
        assert roll in expectedClass

        where:
        scenario          | rollType                 || expectedClass
        "california roll" | RollType.CALIFORNIA_ROLL || CaliforniaRoll
        "dragon roll"     | RollType.DRAGON_ROLL     || DragonRoll
        "spicy tuna roll" | RollType.SPICY_TUNA_ROLL || SpicyTunaRoll
        "spider roll"     | RollType.SPIDER_ROLL     || SpiderRoll
    }
}
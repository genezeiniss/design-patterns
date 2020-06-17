package com.gene.design_patterns

import com.gene.design_patterns.behavioral_pattern.template_method.Season
import com.gene.design_patterns.behavioral_pattern.template_method.SeasonOutfitFactory
import com.gene.design_patterns.structural_pattern.decorator.OutfitService
import spock.lang.Specification
import spock.lang.Unroll

class OutfitServiceSpec extends Specification {

    SeasonOutfitFactory seasonOutfitFactory
    OutfitService outfitService

    def setup() {
        seasonOutfitFactory = new SeasonOutfitFactory()
        outfitService = new OutfitService(seasonOutfitFactory)
    }

    @Unroll
    def "create season outfit - template method"() {
        when:
        outfitService.createOutfit(season)

        then:
        noExceptionThrown()

        where:
        season << [Season.SUMMER, Season.AUTUMN]
    }

    def "create autumn outfit with coat - template method with decorator"() {
        when:
        outfitService.createAutumnOutfitWithCoat()

        then:
        noExceptionThrown()
    }
}
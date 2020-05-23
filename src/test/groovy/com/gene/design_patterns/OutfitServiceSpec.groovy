package com.gene.design_patterns

import com.gene.design_patterns.combined_pattern.OutfitService
import com.gene.design_patterns.combined_pattern.Season
import com.gene.design_patterns.combined_pattern.SeasonOutfitFactory
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
    def "create summer outfit"() {
        when:
        outfitService.createOutfit(season)

        then:
        noExceptionThrown()

        where:
        season << [Season.SUMMER, Season.AUTUMN]
    }
}
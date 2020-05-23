package com.gene.design_patterns.combined_pattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static io.vavr.API.*;

@Slf4j
@Service
public class SeasonOutfitFactory {

    public Outfit createOutfit(Season season) {
        return Match(season).of(
                Case($(Season.SUMMER), new SummerOutfit()),
                Case($(Season.AUTUMN), new AutumnOutfit()),
                Case($(), () -> {
                    log.info("the outfit for provided {} season is undefined", season.toString().toLowerCase());
                    return null;
                })
        );
    }
}

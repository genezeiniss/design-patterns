package com.gene.design_patterns.combined_pattern;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OutfitService {

    private final SeasonOutfitFactory seasonOutfitFactory;

    public void createOutfit(Season season) {
        Outfit seasonOutfit = seasonOutfitFactory.createOutfit(season);
        seasonOutfit.createDailyLook();
    }
}
package com.gene.design_patterns.structural_pattern.decorator;

import com.gene.design_patterns.behavioral_pattern.template_method.Outfit;
import com.gene.design_patterns.behavioral_pattern.template_method.Season;
import com.gene.design_patterns.behavioral_pattern.template_method.SeasonOutfitFactory;
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

    public void createAutumnOutfitWithCoat() {
        Outfit autumnOutfit = seasonOutfitFactory.createOutfit(Season.AUTUMN);
        autumnOutfit = new CoatDecorator(autumnOutfit);
        autumnOutfit.createDailyLook();
    }
}
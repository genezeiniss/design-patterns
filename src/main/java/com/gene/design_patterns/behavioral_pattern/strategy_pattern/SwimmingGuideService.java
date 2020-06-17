package com.gene.design_patterns.behavioral_pattern.strategy_pattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SwimmingGuideService {

    public void overviewFreestyleStroke() {
        SwimmingStroke freestyle = new Freestyle();
        freestyle.executeBodyMovement();
        freestyle.executeArmMovement();
        freestyle.executeLegMovementStrategy();
        freestyle.executeBreathingStrategy();
    }

    public void overviewBreastStroke() {
        SwimmingStroke breaststroke = new Breaststroke();
        breaststroke.executeBodyMovement();
        breaststroke.executeArmMovement();
        breaststroke.executeLegMovementStrategy();
        breaststroke.executeBreathingStrategy();
    }

    public void overviewButterflyStroke() {
        SwimmingStroke butterfly = new Butterfly();
        butterfly.executeBodyMovement();
        butterfly.executeArmMovement();
        butterfly.executeLegMovementStrategy();
        butterfly.executeBreathingStrategy();
    }

    public void overviewBackstrokeStroke() {
        SwimmingStroke backstroke = new Backstroke();
        log.info("swum on the back in a horizontal position");
        backstroke.executeBodyMovement();
        log.info("continuously and alternately arms movement in opposite direction");
        backstroke.executeArmMovement();
        backstroke.executeLegMovementStrategy();
        backstroke.executeBreathingStrategy();
    }
}
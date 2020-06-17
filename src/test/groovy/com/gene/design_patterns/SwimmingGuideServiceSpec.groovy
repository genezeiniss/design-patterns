package com.gene.design_patterns

import com.gene.design_patterns.behavioral_pattern.strategy_pattern.SwimmingGuideService
import spock.lang.Specification

class SwimmingGuideServiceSpec extends Specification {

    SwimmingGuideService swimmingGuideService = new SwimmingGuideService()

    def "overview freestyle stroke"() {
        when:
        swimmingGuideService.overviewFreestyleStroke()

        then:
        noExceptionThrown()
    }
/*
    logs:
    SwumInHorizontalPosition - The body rolls from side to side, always turning to the side of the arm that is currently pulling in the water.
    ContinuousAndAlternatingArmMovement - While one arm pulls underwater from an extended forward position down to the hip, the other arm recovers above the water, from the hip to the extended forward position.
    FlutterKick - The legs perform fast, compact movements, alternating up and down with outstretch feet
    BreathingDuringTheArmRecovery - To breathe, the swimmer turns his head to the side during the arm recovery until the mouth is above the water surface.
*/

    def "overview breaststroke stroke"() {
        when:
        swimmingGuideService.overviewBreastStroke()

        then:
        noExceptionThrown()
    }

/*
    logs:
    SwumInPronePosition - The body moves from a horizontal position during a short, streamlined glide phase to a more inclined position during the arm recovery phase.
    SimultaneousAndSymmetricalArmMovement - As the arms are pulled backward underwater, the hands create an arc, moving from a forward extended position to a position below the chest.
    SimultaneousAndSymmetricalArmMovement - During the arm recovery, the hands move in a straight line from the position below the chest to the extended forward position.
    WhipKick - First, the legs are fully extended at the end of the glide phase.The feet then move toward the buttocks during the leg recovery.
    WhipKick - Finally, during the propulsive phase of the kick, the feet move outward and backward from the buttocks, then inward and backward, to return to the fully extended leg position.
    BreathAtEndOfUnderwaterArmPull - To breathe, the swimmer turns his head to the side during the arm recovery until the mouth is above the water surface.
*/

    def "overview butterfly stroke"() {
        when:
        swimmingGuideService.overviewButterflyStroke()

        then:
        noExceptionThrown()
    }

/*
    logs:
    WaveLikeUndulation - The body executes a wave-like undulation, where the chest and the hips move up and down in the water in a specific order.
    SymmetricalArmMovement - The hands trace an hourglass pattern underwater, moving from an extended forward position to below the chest and then to the hips.
    DolphinKick - The legs held together and move up and down symmetrically with the feet extended.
    BreathDuringTheArmRecovery - To breathe, the swimmer turns his head to the side during the arm recovery until the mouth is above the water surface.
*/

    def "overview backstroke stroke"() {
        when:
        swimmingGuideService.overviewBackstrokeStroke()

        then:
        noExceptionThrown()
    }

/*
    log:
    SwimmingGuideService - swum on the back in a horizontal position
    SwumInHorizontalPosition - The body rolls from side to side, always turning to the side of the arm that is currently pulling in the water.
    SwimmingGuideService - continuously and alternately arms movement in opposite direction
    ContinuousAndAlternatingArmMovement - While one arm pulls underwater from an extended forward position down to the hip, the other arm recovers above the water, from the hip to the extended forward position.
    FlutterKick - The legs perform fast, compact movements, alternating up and down with outstretch feet
    NoBreathingInstructions - No breathing instructions
    */
}
package de.grubabua.advancedwelcometitle.gradientlist;

import java.util.HashMap;
import java.util.Map;

public class Gradients {
    public Gradients() {

    }
    static Map<Integer, String> gradientMap = Map.ofEntries(
            Map.entry(1, "<gradient:#FB0000:#FFFFFF>"),
            Map.entry(2, "<gradient:#C3175B:#015790>"),
            Map.entry(3, "<gradient:#FE4D1E:#FFC291>"),
            Map.entry(4, "<gradient:#8F37FF:#B3846C>"),
            Map.entry(5, "<gradient:#44FF67:#D9F6D0>"),
            Map.entry(6, "<gradient:#FE0000:#370000>"),
            Map.entry(7, "<gradient:#61686C:#CFCFCF>")
    );

    public String createGradientMessage(String message, int gradientNumber) {
        String createdString = gradientMap.get(gradientNumber) + message + "</gradient>";
        return createdString;
    }
}

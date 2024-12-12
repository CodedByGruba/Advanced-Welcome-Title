package de.grubabua.advancedwelcometitle.gradientlist;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.text.MessageFormat;
import java.util.HashMap;

public class gradients {
    public gradients() {
        //asd
    }
    HashMap<Integer, String> gradientMap = new HashMap<Integer, String>();

    public static String createGradient(String message, int number) {
        return null;
    }


    void initializeGradientMap() {
        gradientMap.put(1, "<gradient:#FB0000:#FFFFFF>");
        gradientMap.put(2, "<gradient:#C3175B:#015790>");
        gradientMap.put(3, "<gradient:#FE4D1E:#FFC291>");
        gradientMap.put(4, "<gradient:#8F37FF:#B3846C>");
        gradientMap.put(5, "<gradient:#44FF67:#D9F6D0>");
        gradientMap.put(6, "<gradient:#FE0000:#370000>");
        gradientMap.put(7, "<gradient:#61686C:#CFCFCF>");
    }






    public static String createGradientTitle1(String message) {

        String[] colors = {"§x§F§B§0§0§0§0", "§x§F§B§0§8§0§8", "§x§F§B§1§0§1§0", "§x§F§B§1§9§1§9", "§x§F§C§2§1§2§1", "§x§F§C§2§9§2§9", "§x§F§C§3§1§3§1", "§x§F§C§3§A§3§A", "§x§F§C§4§2§4§2", "§x§F§C§4§A§4§A", "§x§F§C§5§2§5§2", "§x§F§C§5§A§5§A", "§x§F§D§6§3§6§3", "§x§F§D§6§B§6§B", "§x§F§D§7§3§7§3", "§x§F§D§7§B§7§B", "§x§F§D§8§4§8§4", "§x§F§D§8§C§8§C", "§x§F§D§9§4§9§4", "§x§F§D§9§C§9§C", "§x§F§E§A§5§A§5", "§x§F§E§A§D§A§D", "§x§F§E§B§5§B§5", "§x§F§E§B§D§B§D", "§x§F§E§C§5§C§5", "§x§F§E§C§E§C§E", "§x§F§E§D§6§D§6", "§x§F§E§D§E§D§E", "§x§F§F§E§6§E§6", "§x§F§F§E§F§E§F", "§x§F§F§F§7§F§7", "§x§F§F§F§F§F§F"};

        StringBuilder gradientTitle1 = new StringBuilder();


        int colorStartIndex = 0;
        int colorEndIndex = colors.length - 1;
        double stepSize = (double) colorEndIndex / Math.max(message.length(), 1);

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int colorIndex = (int) Math.round(stepSize * i);
            gradientTitle1.append(colors[colorIndex]).append(currentChar);
        }

        return gradientTitle1.toString();
    }
    public static String createGradientTitle2(String message) {

        String[] colors = {"§x§C§3§1§7§5§B", "§x§B§D§1§9§5§D", "§x§B§6§1§B§5§E", "§x§B§0§1§D§6§0", "§x§A§A§1§F§6§2", "§x§A§4§2§1§6§4", "§x§9§D§2§3§6§5", "§x§9§7§2§5§6§7", "§x§9§1§2§8§6§9", "§x§8§B§2§A§6§A", "§x§8§4§2§C§6§C", "§x§7§E§2§E§6§E", "§x§7§8§3§0§7§0", "§x§7§2§3§2§7§1", "§x§6§B§3§4§7§3", "§x§6§5§3§6§7§5", "§x§5§F§3§8§7§6", "§x§5§9§3§A§7§8", "§x§5§2§3§C§7§S", "§x§4§C§3§E§7§B", "§x§4§6§4§0§7§D", "§x§4§0§4§2§7§F", "§x§3§9§4§4§8§1", "§x§3§3§4§6§8§2", "§x§2§D§4§9§8§4", "§x§2§7§4§B§8§6", "§x§2§0§4§D§8§7", "§x§1§A§4§F§8§9", "§x§1§4§5§1§8§B", "§x§0§E§5§3§8§D", "§x§0§7§5§5§8§E", "§x§0§1§5§7§9§0"};

        StringBuilder gradientTitle2 = new StringBuilder();


        int colorStartIndex = 0;
        int colorEndIndex = colors.length - 1;
        double stepSize = (double) colorEndIndex / Math.max(message.length(), 1);

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int colorIndex = (int) Math.round(stepSize * i);
            gradientTitle2.append(colors[colorIndex]).append(currentChar);
        }
        return gradientTitle2.toString();
    }
    public static String createGradientTitle3(String message) {

        String[] colors = {"§x§F§E§4§D§1§E", "§x§F§E§5§1§2§2", "§x§F§E§5§5§2§5", "§x§F§E§5§8§2§9", "§x§F§E§5§C§2§D", "§x§F§E§6§0§3§1", "§x§F§E§6§4§3§4", "§x§F§E§6§7§3§8", "§x§F§E§6§B§3§C", "§x§F§E§6§F§3§F", "§x§F§E§7§3§4§3", "§x§F§E§7§7§4§7", "§x§F§E§7§A§4§B", "§x§F§E§7§E§4§E", "§x§F§E§8§2§5§2", "§x§F§E§8§6§5§6", "§x§F§F§8§9§5§9", "§x§F§F§8§D§5§D", "§x§F§F§9§1§6§1", "§x§F§F§9§5§6§4", "§x§F§F§9§8§6§8", "§x§F§F§9§C§6§C", "§x§F§F§A§0§7§0", "§x§F§F§A§4§7§3", "§x§F§F§A§8§7§7", "§x§F§F§A§B§7§B", "§x§F§F§A§F§7§E", "§x§F§F§B§3§8§2", "§x§F§F§B§7§8§6", "§x§F§F§B§A§8§A", "§x§F§F§B§E§8§D", "§x§F§F§C§2§9§1"};

        StringBuilder gradientTitle3 = new StringBuilder();


        int colorStartIndex = 0;
        int colorEndIndex = colors.length - 1;
        double stepSize = (double) colorEndIndex / Math.max(message.length(), 1);

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int colorIndex = (int) Math.round(stepSize * i);
            gradientTitle3.append(colors[colorIndex]).append(currentChar);
        }
        return gradientTitle3.toString();
    }
    public static String createGradientTitle4(String message) {

        String[] colors = {"§x§8§F§3§7§F§F", "§x§9§0§3§9§F§A", "§x§9§1§3§C§F§6", "§x§9§2§3§E§F§1", "§x§9§4§4§1§E§C", "§x§9§5§4§3§E§7", "§x§9§6§4§6§E§3", "§x§9§7§4§8§D§E", "§x§9§8§4§B§D§9", "§x§9§9§4§D§D§4", "§x§9§B§5§0§D§0", "§x§9§C§5§2§C§B", "§x§9§D§5§5§C§6", "§x§9§E§5§7§C§1", "§x§9§F§5§A§B§D", "§x§A§0§5§C§B§8", "§x§A§2§5§F§B§3", "§x§A§3§6§1§A§E", "§x§A§4§6§4§A§A", "§x§A§5§6§6§A§5", "§x§A§6§6§9§A§0", "§x§A§7§6§B§9§B", "§x§A§9§6§E§9§7", "§x§A§A§7§0§9§2", "§x§A§B§7§3§8§D", "§x§A§C§7§5§8§8", "§x§A§D§7§8§8§4", "§x§A§E§7§A§7§F", "§x§B§0§7§D§7§A", "§x§B§1§7§F§7§5", "§x§B§2§8§2§7§1", "§x§B§3§8§4§6§C"};

        StringBuilder gradientTitle4 = new StringBuilder();


        int colorStartIndex = 0;
        int colorEndIndex = colors.length - 1;
        double stepSize = (double) colorEndIndex / Math.max(message.length(), 1);

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int colorIndex = (int) Math.round(stepSize * i);
            gradientTitle4.append(colors[colorIndex]).append(currentChar);
        }
        return gradientTitle4.toString();
    }
    public static String createGradientTitle5(String message) {

        String[] colors = {"§x§4§4§F§F§6§7", "§x§4§9§F§F§6§A", "§x§4§E§F§E§6§E", "§x§5§2§F§E§7§1", "§x§5§7§F§E§7§5", "§x§5§C§F§E§7§8", "§x§6§1§F§D§7§B", "§x§6§6§F§D§7§F", "§x§6§A§F§D§8§2", "§x§6§F§F§C§8§5", "§x§7§4§F§C§8§9", "§x§7§9§F§C§8§C", "§x§7§E§F§C§9§0", "§x§8§2§F§B§9§3", "§x§8§7§F§B§9§6", "§x§8§C§F§B§9§A", "§x§9§1§F§A§9§D", "§x§9§6§F§A§A§1", "§x§9§B§F§A§A§4", "§x§9§F§F§9§A§7", "§x§A§4§F§9§A§B", "§x§A§9§F§9§A§E", "§x§A§E§F§9§B§2", "§x§B§3§F§8§B§5", "§x§B§7§F§8§B§8", "§x§B§C§F§8§B§C", "§x§C§1§F§7§B§F", "§x§C§6§F§7§C§2", "§x§C§B§F§7§C§6", "§x§C§F§F§7§C§9", "§x§D§4§F§6§C§D", "§x§D§9§F§6§D§0"};

        StringBuilder gradientTitle5 = new StringBuilder();


        int colorStartIndex = 0;
        int colorEndIndex = colors.length - 1;
        double stepSize = (double) colorEndIndex / Math.max(message.length(), 1);

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int colorIndex = (int) Math.round(stepSize * i);
            gradientTitle5.append(colors[colorIndex]).append(currentChar);
        }
        return gradientTitle5.toString();
    }
    public static String createGradientTitle6(String message) {

        String[] colors = {"§x§F§E§0§0§0§0", "§x§F§8§0§0§0§0", "§x§F§1§0§0§0§0", "§x§E§B§0§0§0§0", "§x§E§4§0§0§0§0", "§x§D§E§0§0§0§0", "§x§D§7§0§0§0§0", "§x§D§1§0§0§0§0", "§x§C§B§0§0§0§0", "§x§C§4§0§0§0§0", "§x§B§E§0§0§0§0", "§x§B§7§0§0§0§0", "§x§B§1§0§0§0§0", "§x§A§B§0§0§0§0", "§x§A§4§0§0§0§0", "§x§9§E§0§0§0§0", "§x§9§7§0§0§0§0", "§x§9§1§0§0§0§0", "§x§8§A§0§0§0§0", "§x§8§4§0§0§0§0", "§x§7§E§0§0§0§0", "§x§7§7§0§0§0§0", "§x§7§1§0§0§0§0", "§x§6§A§0§0§0§0", "§x§6§4§0§0§0§0", "§x§5§E§0§0§0§0", "§x§5§7§0§0§0§0", "§x§5§1§0§0§0§0", "§x§4§A§0§0§0§0", "§x§4§4§0§0§0§0", "§x§3§D§0§0§0§0", "§x§3§7§0§0§0§0"};

        StringBuilder gradientTitle6 = new StringBuilder();


        int colorStartIndex = 0;
        int colorEndIndex = colors.length - 1;
        double stepSize = (double) colorEndIndex / Math.max(message.length(), 1);

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int colorIndex = (int) Math.round(stepSize * i);
            gradientTitle6.append(colors[colorIndex]).append(currentChar);
        }
        return gradientTitle6.toString();
    }
    public static String createGradientTitle7(String message) {

        String[] colors = {"§x§6§1§6§8§6§C", "§x§6§5§6§B§6§F", "§x§6§8§6§F§7§2", "§x§6§C§7§2§7§6", "§x§6§F§7§5§7§9", "§x§7§3§7§9§7§C", "§x§7§6§7§C§7§F", "§x§7§A§7§F§8§2", "§x§7§D§8§3§8§6", "§x§8§1§8§6§8§9", "§x§8§4§8§9§8§C", "§x§8§8§8§D§8§F", "§x§8§C§9§0§9§2", "§x§8§F§9§3§9§6", "§x§9§3§9§7§9§9", "§x§9§6§9§A§9§C", "§x§9§A§9§D§9§F", "§x§9§D§A§0§A§2", "§x§A§1§A§4§A§5", "§x§A§4§A§7§A§9", "§x§A§8§A§A§A§C", "§x§A§C§A§E§A§F", "§x§A§F§B§1§B§2", "§x§B§3§B§4§B§5", "§x§B§6§B§8§B§9", "§x§B§A§B§B§B§C", "§x§B§D§B§E§B§F", "§x§C§1§C§2§C§2", "§x§C§4§C§5§C§5", "§x§C§8§C§8§C§9", "§x§C§B§C§C§C§C", "§x§C§F§C§F§C§F" };

        StringBuilder gradientTitle7 = new StringBuilder();


        int colorStartIndex = 0;
        int colorEndIndex = colors.length - 1;
        double stepSize = (double) colorEndIndex / Math.max(message.length(), 1);

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int colorIndex = (int) Math.round(stepSize * i);
            gradientTitle7.append(colors[colorIndex]).append(currentChar);
        }
        return gradientTitle7.toString();
    }

}

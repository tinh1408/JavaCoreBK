package com.ateach.quizz.reviewPf1;

public class IpAddresss {
    boolean isIPv4Address(String s) {
        String[] bytes = s.split("\\.", 4);
        for (String b : bytes) {
            try {
                Integer.parseInt(b);
            } catch (Exception e) {
                return false;
            }
            if (bytes.length != 4 || !(Integer.parseInt(b) <= 255 && Integer.parseInt(b) >= 0)) {
                return false;
            }
        }
        return true;
    }
}

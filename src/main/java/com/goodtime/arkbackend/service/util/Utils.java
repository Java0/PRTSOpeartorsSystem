package com.goodtime.arkbackend.service.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Utils {
    public static String getUUID(){
        return UUID.randomUUID().toString().split("-")[1];
    }

    public static String getMd5(String... inputs){
        StringBuilder input = new StringBuilder();
        for (String s : inputs) {
            input.append(s);
        }

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.toString().getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}

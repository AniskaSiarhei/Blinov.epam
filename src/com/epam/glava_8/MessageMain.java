package com.epam.glava_8;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageMain {
    public static void main(String[] args) {
	String encrypted = "Pass_1";
        MessageDigest messageDigest = null;
        byte[] bytesEncoded = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(encrypted.getBytes(StandardCharsets.UTF_8));
            bytesEncoded = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        BigInteger bigInteger = new BigInteger(1, bytesEncoded);
        String resHex = bigInteger.toString(16);
        System.out.println(resHex);
    }
}

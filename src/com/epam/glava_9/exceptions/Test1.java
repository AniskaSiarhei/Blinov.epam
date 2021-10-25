package com.epam.glava_9.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Test1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        try {
            test1.parseFromFrance("123");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public double parseFromFrance(String numberStr) throws ParseException {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        double numFrance = 0;
        numFrance = format.parse(numberStr).doubleValue();
        return numFrance;
    }

    public double parseFromFileBefore(String fileName) throws FileNotFoundException, IOException, ParseException {
        NumberFormat formatFrance = NumberFormat.getInstance(Locale.FRANCE);
        double numFrance = 0;
        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String number = bufferedReader.readLine();
            numFrance = formatFrance.parse(number).doubleValue();

        } catch (Exception e) {
            throw e;
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return numFrance;
    }

    public void devideByZero() {
        try {
            int a = (int) ((Math.random() * 2) - 1);
            System.out.println("a = " + a);
            try {
                int b = 1 / a;
                StringBuilder builder = new StringBuilder(a);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("invalid buffer size = " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("divide by zero!");
        }
    }



}













package com.epam.glava_7.supplier;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<String> supplierNumber = plus(1.123456f, 2.0000000f);
        System.out.println("res = " + supplierNumber.get());
        Supplier<String> supplierTime = buildTime("yyyy-MM-dd HH:mm:ss");
        System.out.println("time = " + supplierTime.get());
    }

    private static Supplier<String> buildTime(String timePattern) {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(timePattern);
        return () -> timeFormatter.format(LocalDateTime.now());
    }

    private static Supplier<String> plus(float a, float b) {
        BigDecimal decimal1 = new BigDecimal(a);
        BigDecimal decimal2 = new BigDecimal(b);

        BigDecimal res = decimal1.add(decimal2, MathContext.DECIMAL32);
        return () -> res.toEngineeringString();

    }
}

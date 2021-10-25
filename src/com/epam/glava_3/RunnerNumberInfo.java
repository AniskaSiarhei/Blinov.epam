package com.epam.glava_3;

public class RunnerNumberInfo {
    public static void main(String[] args) {
    NumberInfo info = new NumberInfo();
    float[] num = {new Float(7.f), 71.f, 3.14f, 7.2f};
        for (float n: num) {
            info.viewNum(n);
        }

        info.viewNum(new Integer(8));
        info.viewNum(81);
        info.viewNum(4.14f);
        info.viewNum(8.2);
    }
}

class NumberInfo {
    public void viewNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }
    public void viewNum(int i) {
        System.out.printf("int = %d%n", i);
    }
    public void viewNum(float f) {
        System.out.printf("float = %.4f%n", f);
    }
    public void viewNum(Number n) {
        System.out.println("Number = " + n);
    }
}











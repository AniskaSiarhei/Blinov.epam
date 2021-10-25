package com.epam.glava_3;

public class MessageMain {
    public static void main(String[] args) {
        Message<Integer> ob1 = new Message<>();
        ob1.setValue(1);
        int v1 = ob1.getValue();
        System.out.println(v1);

        Message<String> ob2 = new Message<>("Java");
        String v2 = ob2.getValue();
        System.out.println(v2);

        Message ob3 = new Message();
        ob3 = ob1;
        System.out.println(ob3.getValue());
        ob3.setValue(new Byte((byte) 2));
        System.out.println(ob3.getValue());
        ob3.setValue("Java SE 12");
        System.out.println(ob3);

        ob3.setValue(71);
        System.out.println(ob3);
        ob3.setValue(null);
        System.out.println(ob3);
    }
}

class Message <T> {
    private T value;

    public Message() {}
    public Message(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == null) {
            return null;
        }
        return value.getClass().getName() + ": " + value;
    }
}














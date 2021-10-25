package com.epam.glava_8.string;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(":", "<<", ">>");
        System.out.println(stringJoiner.toString());
        String result = stringJoiner.add("blanc").add("rouge").add("blanc").toString();
        System.out.println(result);

        String xml = "<?xml version=\"1.0\" encoding =\"UTF-8" + "\n" +
                "<book>\n" +
                "    <name>Java from Epam</name>\n" +
                "    <author id = \"777\">Blinov</author>\n" +
                "</book>\n";
        System.out.println(xml.toString());

        String xmlBlock = """
                <?xml version =1.0 encoding = "UTF-8">
                    <book>
                        <name>Java from Epam</name>
                        <author id = "777">Blinov</author>
                    </book>
                """;
        System.out.println(xmlBlock);
    }
}

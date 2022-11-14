package com.collection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("..s");
        Matcher m = p1.matcher("sas");
        boolean b = m.matches();
        System.out.println(b);

        boolean b1 = Pattern.compile("..t").matcher("ant").matches();
        System.out.println(b1);

        boolean b2 = Pattern.matches(".i", "li");
        System.out.println(b2);

        System.out.println(Pattern.matches("[a-zA-Z0-9@,#,&]{9}", "Gita1@#23"));
        System.out.println();
    }
}


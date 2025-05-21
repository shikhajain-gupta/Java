package com.String;

public class stringMethods {
    public static void main(String[] args) {
        String s1 = "name1";
        String s2 = new String("name2");
       // System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);

       // String s3= s1.toUpperCase();
        //System.out.println(s3);

        //System.out.println(s1.charAt(0));

        //System.out.println(s1.compareTo(s2));

        //System.out.println(s1.concat("ab"));

        //System.out.println(s1.indexOf('a'));
        //System.out.println(s1.lastIndexOf('a'));
        //System.out.println(s1.length());
        //System.out.println(s1.replace('a', 'b'));
        //System.out.println(s1.repeat(2));
        //System.out.println(s1.replaceAll("ame", "shikha"));
        //System.out.println(s1.substring(0,2));
        //System.out.println(s1.matches(s2));

        String myStr = " Split a string by   spaces, and also   punctuation.   ";
        String regex = "[,\\.\\s]+";
        String[] myArray = myStr.split(regex);
        for (String s : myArray) {
            System.out.println(s);
        }
        System.out.println(myStr.trim().replaceAll("\\s+", " "));


    }

}

package com.example.week6_testpiglatin;

import java.util.ArrayList;

public class PigLatin {


        public static void main(String[] args) {
            String engl = "chicken soup";
            String[] strEngl = engl.split("\\s");
            for (int i = 0; i < strEngl.length; i++){
                strEngl[i] = pigLatinTranslate(strEngl[i]);
                System.out.print(strEngl[i]+ " ");
            }

        }


        public static String pigLatinTranslate(String english){

            String firstSub ;
            String secondSub;
            int endpoint = 0;

            for(int i = 0; i < english.length(); i++){
                if ((english.toCharArray()[i]==('a'))||english.toCharArray()[i]==('e')||english.toCharArray()[i]==('i')||
                english.toCharArray()[i]==('o')||english.toCharArray()[i]==('u')){
                    endpoint = i;
                    break;
                } else {
                    endpoint = i;
                }
            }

            firstSub = english.substring(0, endpoint);
            secondSub = english.substring(endpoint, english.length());
            return secondSub + firstSub + "ay";
        }
}

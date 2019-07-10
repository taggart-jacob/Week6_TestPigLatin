package com.example.week6_testpiglatin;

public class PigLatin {


        public static void main(String[] args) {
            String engl = "chicken";
            pigLatinTranslate(engl);
        }


        public static void pigLatinTranslate(String english){

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
            System.out.print(secondSub + firstSub + "ay");
        }
}

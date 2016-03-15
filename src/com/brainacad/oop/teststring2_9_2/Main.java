package com.brainacad.oop.teststring2_9_2;

/**
 * Created by m18 on 02.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        StringBuilder solutiontFor2_9_2 = new StringBuilder();
         /*Write cod to display all of the letters, which are present
         in the first word, but absent in the second.
        */
        // with arrays
        char[] arr1 = myStr1.toLowerCase().toCharArray();
        char[] arr2 = myStr2.toLowerCase().toCharArray();
        for(char ell1 : arr1){
            boolean uniq = true;
            for (char ell2 : arr2){
                if(ell1 == ell2){
                    uniq = false;
                    break;
                }
            }
            if(uniq){
                solutiontFor2_9_2.append(ell1);
            }
        }
        System.out.println(solutiontFor2_9_2);
    }
}

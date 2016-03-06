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
        for (int i = 0; i < myStr1.length(); i++) {
            if ((myStr2.toLowerCase()).indexOf((myStr1.toLowerCase()).charAt(i)) < 0) {
                solutiontFor2_9_2.append(myStr1.charAt(i));
            }
        }
        System.out.println(solutiontFor2_9_2);
    }
}

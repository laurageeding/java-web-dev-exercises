package org.launchcode.java.studios.studio2countingcharacters;

import java.util.*;

public class CountCharacters {
    public static void main(String[] args) {
        CountCharacters cc = new CountCharacters();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        cc.countChars(str);
        //cc.countChars("It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.");
    }

    public void countChars(String str) {
        char[] strArr;
        while (str.length() != 0) {
            strArr = str.toCharArray();
            char letter = strArr[0];
            int count = 0;
            for (int i = 0; i < strArr.length; i++) {
                if (letter == strArr[i]) {
                    count++;
                }
            }
            if(((letter != ' ') && (letter != ',') && (letter != '.'))){
                System.out.println(letter + ": " + count);
            }
            str = str.replace(""+letter, "");
        }

    }

}
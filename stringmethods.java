// stringmethods.java
// Simple string manipulation program
// Vincent Bove
// 12/4/23

import java.util.Scanner;   // imports scanner to take inputs from the user

public class stringmethods {
    public static void main(String[] args) {
        int list[] = {89, 111, 117, 114, 32, 112, 114, 111, 103, 114, 97, 109, 32, 115, 104, 111, 117, 108, 100, 32, 102, 105, 114, 115, 116, 32, 100, 101, 99, 111, 100, 101, 32, 116, 104, 105, 115, 32, 98, 108, 111, 99, 107, 32, 111, 102, 32, 116, 101, 120, 116, 32, 97, 110, 100, 32, 100, 105, 115, 112, 108, 97, 121, 32, 105, 116, 46, 32, 84, 104, 101, 110, 44, 32, 112, 114, 111, 109, 112, 116, 32, 116, 104, 101, 32, 117, 115, 101, 114, 32, 102, 111, 114, 32, 97, 32, 110, 97, 109, 101, 46, 32, 84, 97, 107, 101, 32, 116, 104, 97, 116, 32, 110, 97, 109, 101, 32, 97, 110, 100, 32, 111, 117, 116, 112, 117, 116, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 58, 32, 84, 104, 101, 32, 110, 97, 109, 101, 32, 105, 110, 32, 114, 101, 118, 101, 114, 115, 101, 44, 32, 116, 104, 101, 32, 82, 101, 118, 101, 114, 115, 101, 32, 111, 114, 100, 101, 114, 32, 105, 110, 32, 65, 76, 76, 32, 67, 65, 80, 73, 84, 65, 76, 83, 44, 32, 116, 104, 101, 32, 111, 114, 105, 103, 105, 110, 97, 108, 32, 115, 116, 114, 105, 110, 103, 32, 117, 115, 105, 110, 103, 32, 67, 97, 77, 101, 76, 32, 99, 65, 115, 69, 44, 32, 97, 110, 100, 32, 102, 105, 110, 97, 108, 108, 121, 32, 116, 104, 101, 32, 111, 114, 105, 103, 105, 110, 97, 108, 32, 115, 116, 114, 105, 110, 103, 32, 105, 110, 32, 65, 83, 67, 73, 73, 46, 32, 68, 79, 32, 78, 79, 84, 32, 85, 83, 69, 32, 65, 78, 89, 32, 83, 84, 82, 73, 78, 71, 32, 77, 65, 78, 73, 80, 85, 76, 65, 84, 73, 79, 78, 32, 77, 69, 84, 72, 79, 68, 83, 46, 13, 10};
        String msg;
        for(int i: list){
            msg = Character.toString((char)i);
            System.out.print(msg);
        }

        // Gets a name from the user and assigns it to the name variable

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a name:");
        String name = scan.nextLine();

        // Prints the name in reverse order and assigns it to reverseName

        String reverseName = "";
        for(int i=name.length();i>0;--i) {
            reverseName+=name.charAt(i - 1);
        }
        System.out.println(reverseName);

        // Converts each letter in the reverse name string to ASCII, capitalizes it, converts it back to a char, and prints it
        // Uses an if statement to make sure the ASCII character is a letter (avoids printing symbols when spaces are in the string)

        String capitalResult = "";
        for (int i = 0; i < reverseName.length(); i++) {
            int letter = reverseName.charAt(i);
            if (letter > 96 && letter < 123) {
                letter -= 32;
            }
            capitalResult+=(char)letter;
        }
        System.out.println(capitalResult);

        // Reuses the same method for capitalizing the reverse string to create camel case
        // The if statement checks if the i is even to alternate the letters capitalized

        String ccResult = "";
        for (int i = 0; i < name.length(); i++) {
            int letter = name.charAt(i);
            if (i % 2 == 0) {
                if (letter > 96 && letter < 123) {
                    letter -= 32;
                }
            }
            ccResult+=(char)letter;
        }
        System.out.println(ccResult);

        // Converts each letter in the name string to ascii and adds it to a result string which is then printed

        String asciiResult = "";
        for (int i = 0; i < name.length(); i++) {
            asciiResult+=(int)name.charAt(i) + " ";
        }
        System.out.println(asciiResult);

    }
}

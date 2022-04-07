
/*
    Category : Cryptography
    Description:
    We found this weird message being passed around on the servers, we think we have a working decrpytion scheme.
    Download the message: https://artifacts.picoctf.net/c/393/message.txt

    Take each number mod 37 and map it to the following character set: 
    0-25 is the alphabet (uppercase), 26-35 are the decimal digits, and 36 is an underscore. 
    Wrap your decrypted message in the picoCTF flag format (i.e. picoCTF{decrypted_message})

*/

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class basicmod1 {
    public static void main(String[] args) {
        try {
            // USE ABSOLUTE PATH HERE:
            Scanner file = new Scanner(
                    Paths.get("/home/arg0x/Documents/Java-Programs/picoCTF/2022/basic-mod1/message.txt"));

            ArrayList<Character> chars = new ArrayList<>();

            while (file.hasNext()) {
                int num = Integer.valueOf(file.nextInt());
                int mod1 = num % 37;

                if (mod1 >= 0 && mod1 <= 25) {
                    int nom = mod1 + 65;
                    char ch = (char) nom;
                    chars.add(ch);
                }
                if (mod1 >= 26 && mod1 <= 35) {
                    int nom = mod1 + 22;
                    char ch = (char) nom;
                    chars.add(ch);
                }
                if (mod1 == 36) {
                    int nom = mod1 + 59;
                    char ch = (char) nom;
                    chars.add(ch);
                }

            }
            System.out.print("picoCTF{");
            for (char i : chars) {
                System.out.print(i);
            }
            System.out.println("}");

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

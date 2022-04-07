
/*
    Category : Cryptography
    Description:
    A new modular challenge!

    Download the message https://artifacts.picoctf.net/c/499/message.txt
    Take each number mod 41 and find the modular inverse for the result. 
    Then map to the following character set: 1-26 are the alphabet, 27-36 are the decimal digits, 
    and 37 is an underscore. 
    Wrap your decrypted message in the picoCTF flag format (i.e. picoCTF{decrypted_message})
*/
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class basicmod2 {
    public static void main(String args[]) throws Exception {
        try {
            // USE ABSOLUTE PATH HERE
            Scanner file = new Scanner(
                    Paths.get("/home/j/Documents/Java-Programs/picoCTF/2022/basic-mod2/message.txt"));

            ArrayList<Character> chars = new ArrayList<>();

            while (file.hasNext()) {
                int num = Integer.valueOf(file.nextInt());

                int i = 0, mul = 0, inv = 0, res = 0;
                while (true) {
                    mul = num * i;
                    inv = mul % 41;
                    if (inv == 1) {
                        res = i;
                        break;
                    }
                    i++;
                }

                if (res >= 1 && res <= 26) {
                    int nom = res + 64;
                    char ch = (char) nom;
                    chars.add(ch);
                }
                if (res >= 27 && res <= 36) {
                    int nom = res + 21;
                    char ch = (char) nom;
                    chars.add(ch);
                }
                if (res == 37) {
                    int nom = res + 58;
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

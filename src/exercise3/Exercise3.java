package exercise3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise3 {
    private static final String inputFilePath = "ficEntree.txt";

    public static void main(String[] args) {
        try {
            System.out.println(sumCharacter('f', inputFilePath));
            System.out.println(sumCharacter('e', inputFilePath));
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static int sumCharacter(char charToSum, String filePath) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int sum = 0;
            int character;
            while ((character = reader.read()) != -1) {
                if (character == charToSum) {
                    sum++;
                }
            }
            return sum;
        }
    }
}

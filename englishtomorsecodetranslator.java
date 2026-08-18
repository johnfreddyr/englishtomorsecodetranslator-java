import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char[] letters = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
            'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."
        };

        char[] numbers = {
            '0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9'
        };

        String[] numberMorse = {
            "-----", ".----", "..---", "...--", "....-",
            ".....", "-....", "--...", "---..", "----."
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine().toUpperCase();

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            // For spaces
            if (currentChar == ' ') {
                System.out.print("/ ");
                continue;
            }

            // For letters
            boolean found = false;

            for (int j = 0; j < letters.length; j++) {
                if (currentChar == letters[j]) {
                    System.out.print(morse[j] + " ");
                    found = true;
                    break;
                }
            }

            // For numbers
            if (!found) {
                for (int j = 0; j < numbers.length; j++) {
                    if (currentChar == numbers[j]) {
                        System.out.print(numberMorse[j] + " ");
                        found = true;
                        break;
                    }
                }
            }

            // For special characters
            if (!found) {
                System.out.print("? ");
            }
        }

        sc.close();
    }
}

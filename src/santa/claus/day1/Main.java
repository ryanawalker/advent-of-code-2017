package santa.claus.day1;

public class Main {

    public static void main(String[] args) {
        String testInput = ""; // Enter test input here.

        System.out.println(captcha(testInput));
        System.out.println(captcha2(testInput));
    }

    public static int captcha(String input) {

        int sum = 0; // initialize sum
        int length = input.length(); // grab length for readability

        for (int i = 0; i < length; i++) { // iterate through string by index

            int curCharValue = Character.getNumericValue(input.charAt(i)); // grab current/next character numeric values
            int nextCharValue = Character.getNumericValue(input.charAt((i + 1) % length)); // modulo by length for wrap

            if (curCharValue == nextCharValue) { // if match, add to sum
                sum += curCharValue;
            }

        }

        return sum;

    }

    public static int captcha2(String input) { // works exactly the same as above, but checks half the string away

        int sum = 0;
        int length = input.length();
        int checkInt = length / 2;

        for (int i = 0; i < length; i++) {

            int curCharValue = Character.getNumericValue(input.charAt(i));
            int nextCharValue = Character.getNumericValue(input.charAt((i + checkInt) % length));

            if (curCharValue == nextCharValue) {
                sum += curCharValue;
            }

        }

        return sum;

    }

}

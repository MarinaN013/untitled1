package HomeWork_2_1;

public class VowelCounter {
    public static int countVowels(String input) {
        if (input == null) {
            return 0;
        }

        int count = 0;
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}

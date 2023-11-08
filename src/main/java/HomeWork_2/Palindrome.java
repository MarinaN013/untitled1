package HomeWork_2;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        // Удаляем пробелы и приводим к нижнему регистру для игнорирования регистра и пробелов
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();

        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

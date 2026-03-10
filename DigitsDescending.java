import java.util.Arrays;

public class DigitsDescending {
    public static int sortDigitsDescending(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits)).reverse();
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println("Input: 42145 -> Output: " + sortDigitsDescending(42145));
        System.out.println("Input: 145263 -> Output: " + sortDigitsDescending(145263));
        System.out.println("Input: 123456789 -> Output: " + sortDigitsDescending(123456789));
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("First index: " + i);
                    System.out.println("Second index: " + j);
                    return;
                }
            }
        }

        System.out.println("No two numbers add up to the target.");
    }
}

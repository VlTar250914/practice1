import java.util.Arrays;

public class FirstTask {
    static int digits(String string) {
        if (string.isEmpty()) return 0;
        return digits(string.subSequence(1, string.length()).toString()) + ('0' <= string.charAt(0) && '9' >= string.charAt(0) ? 1 : 0);
    }

    // при original_values = {1, 2, 3} возвращает [[3, 2, 1], [2, 1], [3, 1], [1], [3, 2], [2], [3], []]
    static int[][] generateSubsets(int[] original_values, int n) {
        int len = 1 << (original_values.length - n - 1); // битовое смещение тут нужно для нахождения степени двойки
        if (len == 1) return new int[][] {
                new int[] { original_values[original_values.length - 1]}, new int[0]
        };
        int[][] result = new int[len * 2][];
        int[][] childSubsets = generateSubsets(original_values, n + 1);
        for (int i = 0; i < len * 2; i++) {
            int[] subset = childSubsets[i % len];
            if (i < len) {
                subset = Arrays.copyOf(subset, subset.length + 1);
                subset[subset.length - 1] = original_values[n];
            }
            result[i] = subset;
        }
        return result;
    }
}

public class SecondTask {
    static int money(int n, int first, int difference) {
        if (n == 0) return first;
        return money(n - 1, first + difference, difference);
    }
}

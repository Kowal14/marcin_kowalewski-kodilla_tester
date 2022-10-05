import java.util.Random;

public class RandomNumbers {
    public int min = 30;
    public int max;

    public int getCountofRandomNumbers() {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;

            if (temp > max) {
                max = temp;
            }

            if (temp < min) {
                min = temp;
            }
        }
        return result;
    }
    public int getMax() {
        return max;
    }
    public int getMin() {
        return min;
    }
}

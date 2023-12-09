import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] numbers =
                {1.5, 0.1, -3.5, 6.5, -7.5, -8.5, 9.5, -10.0, 1.0, 2.0, 3.0, 4.0, -5.0, 6.0, -7.0};
        double average = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                for (int j = i + 2; j < numbers.length; j++) {
                    if (numbers[j] > 0) {
                        average = average + numbers[j];
                        count++;
                    }
                }
                break;
            }

        }
        System.out.println("среднее " + average);
        System.out.println("счет " + count);
        System.out.println("среднее арифметическое " + average / count);



    }}
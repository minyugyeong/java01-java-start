package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int inputCnt = scanner.nextInt();

        int[] numbers = new int[inputCnt];

        System.out.println(inputCnt + "개의 정수를 입력하세요 : ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int sumNumbers : numbers) {
            sum += sumNumbers;
        }
        double average = (double) sum / numbers.length;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}

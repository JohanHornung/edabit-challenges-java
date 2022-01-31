package easy;
import java.util.*;
import java.util.stream.IntStream;

public class Challenge {
    public static void main(String[] args) {
        // System.out.println(solutions(1, 0, 1));
        // System.out.println(Arrays.toString(arrayOfMultiples(7, 5)));
        // System.out.println(Arrays.toString(squarePatch(3)));
        // int[] arr = {3, 5, 4, 2};
        // System.out.println(findSeat(20, arr));
    }
    public static int solutions(int a, int b, int c) {
        int delta = b * b - (4 * a * c);
        if (delta <= 0) return (delta < 0)? 0: 1;
        return 2;
    }
    public static int[] arrayOfMultiples(int num, int length) {
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num * (i + 1);
        }
        return arr;
        // alternativ
    //     return IntStream.rangeClosed(1, length)
	// 		.map(i -> num * i)
	// 		.toArray();
    }
    public static int warOfNumbers(int[] numbers) {
        int oddSum = 0;
        int evenSum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        return Math.abs(evenSum - oddSum);
    }
    public static int[][] squarePatch(int n) {
        if (n <= 0) return new int[0][0];
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = n;
            }
        }
        return arr;
        // alternativ
    //     return Stream.generate(() -> n)
    //                  .limit(n)
    //                  .map(size -> Stream.generate(() -> size)
                            // .limit(size)
                            // .mapToInt(Integer::intValue)
                            // .toArray())
    //                  .toArray(int[][]::new);
    }
    public static int findSeat(int n, int[] arr) {
        int maxCapacity = n / arr.length;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= (maxCapacity / 2)) return i;      
        }
        return -1;
        // return IntStream.range(0, r.length).filter(i -> r[i] <= n/r.length/2).findFirst().orElse(-1);
    }


}

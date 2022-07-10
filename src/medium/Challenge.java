package medium;

import java.util.Arrays;
import java.util.stream.IntStream;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.stream.IntStream;

public class Challenge {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4};
        int[] arr1 = {2, 5, 7};
        // System.out.println(same(arr, arr1));
        // System.out.println(checkPerfect(12));
        // System.out.println(checkPerfect(28));
        // System.out.println(checkPerfect(496));
        // System.out.println(sevenBoom(arr));        
        // System.out.println(sevenBoom(arr1));        
        // System.out.println(isHeteromecic(110));
        // String[] pins = {"2344", "w32 ", "ab12", "acid"};
        // for (String pin : pins) System.out.println(validate(pin));

    }
    public static int missingNum(int[] nums) {
        // returning rest of total sum of array
        int total = 55; // 1 + 2 + 3 + ... + 10
        for (int i = 0; i < nums.length; i++) {
            total -= nums[i];
        }
        return total;
    }
    public static boolean same(int[] a1, int[] a2) {
        int freq1 = 0;
        int freq2 = 0;
        int n1 = a1.length;
        int n2 = a2.length;
        // couting frequency of same numbers
        for (int i = 0; i < n1 - 1; i++) if (a1[i] == a1[i+1]) freq1++;
        for (int i = 0; i < n2 - 1; i++) if (a2[i] == a2[i+1]) freq2++;
        
        int unique1 = n1 - freq1;
        int unique2 = n2 - freq2;
        
        return unique1 == unique2;
    }
    public static boolean checkPerfect(int num) {
        int sum = 0; // sum = 1;
        // finding all factors of num and adding them together
        for (int i = 1; i < num; i++) { // i = 2; i <= num / 2
            if (num % i == 0) sum += i;
        }
        return sum == num;
        // return IntStream.range(1,num)
        //                 .filter(i -> num % i == 0) returns 1 if true else 0
        //                 .sum() == num;
	}
    public static String sevenBoom(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
                String elem = String.valueOf(arr[i]);
                if (elem.contains("7")) return "Boom!";
        }
        return "there is no 7 in the array";
    }   // return Arrays.toString(arr).contains("7") ? "Boom!": "there is no 7 in the array";
    
    public static boolean isHeteromecic(int n) {
        if (n == 0 || n == 2) return true;
        for (int i = 0; i < n; i++) {
            if (i * (i + 1) == n) return true;
        }
        return false;
        // alternative
        // computing square root of n
        // int k = (int) Math.sqrt(n);
        // if (k * (k + 1) == n || k * (k - 1) == n) return true;
        // return false;
    }
    public static boolean cons(int[] arr) {
		Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i+1]) return false;
        }
        return true;
	}
    public static int largestGap(int[] numbers) {
        Arrays.sort(numbers);
        int largestGap = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int gap = Math.abs(numbers[i] - numbers[i+1]);
            if (gap > largestGap) largestGap = gap;
        }
        return largestGap;
	}
    public static boolean validate(String pin) {
        boolean hasRightLength = pin.length() == 4 || pin.length() == 6;
        if (!hasRightLength) return false;
        for (int i = 0; i < pin.length(); i++) {
            if (!(Character.isDigit(pin.charAt(i)) && !Character.isWhitespace(pin.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
    /*
    Given any number, we can create a new number by adding the sums of squares of digits of that number. 
    For example, given 203, our new number is 4 + 0 + 9 = 13. Numbers which stay at 1 are called happy. 
    */
    public static boolean happy(int num) {
        boolean happy = false;
        int newNumber = 0;
        while (newNumber != 4 || newNumber != 1) {
            while (num != 0) {
                int digit = num % 10;
                newNumber += digit * digit;
                num /= 10;
            }
            
        }
        return happy;
    }
}

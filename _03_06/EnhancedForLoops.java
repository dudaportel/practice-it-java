package _03_06;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoops {

  public static void main(String[] args) {
    int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19 };
    // Write an enhanced for loop to print out each prime number in the array.
    // for (int i = 0; i < primeNumbers.length; i++) {
    //   System.out.println(primeNumbers[i]);
    // }

    for (int prime : primeNumbers) {
      System.out.println(prime);
    }

    List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
    // Write an enhanced for loop to print out each week day in the list.
    // for (int i = 0; i < weekDays.size(); i++){
    //   System.out.println(weekDays.get(i));
    // }
    for (String day : weekDays) {
      System.out.println(day);
    }


    int[] randomNumbers = { 23, 51, 72, 84, 1, 60, 34, 102 };
    // Write an enhanced for loop to print out the numbers in the array that are
    // greater than 50.

    // for (int i = 0; i < randomNumbers.length; i++) {
    //   if (randomNumbers[i] > 50){
    //     System.out.println(randomNumbers[i]);
    //   }
    // }
    for (int randomNumber : randomNumbers){
      if (randomNumber > 50) {
        System.out.println(randomNumber);
      }
    }

  }

}

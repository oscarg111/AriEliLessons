package AriEliLessons.AriEliLesson;

import java.util.ArrayList;
import java.util.Arrays;

public class LessonThree {
    public static void main(String[] args){
        // Arrays
        String[] students = {"Ari", "Eli", "Oscar"};
        printArray(students);
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(students[0]);
        nums[4] = 6;
        nums[2] = 20;
        System.out.println(nums);
        printArray(nums);
        System.out.println("");

        // ArrayList
        ArrayList<Integer> grades = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        grades.add(97);
        grades.add(86);

        // switch case
        int day = 3;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("I love the weekend");
        }

        // for loop
        for(int i = 101;i > 1;i %= 5){
            System.out.println(i);
        }

        // methods
        System.out.println(addTwo(5, 4));
        int[] nums1 = {1, 3, 5,7,9};
        printArray(nums1);
        System.out.println(sum(5));
    }
    public static int addTwo(int a, int b){
        return a + b;
    }
    /*
    Make a method that takes in an array as a parameter and
    prints the array.
     */
    public static void printArray(int[] arr){
        String sep = "";
        System.out.print("[");
        for(int num:arr){
            System.out.print(sep + num);
            sep = ", ";
        }
        System.out.print("]");
    }
    public static void printArray(String[] arr){
        String sep = "";
        System.out.print("[");
        for(String str:arr){
            System.out.print(sep + str);
            sep = ", ";
        }
        System.out.print("]");
    }
    // Recursion
    public static int sum(int k){
        if (k > 0){
            return k + sum(k-1);
        } else {
            return 0;
        }
    }
}

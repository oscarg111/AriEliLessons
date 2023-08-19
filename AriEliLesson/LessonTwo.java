package AriEliLessons.AriEliLesson;

import java.util.Scanner;

public class LessonTwo {
    public static void main(String[] args){
        // Strings
        String show = "HunterXHunter";
        String sentence = "Hello, today we are learning java";

        // String methods
        System.out.println(show.toUpperCase());
        System.out.println(show.toLowerCase());
        System.out.println(show.charAt(0));
        System.out.println(show.getBytes());
        System.out.println(show.length());
        System.out.println(sentence.indexOf("today"));

        // String concat
        System.out.println(show + sentence);
        String result = show.concat(sentence);
        System.out.println(result);

        System.out.println("these are quotation marks: \", \', backslash: \\\n\t");

        // Booleans
        boolean isPassing = false;
        System.out.println("Is Passing:" + isPassing);

        // If statements
        if (isPassing){
            System.out.println("Congrats! You Pass!");
        } else if (!isPassing){
            System.out.println("You need to study!!!");
        }
        /*
        Make an if statement that
        passes a student if their grade is > 70, and
        fails a student if their grade is < 70
         */
        int studGrade = 70;

        if (studGrade >= 70){
            System.out.println("You passed!");
        } else if (studGrade < 70){
            System.out.println("You failed!!!");
        }

        // Math in java
        int a = 5;
        int b = 10;
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4));
        System.out.println((int)(Math.random() * 10));

        // Scanner
        Scanner scan = new Scanner(System.in); // creates scanner object

//        // Scanner for strings
//        System.out.println("What is your name?");
//        String name = scan.nextLine();
//        System.out.println(name);
//
//        // Scanner for int
//        System.out.println("What is your age?");
//        int age1 = scan.nextInt();
//        System.out.println(age1);

        // While loops
        int j = 0;
        while (j <= 10){
            System.out.println(j);
            j += 1;
        }

        // Guess the number game
        /*
         * 1. computer generates a number
         * 2. user provides a guess
         * 3. computer tells the user whether the
         *    guess was too high or low
         * 4. while the user has not yet guessed the number, the
         *    computer keeps asking for guesses
         * */

        // Generate a random computer number
        /*
        should be a whole number
         */
        int comp_num = (int)(Math.random() * 10);

        // make a variable for a user number
        int user_num = -1;

        // While the user number != computer number
        /*
        store the user guess in same user number variable
        use if statements to tell whether the user number was
        too high, low, or just right
         */
//        while(user_num != comp_num){
//            System.out.println("What is your guess?");
//            user_num = scan.nextInt();
//            if (user_num < comp_num){
//                System.out.println("Your guess is too low");
//            } else if (user_num > comp_num){
//                System.out.println("Your guess is too high");
//            } else {
//                System.out.println("You got it!");
//            }
//        }


    }
}

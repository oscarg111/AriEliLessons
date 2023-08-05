package AriEliLessons.AriEliLesson;

public class LessonOne {
    public static void main(String[] args)  {

        System.out.println("Hot Dogs");

        // Integers -> #
        /*
        *
        * Multiple line comment
        * -> """
        *       """
        *
        * */

        int age = 15;
        int x = 5;
        int y = 10;
        System.out.println(x + y + "Java is cool");

        // Doubles and floats
        double gpa = 3.5;
        float grade = 97.5F;

        System.out.println(gpa + grade);

        // Strings
        String show = "HunterXHunter";
        System.out.println(show.toUpperCase());
        System.out.println(show.toLowerCase());
        System.out.println(show.charAt(0));
        System.out.println(show.getBytes());

        // Booleans
        boolean isPassing = true;
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

    }
}

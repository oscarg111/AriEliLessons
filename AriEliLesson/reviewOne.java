package AriEliLessons.AriEliLesson;

public class reviewOne {

    /*
    Make a java class for something broad
    Make sub-classes for at least three items in the group
     */

}
// example:
abstract class Sports{
    int numberPlayers;
    int numberTeams;
    abstract void getRules();
}

class Soccer extends Sports{
    int numberPlayers = 11;
    int numberTeams = 2;

    public void getRules(){
        System.out.println("These are the rules of soccer");
    }

    public static double avgGoals(int[] playerGoals){
        int total = 0;
        for (int goal : playerGoals){
            total += goal;
        }
        return total / playerGoals.length;
    }
}

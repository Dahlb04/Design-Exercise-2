import java.util.*;
import java.time.LocalDate;

public class FirstPersonShooterRecord {
    public static LinkedList<Match> matchRecord = new LinkedList<Match>();
    //We use a linked list since it allows us to update and get information from
    //recent games faster.


    //creates a match with today's date
    public static void startMatch(){
        matchRecord.addFirst(Match.createMatch(LocalDate.now()));
    }

    //allows us to update the stats of the most recent match
    //(assuming we only want to update ongoing games)
    public static void updateStats(int k, int d, int a){
        matchRecord.peek().updateStats(k, d, a);
    }

    //returns how many games played on a specific day
    public static ArrayList<Match> findGames(LocalDate date){
        ListIterator<Match> it = matchRecord.listIterator();
        ArrayList<Match> games = new ArrayList<Match>();
        while(it.hasNext()){
            Match temp = it.next();//we store the next match in a tempory variable
            if(temp.getMatchDate().equals(date)){
                games.add(temp);
            }
        }
        if(games.isEmpty()){
            throw new IllegalArgumentException("You didn't play on " +date+" bozo! Were you even born...?");
        }else{
            System.out.print("On "  +date+" you played " + games.size()+ " games. ");
            return games;
        } 
    }

    //returns all of the stats from all of the games played on a specific day
    public static void getStats(LocalDate date){
        ArrayList<int[]> stats = new ArrayList<int[]>();
        ArrayList<Match> specificGames = findGames(date);
        ListIterator<Match> it = specificGames.listIterator();
        while(it.hasNext()){
            stats.add(it.next().getStats());
        }
        System.out.println("Here are the KDAs from all of the games you played: ");

        //in order to print out the arrays of ints (stats) from the arraylist of int[], we need to use
        // a for-loop and the array toString() method.
        for(int[] KDA : stats){
            System.out.println(Arrays.toString(KDA));
        }
    }
}

import java.util.*;
import java.time.LocalDate;

public class FirstPersonShooterRecord {
    private static LinkedList<Match> matchRecord = new LinkedList<Match>();
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

    //returns all games played on a specific day
    public static ArrayList<Match> findGames(LocalDate date){
        ListIterator<Match> it = matchRecord.listIterator();
        ArrayList<Match> games = new ArrayList<Match>();
        while(it.hasNext()){
            if(it.next().getMatchDate().equals(date)){
                games.add(it.previous());
            }
        }
        if(games.isEmpty()){
            throw new IllegalArgumentException("You didn't play on this day bozo!");
        }else return games;
    }

    //returns all of the stats from all of the games played on a specific day
    public static ArrayList<int[]> getStats(LocalDate date){
        ArrayList<int[]> stats = new ArrayList<int[]>();
        ArrayList<Match> specificGames = findGames(date);
        ListIterator<Match> it = specificGames.listIterator();
        while(it.hasNext()){
            stats.add(it.next().getStats());
        }
        return stats;

    }
}

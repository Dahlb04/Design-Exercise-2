import java.time.LocalDate;

public class Match {
    private int kills;
    private int deaths;
    private int assists;
    private LocalDate date;

    //private constructor
    private Match(int kills, int deaths, int assists, LocalDate date) {
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
        this.date = date;
    }

    //static factory method
    public static Match createMatch(LocalDate date) {
        return new Match(0,0,0, date);
    }

    //Aquires stats for a specific game
    public int[] getStats(){
        int[] statList = new int[]{kills, deaths, assists};
        return statList;
    }

    public void updateStats(int k, int d, int a){
        this.kills+=k;
        this.deaths+=d;
        this.assists+=a;
    }

    public LocalDate getMatchDate(){
        return this.date;
    }

}

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        PhoneBook.addEntry("Lebron", 1843783);
        PhoneBook.addEntry("Lebron", 1845858);
        PhoneBook.addEntry("Kobe", 1843783);
        PhoneBook.addEntry("Michael", 1843783);
        PhoneBook.addEntry("Larry", 1841111);
        PhoneBook.addEntry("Stephen", 1849874);
        PhoneBook.addEntry("Kareem", 1845555);
        PhoneBook.addEntry("Kevin", 1846666);
        System.out.println(PhoneBook.addressBook);
        PhoneBook.getNames(1843783);
        PhoneBook.getNumbers("Lebron");

        System.out.println(LocalDate.now());
        FirstPersonShooterRecord.startMatch();
        FirstPersonShooterRecord.updateStats(0, 10, 0);
        //I'm bad :(
        FirstPersonShooterRecord.updateStats(1,0,0);
        //yay I got a kill
        FirstPersonShooterRecord.startMatch();
        FirstPersonShooterRecord.updateStats(5, 2, 4);
        //I'm getting better :)
        FirstPersonShooterRecord.startMatch();
        FirstPersonShooterRecord.updateStats(10, 0, 0);
        //I'm goated haha
        FirstPersonShooterRecord.updateStats(0, 100, 0);
        //nevermind T_T
        FirstPersonShooterRecord.startMatch();
        //ha, I was just holding back. That was not even ONE PERCENT of my power...
        FirstPersonShooterRecord.updateStats(1000000000,0,0);

        FirstPersonShooterRecord.getStats(LocalDate.now());
        FirstPersonShooterRecord.getStats(LocalDate.of(2003,4,10));
    }
}

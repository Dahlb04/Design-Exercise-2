public class Main {
    public static void main(String[] args){
        System.out.println("FUCK YOU!");
        
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

    }
}

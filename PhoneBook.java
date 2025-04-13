import java.util.*;


class PhoneBook implements Book{
    public static Map<String, TreeSet<Integer>> addressBook = new HashMap<String, TreeSet<Integer>>();
    public static Map<Integer, TreeSet<String>> reverseAddressBook = new HashMap<Integer, TreeSet<String>>();


    public void addEntry(String name, Integer number){
        if(!addressBook.containsKey(name)){
            Set<Integer> numbers = new TreeSet<Integer>();
            numbers.add(number);
        }else if(!addressBook.get(name).contains(number)){
            addressBook.get(name).add(number);
        }else throw new IllegalArgumentException("Duplicate!!!!");

        if(!reverseAddressBook.containsKey(number)){
            Set<String> names = new TreeSet<String>();
            names.add(name);
        }else if(!reverseAddressBook.get(number).contains(name)){
            reverseAddressBook.get(number).add(name);
        }else throw new IllegalArgumentException("Duplicate!!!!");
    }

    public TreeSet<Integer> getNumbers(String name){
        return addressBook.get(name);
    }

    public TreeSet<String> getNames(Integer number){
        return reverseAddressBook.get(number);
    }

    

}

import java.util.*;


class PhoneBook implements Book{
    public static Map<String, TreeSet<Integer>> addressBook = new HashMap<String, TreeSet<Integer>>();
    public static Map<Integer, TreeSet<String>> reverseAddressBook = new HashMap<Integer, TreeSet<String>>();


    public static void addEntry(String name, Integer number){
        if(!addressBook.containsKey(name)){
            Set<Integer> numbers = new TreeSet<Integer>();
            numbers.add(number);
            addressBook.put(name, (TreeSet<Integer>) numbers);
        }else if(!addressBook.get(name).contains(number)){
            addressBook.get(name).add(number);
        }else throw new IllegalArgumentException("Duplicate!!!!");

        if(!reverseAddressBook.containsKey(number)){
            Set<String> names = new TreeSet<String>();
            names.add(name);
            reverseAddressBook.put(number, (TreeSet<String>) names);
        }else if(!reverseAddressBook.get(number).contains(name)){
            reverseAddressBook.get(number).add(name);
        }else throw new IllegalArgumentException("Duplicate!!!!");
    }

    public static void getNumbers(String name){
        System.out.println("Numbers associated with " + name + ":" + addressBook.get(name));
    }

    public static void getNames(Integer number){
        System.out.println("Names associated with " + number + ":" + reverseAddressBook.get(number));
    }

    

}

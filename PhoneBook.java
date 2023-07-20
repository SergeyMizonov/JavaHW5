import java.util.*;

public class PhoneBook {
          public static void main(String[] args) {
                    HashMap<String, List<String>> phoneBook = new HashMap<>();

                    addEntry(phoneBook, "Смирнов", "189999999");
                    addEntry(phoneBook, "Капустин", "134568977");
                    addEntry(phoneBook, "Крючков", "159753645");
                    addEntry(phoneBook, "Смирнов", "12555555");
                    addEntry(phoneBook, "Капустин", "124678521");
                    addEntry(phoneBook, "Смирнов", "120000006");

                    
                    printPhoneBook(phoneBook);
          }

          public static void addEntry(Map<String, List<String>> phoneBook, String name, String phone) {
                    if (phoneBook.containsKey(name)) {
                              List<String> phones = phoneBook.get(name);
                              if (!phones.contains(phone)) {
                                        phones.add(phone);
                              }
                    } else {
                              List<String> phones = new ArrayList<>();
                              phones.add(phone);
                              phoneBook.put(name, phones);
                    }
          }

          public static void printPhoneBook(Map<String, List<String>> phoneBook) {
                    List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());

                    entries.sort((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));

                    System.out.println("Phone Book:");
                    for (Map.Entry<String, List<String>> entry : entries) {
                              System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
          }
}
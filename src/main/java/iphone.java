import java.util.*;

public class iphone {
    private Map<String, List<String>> contacts;

    public iphone() {
        contacts = new HashMap<>();
    }
    public void displayPhoneBook() {
        System.out.println("iphone book:");
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public void addContact(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<>());
        }
        contacts.get(name).add(phoneNumber);
    }
    public List<String> getPhoneNumbers(String name) {
        return contacts.getOrDefault(name, new ArrayList<>());
    }

    public static void main(String[] args) {
        iphone iphone = new iphone();

        iphone.addContact("Иван", "1234567890");
        iphone.addContact("Иван", "0987654321");
        iphone.addContact("Мария", "1122334454");
        iphone.addContact("Анна", "5678990494");
        iphone.addContact("Анна", "3249283498");

        iphone.displayPhoneBook();

        String name = "Иван";
        List<String> ivanPhoneNumbers = iphone.getPhoneNumbers(name);
        System.out.println(name + " number: " + ivanPhoneNumbers);
    }
}

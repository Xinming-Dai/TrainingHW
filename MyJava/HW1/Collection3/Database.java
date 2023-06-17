package HW1.Collection3;

import java.util.*;

public class Database {
    Hashtable<String, String> data;

    public Database() {
        data = new Hashtable<>();
    }

    public void createEntry(String key, String value) {
        data.put(key, value);
    }

    public void readEntry(String key) {
        data.get(key);
    }

    public void updateEntry(String key, String value) {
        data.replace(key, value);
    }

    public void deleteEntry(String key) {
        data.remove(key);
    }

    public static void main(String[] args) {
        Database db = new Database();

        db.createEntry("asdf", "asdf");
        ...
    }
}
package InterviewPractise;

import java.util.HashMap;

public class FinalClassExample {
    private final int id;
    private final String name;
    private final HashMap<String,String>testmap;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getTestmap() {
        return (HashMap<String, String>) testmap.clone();
    }

    public FinalClassExample(int id, String name, HashMap<String, String> testmap) {
        this.id = id;
        this.name = name;

        System.out.println("perfrom deep copy for object initialisation");

        HashMap<String,String>tempMap = new HashMap<>();

        String key;
        for (String s : testmap.keySet()) {
            key = s;
            tempMap.put(key, testmap.get(key));
        }
        this.testmap = tempMap;
    }
}

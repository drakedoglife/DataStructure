package City;

import java.util.HashMap;

public class Distance {
    private HashMap<String, int[]> distance_Database = new HashMap<String, int[]>();

    public void initDatabase(String s, int[] a) {
        this.distance_Database.put(s, a);
    }

    public HashMap<String, int[]> getDatabase() {
        return this.distance_Database;
    }
}

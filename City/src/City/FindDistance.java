package City;

public class FindDistance {
    private String city1 = "";
    private String city2 = "";
    private Distance distance = new Distance();
    private CityRead city_class = new CityRead();

    public FindDistance(String s1, String s2, Distance d, CityRead c) {
        this.city1 = s1;
        this.city2 = s2;
        this.distance = d;
        this.city_class = c;
    }

    public int getDistance() {
       return this.distance.getDatabase().get(this.city1)[this.city_class.findCity(this.city2)];
    }
}

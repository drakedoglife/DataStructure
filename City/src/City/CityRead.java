package City;

//这个类实现了读取城市集合

import java.util.HashSet;

public class CityRead {
    private HashSet<String> city_name_list = new HashSet<String>();

    public void addFunc(String s) {
        this.city_name_list.add(s);
    }

    public HashSet<String> getList() {
        return this.city_name_list;
    }

    public int findCity(String s) {
        int i = 0;
        for (String s_cityname:
             this.city_name_list) {
            if(s_cityname.equals(s)) {
                return i;
            }else {
                i++;
            }
        }
        return -1;
    }
}

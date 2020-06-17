package City;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    CityRead city = new CityRead();
	    String city_name = "";

//	    System.out.println("请输入城市名称");
	    while (true) {//当城市名称不是###时，录入数据
	        city_name = in.next();//输入城市单词
	        if(city_name.equals("###")) {
	            break;
            }
	        city.addFunc(city_name);
        }

//		System.out.println("城市输入结束");
//		System.out.println("----------");
//		System.out.println("开始输入距离");

	    Distance distance = new Distance();
		for (String s:
			 city.getList()) {
			int[] a = new int[city.getList().size()];
			for(int i = 0; i < city.getList().size(); ++i) {
				a[i] = in.nextInt();
			}
			distance.initDatabase(s, a);
		}

//		System.out.println("输入距离结束");
//		System.out.println("----------");

		String city1 = in.next();
		String city2 = in.next();

		FindDistance find_distance = new FindDistance(city1, city2, distance, city);

		System.out.println(find_distance.getDistance());

	    in.close();
    }
}

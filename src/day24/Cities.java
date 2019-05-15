package day24;

public class Cities {
	public static void main(String[] args) {
		String[] cities = { "Washington D.C", "Moscow", "Kyev", "Berlin", "Baku", "Istanbul", "Miami", "Silver Spring",
				"Mclean", "Baltimore" };
		System.out.println(cities.length);
//TASK print all cities that star with m

		for (int x = 0; x < cities.length; x++) {
			if (cities[x].startsWith("M")) {
				System.out.println(cities[x]);
			}
		}
		System.out.println();
		for(String city: cities) {
			if(city.startsWith("B")) {
				System.out.println(city);
			}
		}
	}
}

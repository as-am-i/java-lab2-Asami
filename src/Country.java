import java.util.Arrays;

/**
 * Lab2 Country class
 * 
 * @author tanii_asami
 *
 */
public class Country {
	private String name;
	private Province[] provinces;

	public Country() {
		// Constructor should initialize all the attributes
		this.name = "Canada";

		// Initialized provinces
		provinces = new Province[10];
		provinces[0] = new Province("Ontario", "Toronto", 6);
		provinces[1] = new Province("Quebec", "Quebec City", 10);
		provinces[2] = new Province("British Columbia", "Victoria", 12);
		provinces[3] = new Province("Alberta", "Edmonton", 5);
		provinces[4] = new Province("Manitoba", "Winnipeg", 30);
		provinces[5] = new Province("Saskatchewan", "Regina", 25);
		provinces[6] = new Province("Nova Scotia", "Halifax", 7);
		provinces[7] = new Province("New Brunswick", "Fredericton", 16);
		provinces[8] = new Province("Newfoundland and Labrador", "St. John's", 29);
		provinces[9] = new Province("Prince Edward Island", "Charlottetown", 23);
	}

	/**
	 * loops through the deck and prints each Province object’s getDetails() method
	 */
	public void displayAllProvinces() {
		System.out.println(name + " contains: ");
		for (Province province : provinces) {
			System.out.println(province.getDetails());
		}

	}

	/**
	 * returns how many Provinces there are with populations in that range
	 * 
	 * @param min
	 *            of population of millions
	 * @param max
	 *            of population of millions
	 * @return count of provinces in that range
	 */
	public int howManyHaveThisPopulation(int min, int max) {
		int count = 0;
		for (Province province : provinces) {
			if ((province.getPopulationInMillions() >= min) && (province.getPopulationInMillions() <= max)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", provinces=" + Arrays.toString(provinces) + "]";
	}
}

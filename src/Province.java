/**
 * Lab2 Province class
 * 
 * @author tanii_asami
 *
 */
public class Province {

	private String name;
	private String capital;
	private int populationInMillions;

	public static final String DEFAULT_NAME = "British Columbia";
	public static final String DEFAULT_CAPITAL = "Victoria";
	public static final int DEFAULT_POPULATION_MILLIONS = 4;

	public static final int MAX_POPULATION = 38;
	public static final int MIN_POPULATION = 0;

	/**
	 * The First Province Constructor
	 * 
	 * @param name
	 *            to be set
	 * @param capital
	 *            to be set
	 * @param populationInMillions
	 *            to be set
	 */
	public Province(String name, String capital, int populationInMillions) {
		if (isValidPopulation(populationInMillions) && isValidProvince(name) && isValidCapitalCity(capital)) {
			this.name = name;
			this.capital = capital;
			this.populationInMillions = populationInMillions;
		} else {
			// if there is any error; create the default data, shown below
			this.name = DEFAULT_NAME;
			this.capital = DEFAULT_CAPITAL;
			this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
		}
	}

	/**
	 * The second (default) Province Constructor
	 */
	public Province() {
		this.name = DEFAULT_NAME;
		this.capital = DEFAULT_CAPITAL;
		this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
	}

	/**
	 * returns true if the String parameter exists in that Array
	 * 
	 * @param province
	 *            to be set
	 * @return true or false
	 */
	private boolean isValidProvince(String province) {
		String[] provinceArray = { "Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba", "Saskatchewan",
				"Nova Scotia", "New Brunswick", "Newfoundland and Labrador", "Prince Edward Island" };

		int index = 0;
		int count = 0;
		while (index != provinceArray.length) {
			if (province == provinceArray[index]) {
				count++;
			}
			index++;
		}

		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * returns true if the String parameter exists in that Array
	 * 
	 * @param capital
	 *            to be set
	 * @return true or false
	 */
	private boolean isValidCapitalCity(String capital) {
		// capitalArray is used to check just if the name is valid
		String[] capitalArray = { "Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg", "Victoria",
				"Charlottetown", "Regina", "Edmonton", "St. John's" };

		int count = 0;
		for (int index = 0; index < capitalArray.length; index++) {
			if (capital == capitalArray[index]) {
				count++;
			}
		}

		if (count == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * returns true if the parameter is between 4 and 38 (inclusive)
	 * 
	 * @param population
	 *            to be set
	 * @return true or false
	 */
	private boolean isValidPopulation(int population) {
		if ((population >= MIN_POPULATION) && (population <= MAX_POPULATION)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @return name to get
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return capital to get
	 */
	public String getCapital() {
		return capital;
	}

	/**
	 * 
	 * @return population in milltions to get
	 */
	public int getPopulationInMillions() {
		return populationInMillions;
	}

	/**
	 * 
	 * @param name
	 *            to be set
	 */
	public final void setName(String name) {
		if (isValidProvince(name)) {
			this.name = name;
		}
	}

	/**
	 * 
	 * @param capital
	 *            to be set
	 */
	public final void setCapital(String capital) {
		if (isValidCapitalCity(capital)) {
			this.capital = capital;
		}
	}

	/**
	 * 
	 * @param populationInMillions
	 *            to be set
	 */
	public final void setPopulationInMillions(int populationInMillions) {
		if (isValidPopulation(populationInMillions)) {
			this.populationInMillions = populationInMillions;
		}
	}

	/**
	 * 
	 * @return a String in the format: The capital of British Columbia (pop. 4
	 *         million) is Victoria. etc...
	 */
	public String getDetails() {
		// After
		String details = "The capital of " + getName() + " (pop. " + getPopulationInMillions() + " million) is "
				+ getCapital();
		return details;
	}

	@Override
	public String toString() {
		return "Province [name=" + name + ", capital=" + capital + ", populationInMillions=" + populationInMillions
				+ "]";
	}
}

/**
 * Lab2 Driver class
 * 
 * @author tanii_asami
 *
 */
public class Driver {
	public static void main(String[] args) {
		
		// Lab 2b: 1
		Country country = new Country();
		country.displayAllProvinces();

		System.out.print("How many Provinces there are with populations in that range: "
				+ country.howManyHaveThisPopulation(10, 50));

	}
}

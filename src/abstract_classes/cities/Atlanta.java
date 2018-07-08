package abstract_classes.cities;

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		double totalTaxesAT = population * (growthRate * 2);
		return totalTaxesAT;
	}

}

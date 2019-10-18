package entitites;

public class Individual extends TaxPayer {
	
	private Double healthExpenditure;

	public Individual(String name, Double anualIncome, Double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Individual() {
		super();
	}
	
	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public Double tax() {
		if(getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - healthExpenditure * 0.5;
		}
		else {
			return getAnualIncome() * 0.25 - healthExpenditure * 0.5;
		}
	}

}

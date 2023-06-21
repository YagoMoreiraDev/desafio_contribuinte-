package entities;

public class TaxPayer {
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	
	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	public double salaryTax() {
		Double salary = this.salaryIncome /12;
		if(salary < 3000) {
			return 0;
		}else if(salary < 5000){
			return (salary * 0.1)*12;
		}else {
			return (salary * 0.2)*12;
		}
	}
	public double servicesTax() {
		if(this.servicesIncome > 0) {
			return this.servicesIncome*0.15;
		}
		return 0;
	} 
	public double capitalTax() {
		if(this.capitalIncome > 0) {
			return this.capitalIncome*0.2;
		}
		return 0;
	} 
	public double grossTax() {
		return this.salaryTax()+this.servicesTax()+this.capitalTax();
	}
	
	public double taxRebate() {
		Double soma = this.healthSpending + this.educationSpending;
		Double abatimento = this.grossTax()*0.3;
		if(soma > this.grossTax()) {
			return abatimento;
		}
		return soma;
	} 
	
	public double netTaz() {
		return this.grossTax() - this.taxRebate();
	} 
}

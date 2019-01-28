package com.qaprosoft.insuranceCompany.Finance;

public class Activity {
		
	 	private Benefits benefits;

	    public Activity() {
	        this.setBenefits(new Investments());
	    }

		public Benefits getBenefits() {  // if you remove the setters, the error is highlighted in the 4th line, and offers to either remove the 4th line or add a gett set and add
			return benefits;
		}

		public void setBenefits(Benefits benefits) {
			this.benefits = benefits;
		}
		
		
		
		
		
}

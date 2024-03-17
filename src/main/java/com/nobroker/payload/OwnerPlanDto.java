package com.nobroker.payload;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class OwnerPlanDto {

	private long planId;

	private String planName;

	private double price;

	private int planValidity;

	private boolean relationshipManager;

	private boolean rentalAgreement;

	private boolean propertyPromation;

	private boolean guaranteedTenants;

	private boolean showingProperty;

	private boolean facebookMarketingOfProperty;

	public OwnerPlanDto(long planId, String planName, double price, int planValidity, boolean relationshipManager,
			boolean rentalAgreement, boolean propertyPromation, boolean guaranteedTenants, boolean showingProperty,
			boolean facebookMarketingOfProperty) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.price = price;
		this.planValidity = planValidity;
		this.relationshipManager = relationshipManager;
		this.rentalAgreement = rentalAgreement;
		this.propertyPromation = propertyPromation;
		this.guaranteedTenants = guaranteedTenants;
		this.showingProperty = showingProperty;
		this.facebookMarketingOfProperty = facebookMarketingOfProperty;
	}

	public long getPlanId() {
		return planId;
	}

	public void setPlanId(long planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPlanValidity() {
		return planValidity;
	}

	public void setPlanValidity(int planValidity) {
		this.planValidity = planValidity;
	}

	public boolean isRelationshipManager() {
		return relationshipManager;
	}

	public void setRelationshipManager(boolean relationshipManager) {
		this.relationshipManager = relationshipManager;
	}

	public boolean isRentalAgreement() {
		return rentalAgreement;
	}

	public void setRentalAgreement(boolean rentalAgreement) {
		this.rentalAgreement = rentalAgreement;
	}

	public boolean isPropertyPromation() {
		return propertyPromation;
	}

	public void setPropertyPromation(boolean propertyPromation) {
		this.propertyPromation = propertyPromation;
	}

	public boolean isGuaranteedTenants() {
		return guaranteedTenants;
	}

	public void setGuaranteedTenants(boolean guaranteedTenants) {
		this.guaranteedTenants = guaranteedTenants;
	}

	public boolean isShowingProperty() {
		return showingProperty;
	}

	public void setShowingProperty(boolean showingProperty) {
		this.showingProperty = showingProperty;
	}

	public boolean isFacebookMarketingOfProperty() {
		return facebookMarketingOfProperty;
	}

	public void setFacebookMarketingOfProperty(boolean facebookMarketingOfProperty) {
		this.facebookMarketingOfProperty = facebookMarketingOfProperty;
	}

	public OwnerPlanDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

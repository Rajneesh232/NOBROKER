package com.nobroker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="oweners_plans")
public class OwnerPlan {

	@Id
	private long planId;
	
	@Column(name="plan_name",unique=true)
	private String planName;
	
	@Column(name="price")
    private double price;
	
	@Column(name="plan_validity")
	private int planValidity;
	
	@Column(name="relationship_manager")
	private boolean relationshipManager;
	
	@Column(name="rental_agreement")
	private boolean rentalAgreement;
	
	@Column(name="property_promation")
	private boolean propertyPromation;
	
	@Column(name="guaranteed_tenants")
	private boolean guaranteedTenants;
	
	@Column(name="showing_property")
	private boolean showingProperty;
	
	@Column(name="facebook_marketing_of_property")
	private boolean facebookMarketingOfProperty;

	public OwnerPlan(long planId, String planName, double price, int planValidity, boolean relationshipManager,
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

	public OwnerPlan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

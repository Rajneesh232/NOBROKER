package com.nobroker.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.nobroker.entity.OwnerPlan;
import com.nobroker.payload.OwnerPlanDto;

public interface OwnerPlanService {

	public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto);
	
	public List<OwnerPlanDto>getAllOwnerPlans();

}

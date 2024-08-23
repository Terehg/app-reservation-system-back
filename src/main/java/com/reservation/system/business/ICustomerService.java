package com.reservation.system.business;

import com.reservation.system.dto.complejo.rq.CustomerRqDto;
import com.reservation.system.dto.complejo.rs.GenericRsDto;

public interface ICustomerService {
	
	public GenericRsDto createCustomer(CustomerRqDto customer);
}

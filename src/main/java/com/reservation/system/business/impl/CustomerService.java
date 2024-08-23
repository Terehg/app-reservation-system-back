package com.reservation.system.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.system.business.ICustomerService;
import com.reservation.system.dto.CustomerDto;
import com.reservation.system.dto.complejo.rq.CustomerRqDto;
import com.reservation.system.dto.complejo.rs.GenericRsDto;
import com.reservation.system.entity.CustomerEntity;
import com.reservation.system.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	private ICustomerRepository customerRepository;

	@Override
	public GenericRsDto createCustomer(CustomerRqDto customer) {
		GenericRsDto response = new GenericRsDto();
		CustomerEntity customerEntity = CustomerDto.convCustomerDtoToEntity(customer.getCustomer());
		customerRepository.save(customerEntity);
		response.setSuccess(Boolean.TRUE);
		return response;
	}

}

package com.reservation.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.system.business.ICustomerService;
import com.reservation.system.dto.complejo.rq.CustomerRqDto;
import com.reservation.system.dto.complejo.rs.GenericRsDto;
import com.reservation.system.utilities.Constants;

@RestController
@CrossOrigin(origins = Constants.ASTERISCO, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping(Constants.OPERATIONS_CUSTOMER)
public class OperationsCustomerController {
	
	@Autowired
	private ICustomerService customerService;
	
	@PostMapping(value = Constants.CREATE_CUSTOMER , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericRsDto> createCustomer(@RequestBody CustomerRqDto customer) {
		GenericRsDto responseCreateCustomer = customerService.createCustomer(customer);
		if (responseCreateCustomer.getTypeError() != null) {
			return new ResponseEntity<>(responseCreateCustomer, HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<>(responseCreateCustomer, HttpStatus.OK);
		}
	}

}

package com.reservation.system.dto.complejo.rq;

import java.time.LocalDateTime;

import com.reservation.system.dto.CustomerDto;
import com.reservation.system.dto.ServiceDto;

import lombok.Data;

@Data
public class ReservationRqDto {
	
	private CustomerDto customer;
	
	private ServiceDto service;
	
	private LocalDateTime date;
}

package com.reservation.system.dto;

import java.time.LocalDateTime;

import com.reservation.system.entity.CustomerEntity;
import com.reservation.system.entity.ServiceEntity;

import lombok.Data;

@Data
public class ReservationDto {
	
	private Long id;
	
    private LocalDateTime date;
    
    private CustomerEntity customer;

    private ServiceEntity service;

}

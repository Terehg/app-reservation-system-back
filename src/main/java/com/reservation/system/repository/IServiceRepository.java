package com.reservation.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.system.entity.ServiceEntity;

@Repository
public interface IServiceRepository extends JpaRepository<ServiceEntity, Long>{

}

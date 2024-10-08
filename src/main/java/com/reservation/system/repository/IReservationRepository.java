package com.reservation.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reservation.system.entity.ReservationEntity;

@Repository
public interface IReservationRepository extends JpaRepository<ReservationEntity, Long>{

}

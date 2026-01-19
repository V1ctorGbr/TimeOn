package com.timeon.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.timeon.app.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}

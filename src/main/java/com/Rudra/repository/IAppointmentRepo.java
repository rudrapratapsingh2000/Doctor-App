package com.Rudra.repository;

import com.Rudra.model.Appointment;
import com.Rudra.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepo extends JpaRepository<Appointment,Long> {
    Appointment findFirstByPatient(Patient patient);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsoft.app.repository;

import com.tsoft.app.domain.PatientBloodplessure;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tchipi
 */
/**
 * Spring Data JPA repository for the PatientBloodplessure entity.
 */
public interface PatientBloodplessureRepository extends JpaRepository<PatientBloodplessure, Long> {

    public List<PatientBloodplessure> findAllByPatientIdAndDateReleveBetweenOrderByDateReleveAsc(Long patientId, LocalDate fromDate, LocalDate toDate);

}

package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDto;
import com.pm.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDto toPatientResponseDto(Patient patient) {
        PatientResponseDto patientResponseDto = new PatientResponseDto();
        patientResponseDto.setId(patient.getId().toString());
        patientResponseDto.setName(patient.getName());
        patientResponseDto.setAddress(patient.getAddress());
        patientResponseDto.setDateOfBirth(patient.getDateOfBirth().toString());
        patientResponseDto.setEmail(patient.getEmail());
        return patientResponseDto;
    }
}

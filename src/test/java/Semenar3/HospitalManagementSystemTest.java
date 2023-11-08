package Semenar3;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class HospitalManagementSystemTest {
    Patient patient1;
    Patient patient2;
    Doctor doctor1;
    Doctor doctor2;

    Appointment appointment;
    Appointment appointment1;
    Appointment appointment2;
    //Appointment appointments;

    Date appointmentDate1 ;
    Date appointmentDate2 ;



    HospitalManagementSystem hospitalManagementSystem;

    @BeforeEach
    void setUp() {
        patient1 = new Patient("Иван", "12345");
        patient2 = new Patient("Анна", "67890");

        appointmentDate1 = new Date();
        appointmentDate2 = new Date();

        doctor1 = new Doctor("Доктор Смит", "Кардиолог");
        doctor2 = new Doctor("Доктор Джонсон", "Хирург");

        appointment1 =  new Appointment(doctor1,patient1, appointmentDate1 );
        appointment2 =  new Appointment(doctor2,patient2, appointmentDate2 );

        // hospitalManagementSystem.addPatient(patient1);
        hospitalManagementSystem = new HospitalManagementSystem();

    }

    @Test
    void addPatient() {
        List<Patient> patientList = new ArrayList<>(Collections.singletonList(patient1));
        hospitalManagementSystem.addPatient(patient1);
        //assertEquals(patientList,hospitalManagementSystem.getPatients());//Смутило сравнение экземпляров ЛИСТОВ с одинаковыми экземплярами
        assertArrayEquals(patientList.toArray(), hospitalManagementSystem.getPatients().toArray());
    }

    @Test
    void removePatient() {
        hospitalManagementSystem.addPatient(patient1);
        hospitalManagementSystem.removePatient(patient1);
        assertFalse(hospitalManagementSystem.getPatients().contains(patient1));
    }

    @Test
    void getPatients() {
        List<Patient> patientList = new ArrayList<>(Arrays.asList(patient1, patient2));
        hospitalManagementSystem.addPatient(patient1);
        hospitalManagementSystem.addPatient(patient2);
        assertArrayEquals(patientList.toArray(), hospitalManagementSystem.getPatients().toArray());
    }

    @Test
    void addDoctor() {
        List<Doctor> doctorList = new ArrayList<>(Arrays.asList(doctor1));
        hospitalManagementSystem.addDoctor(doctor1);
        assertArrayEquals(doctorList.toArray(), hospitalManagementSystem.getDoctors().toArray());

    }

    @Test
    void removeDoctor() {
        hospitalManagementSystem.addDoctor(doctor1);
        hospitalManagementSystem.removeDoctor(doctor1);
        assertFalse(hospitalManagementSystem.getDoctors().contains(doctor1));
    }

    @Test
    void getDoctors() {
        List<Doctor> doctorList = new ArrayList<>(Arrays.asList(doctor1,doctor2));
        hospitalManagementSystem.addDoctor(doctor1);
        hospitalManagementSystem.addDoctor(doctor2);
        assertArrayEquals(doctorList.toArray(), hospitalManagementSystem.getDoctors().toArray() );

    }

    @Test
    void scheduleAppointment() {
        hospitalManagementSystem.scheduleAppointment(doctor1,patient1,appointmentDate1);
        List<Appointment> appointments = hospitalManagementSystem.getAppointments();
        assertEquals(1, appointments.size());

        Appointment scheduledAppointment = appointments.get(0);
        assertEquals(doctor1, scheduledAppointment.getDoctor());
        assertEquals(patient1, scheduledAppointment.getPatient());
        assertEquals(appointmentDate1, scheduledAppointment.getDate());
    }

 @Test

 void getAppointments() {
    hospitalManagementSystem.scheduleAppointment(doctor1,patient1,appointmentDate1);
     List<Appointment> appointments = hospitalManagementSystem.getAppointments();
     assertEquals(1, appointments.size());
 }

}
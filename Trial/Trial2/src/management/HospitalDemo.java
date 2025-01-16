package management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class HospitalDemo {
    public static Patient registerPatient(String firstName, String lastName){
        Patient patient = new Patient();
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setPatientNumber("P-" + String.format("%04d", (int)(Math.random()*10000)));
        patient.setRoomNumber(100 + (int)(Math.random()*300));
        return patient;
    }

    public static void displayPatient(Patient patient){
        System.out.println("First name: " + patient.getFirstName());
        System.out.println("Last name: " + patient.getLastName());
        System.out.println("Patient number: " + patient.getPatientNumber());
        System.out.println("Room number: " + patient.getRoomNumber());
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();

        List<String> patientNames = Arrays.asList("Gorazd Filipovski","Aleksandar Atanasovski","Ljupcho Duchevski","Marko Lovren","Marija Gavrilovikj","Stefan Dukovski","Ognen Stanoevski","Viktor Dimitrovski","Luka Herceg","Ognen Madevski");

        List<Patient> patients = patientNames.stream().map(name -> {String[] split = name.split(" "); return  registerPatient(split[0],split[1]);}).collect(Collectors.toList());
        patients.forEach(HospitalDemo::displayPatient);
        List<Patient> filteredPatients = patients.stream().filter(patient -> patient.getRoomNumber() >= 200 && patient.getRoomNumber() <= 299 && patient.getRoomNumber() % 2 != 0).collect(Collectors.toList());

        System.out.println("\nFiltered patients: ");
        filteredPatients.forEach(HospitalDemo::displayPatient);
    }
}
package com.overriding;

class Doctor {

    void consultPatient() {
        System.out.println("Consulting patient");
    }

    void diagnosePatient() {
        System.out.println("Diagnosing patient");
    }

    void prescribeMedicine() {
        System.out.println("Prescribing medicine");
    }

    void generateBill() {
        System.out.println("Generating bill");
    }
}


// General Doctor
class GeneralDoctor extends Doctor {

    @Override
    void consultPatient() {
        System.out.println("General Doctor: Consulting patient");
    }

    @Override
    void diagnosePatient() {
        System.out.println("General Doctor: Diagnosing common health problems");
    }

    @Override
    void prescribeMedicine() {
        System.out.println("General Doctor: Prescribing general medicines");
    }

    @Override
    void generateBill() {
        System.out.println("General Doctor Consultation Bill: ₹500");
    }
}


// Cardiologist
class Cardiologist extends Doctor {

    @Override
    void consultPatient() {
        System.out.println("Cardiologist: Consulting heart patient");
    }

    @Override
    void diagnosePatient() {
        System.out.println("Cardiologist: Checking heart condition");
    }

    @Override
    void prescribeMedicine() {
        System.out.println("Cardiologist: Prescribing heart medicines");
    }

    @Override
    void generateBill() {
        System.out.println("Cardiologist Consultation Bill: ₹1500");
    }
}


// Dermatologist
class Dermatologist extends Doctor {

    @Override
    void consultPatient() {
        System.out.println("Dermatologist: Consulting skin patient");
    }

    @Override
    void diagnosePatient() {
        System.out.println("Dermatologist: Diagnosing skin condition");
    }

    @Override
    void prescribeMedicine() {
        System.out.println("Dermatologist: Prescribing skin medicines");
    }

    @Override
    void generateBill() {
        System.out.println("Dermatologist Consultation Bill: ₹1000");
    }
}


// Main
public class Hospital {

    public static void main(String[] args) {

        GeneralDoctor general = new GeneralDoctor();

        general.consultPatient();
        general.diagnosePatient();
        general.prescribeMedicine();
        general.generateBill();

        System.out.println();

        Cardiologist cardio = new Cardiologist();

        cardio.consultPatient();
        cardio.diagnosePatient();
        cardio.prescribeMedicine();
        cardio.generateBill();

        System.out.println();

        Dermatologist derma = new Dermatologist();

        derma.consultPatient();
        derma.diagnosePatient();
        derma.prescribeMedicine();
        derma.generateBill();
    }
}

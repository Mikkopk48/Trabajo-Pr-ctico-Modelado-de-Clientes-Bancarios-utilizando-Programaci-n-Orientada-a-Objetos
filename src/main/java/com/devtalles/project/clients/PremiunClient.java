package com.devtalles.project.clients;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PremiunClient extends Client {
    private Integer DNI;
    private LocalDate birthDate;
    private String profession;
    private String specialCreditLimit;
    private String asignedEjective;
    private String specialBenefits;
    private String firstName;
    private String lastName;

    public PremiunClient(String address,
                         String phoneNumber,
                         String email,
                         LocalDate bankRegistrationDate,
                         BigDecimal declaredIncome,
                         Integer DNI,
                         LocalDate birthDate,
                         String profession,
                         String specialCreditLimit,
                         String asignedEjective,
                         String specialBenefits,
                         String firstName,
                         String lastName) {
        super(address, phoneNumber, email, bankRegistrationDate, declaredIncome);
        this.DNI = DNI;
        this.birthDate = birthDate;
        this.profession = profession;
        this.specialCreditLimit = specialCreditLimit;
        this.asignedEjective = asignedEjective;
        this.specialBenefits = specialBenefits;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void showClient() {
        System.out.println(
                        "Nombre: " + firstName + "\n" +
                        "Apellido: " + lastName + "\n" +
                        "Límite de Crédito Especial: " + specialCreditLimit + "\n" +
                        "Ejecutivo Asignado: " + asignedEjective + "\n" +
                        "Beneficios Especiales: " + specialBenefits
        );
        super.showClient();
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSpecialCreditLimit() {
        return specialCreditLimit;
    }

    public void setSpecialCreditLimit(String specialCreditLimit) {
        this.specialCreditLimit = specialCreditLimit;
    }

    public String getAsignedEjective() {
        return asignedEjective;
    }

    public void setAsignedEjective(String asignedEjective) {
        this.asignedEjective = asignedEjective;
    }

    public String getSpecialBenefits() {
        return specialBenefits;
    }

    public void setSpecialBenefits(String specialBenefits) {
        this.specialBenefits = specialBenefits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


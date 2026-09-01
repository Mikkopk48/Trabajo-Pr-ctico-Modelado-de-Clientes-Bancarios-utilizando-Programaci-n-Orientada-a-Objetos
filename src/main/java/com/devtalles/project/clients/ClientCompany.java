package com.devtalles.project.clients;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ClientCompany extends Client {
    private String companyName;
    private String CUIL;
    private String companyActivity;
    private String legalRepesentative;

    public ClientCompany(
            String companyName,
            String address,
            String phoneNumber,
            String email,
            LocalDate bankRegistrationDate,
            BigDecimal declaredIncome,
            String CUIL,
            String companyActivity,
            String legalRepesentative) {
        super(address, phoneNumber, email, bankRegistrationDate, declaredIncome);
        this.companyName = companyName;
        this.CUIL = CUIL;
        this.companyActivity = companyActivity;
        this.legalRepesentative = legalRepesentative;
    }

    @Override
    public void showClient() {
        System.out.println("La información del Cliente Empresa es la siguiente:");
        System.out.println(
                        "Nombre de Empresa: " + companyName + "\n"+
                        "CUIL: " + CUIL + "\n" +
                        "Actividad: " + companyActivity + "\n" +
                        "Representante Legal: " + legalRepesentative
        );
        super.showClient();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCUIL() {
        return CUIL;
    }

    public void setCUIL(String CUIL) {
        this.CUIL = CUIL;
    }

    public String getCompanyActivity() {
        return companyActivity;
    }

    public void setCompanyActivity(String companyActivity) {
        this.companyActivity = companyActivity;
    }

    public String getLegalRepesentative() {
        return legalRepesentative;
    }

    public void setLegalRepesentative(String legalRepesentative) {
        this.legalRepesentative = legalRepesentative;
    }
}

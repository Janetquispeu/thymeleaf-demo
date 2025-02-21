package org.example.NewSeller;

import java.util.Arrays;
import java.util.List;

public class sellerContract {
    private String businessName;
    private String ruc;
    private String fiscalAddress;
    private String districtAndCity;
    private String registerCertificate;
    private String registerOffice;
    private String firstAttorney;
    private String firstDocumentNumber;
    private String secondAttorney;
    private String secondDocumentNumber;
    private List<String> agreementEcommerce;
    private String generalCommission;
    private String categoryCommissions;
    private String bankAccountNumber;
    private String bankCciNumber;
    private String bankAccountImage;
    private String bankDetractionName;
    private String bankDetractionAccountNumber;
    private String bankDetractionCciNumber;
    private String bankDetractionAccountImage;
    private String day;
    private String month;
    private String year;

    private String linkModDespacho;


    public sellerContract(String businessName,
                          String ruc,
                          String fiscalAddress,
                          String districtAndCity,
                          String registerCertificate,
                          String registerOffice,
                          String firstAttorney,
                          String firstDocumentNumber,
                          String secondAttorney,
                          String secondDocumentNumber,
                          List<String> agreementEcommerce,
                          String generalCommission,
                          String categoryCommissions,
                          String bankAccountNumber,
                          String bankCciNumber,
                          String bankAccountImage,
                          String bankDetractionName,
                          String bankDetractionAccountNumber,
                          String bankDetractionCciNumber,
                          String bankDetractionAccountImage,
                          String day,
                          String month,
                          String year,
                          String linkModDespacho
    ) {
        this.businessName = businessName;
        this.ruc = ruc;
        this.fiscalAddress = fiscalAddress;
        this.districtAndCity = districtAndCity;
        this.registerCertificate = registerCertificate;
        this.registerOffice = registerOffice;
        this.firstAttorney = firstAttorney;
        this.firstDocumentNumber = firstDocumentNumber;
        this.secondAttorney = secondAttorney;
        this.secondDocumentNumber = secondDocumentNumber;
        this.agreementEcommerce = agreementEcommerce;
        this.generalCommission = generalCommission;
        this.bankAccountNumber = bankAccountNumber;
        this.bankCciNumber = bankCciNumber;
        this.bankAccountImage = bankAccountImage;
        this.bankDetractionName = bankDetractionName;
        this.bankDetractionAccountNumber = bankDetractionAccountNumber;
        this.bankDetractionCciNumber = bankDetractionCciNumber;
        this.bankDetractionAccountImage = bankDetractionAccountImage;
        this.day = day;
        this.month = month;
        this.year = year;
        this.linkModDespacho = linkModDespacho;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getRuc() {
        return ruc;
    }

    public String getFiscalAddress() {
        return fiscalAddress;
    }

    public String getDistrictAndCity() {
        return districtAndCity;
    }

    public String getRegisterCertificate() {
        return registerCertificate;
    }

    public String getRegisterOffice() {
        return registerOffice;
    }

    public String getCategoryCommissions() {
        return categoryCommissions;
    }

    public String getFirstAttorney() {
        return firstAttorney;
    }

    public String getFirstDocumentNumber() {
        return firstDocumentNumber;
    }

    public String getSecondAttorney() {
        return secondAttorney;
    }

    public String getSecondDocumentNumber() {
        return secondDocumentNumber;
    }

    public List<String> getAgreementEcommerce() {
        return agreementEcommerce;
    }
    public void setEcommerce(List<String> agreementEcommerce) {
        this.agreementEcommerce = agreementEcommerce;
    }

    public String getGeneralCommission() {
        return generalCommission;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getBankCciNumber() {
        return bankCciNumber;
    }

    public String getBankAccountImage() {
        return bankAccountImage;
    }

    public String getBankDetractionName() {
        return bankDetractionName;
    }

    public String getBankDetractionAccountNumber() {
        return bankDetractionAccountNumber;
    }

    public String getBankDetractionCciNumber() {
        return bankDetractionCciNumber;
    }

    public String getBankDetractionAccountImage() {
        return bankDetractionAccountImage;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getLinkModDespacho() {
        return linkModDespacho;
    }
}

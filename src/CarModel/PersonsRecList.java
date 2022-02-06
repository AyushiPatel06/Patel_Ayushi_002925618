/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarModel;

/**
 *
 * @author dpsmv
 */
public class PersonsRecList {
    private String LicensePlates;
    private String OwnerName;
    private String OwnerTelephoneNumbers;
    private String EngineNumber;
private String test;
    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    
    public PersonsRecList (String Lps, String OName, String Otelephone, String Engineno, String etest){
        this.LicensePlates = Lps;
        this.EngineNumber = Engineno;
        this.OwnerName =  OName;
        this.OwnerTelephoneNumbers = Otelephone;
        this.test=etest;
        
        
    }

    public String getLicensePlates() {
        return LicensePlates;
    }

    public void setLicensePlates(String LicensePlates) {
        this.LicensePlates = LicensePlates;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public String getOwnerTelephoneNumbers() {
        return OwnerTelephoneNumbers;
    }

    public void setOwnerTelephoneNumbers(String OwnerTelephoneNumbers) {
        this.OwnerTelephoneNumbers = OwnerTelephoneNumbers;
    }

    public String getEngineNumber() {
        return EngineNumber;
    }

    public void setEngineNumber(String EngineNumber) {
        this.EngineNumber = EngineNumber;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarModel;

import java.awt.Image;

/**
 *
 * @author dpsmv
 */
public class Person {
    
    private String Brand;
    private String Model;
    private String Color;
    private String Year;
    private String EngineNumber;
    private String SeatsNumber;
    private String LicensePlates;
    private String OwnerName;
    private String OwnerTelephoneNumbers;
    private String OwnerEmailAddress;
    private String OwnerDriverLicense;
    private String OwnerSSN;
    private String Owneraddress;
    private String ServiceRecords;
    private String WarrantyYear;
    private byte[] Photo;
    private Image image;
    public PersonRecords SerRec;
    
    

    public PersonRecords getSerRec() {
        return SerRec;
    }

    public void setSerRec(PersonRecords SerRec) {
        this.SerRec = SerRec;
    }
     
    
    public byte[] getPhoto() {
        return Photo;
    }

    public void setPhoto(byte[] photo) {
        this.Photo = Photo;
    }

        public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getEngineNumber() {
        return EngineNumber;
    }

    public void setEngineNumber(String EngineNumber) {
        this.EngineNumber = EngineNumber;
    }

    public String getSeatsNumber() {
        return SeatsNumber;
    }

    public void setSeatsNumber(String SeatsNumber) {
        this.SeatsNumber = SeatsNumber;
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

    public String getOwnerEmailAddress() {
        return OwnerEmailAddress;
    }

    public void setOwnerEmailAddress(String OwnerEmailAddress) {
        this.OwnerEmailAddress = OwnerEmailAddress;
    }

    public String getOwnerDriverLicense() {
        return OwnerDriverLicense;
    }

    public void setOwnerDriverLicense(String OwnerDriverLicense) {
        this.OwnerDriverLicense = OwnerDriverLicense;
    }

    public String getOwnerSSN() {
        return OwnerSSN;
    }

    public void setOwnerSSN(String OwnerSSN) {
        this.OwnerSSN = OwnerSSN;
    }

    public String getOwneraddress() {
        return Owneraddress;
    }

    public void setOwneraddress(String Owneraddress) {
        this.Owneraddress = Owneraddress;
    }

    public String getServiceRecords() {
        return ServiceRecords;
    }

    public void setServiceRecords(String ServiceRecords) {
        this.ServiceRecords = ServiceRecords;
    }

    public String getWarrantyYear() {
        return WarrantyYear;
    }

    public void setWarrantyYear(String WarrantyYear) {
        this.WarrantyYear = WarrantyYear;
    }

   

    
                
}

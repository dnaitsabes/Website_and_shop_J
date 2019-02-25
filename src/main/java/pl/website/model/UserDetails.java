package pl.website.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

// Nie potrzebne powiązania

@Entity
@Table(name = "users_details")
public class UserDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150)
    @Size(max = 150, message = "Z długa nazwa")
    private String companyName;

    @Column(length = 150)
    @Size(max = 150, message = "Z długa nazwa ulicy")
    @NotBlank(message = "Podaj nazwę ulicy")
    private String street;

    @Column(length = 60)
    @Size(max = 60, message = "Z długi numer")
    @NotBlank(message = "Podaj numer domu")
    private String buildingNumber;

    @Column(length = 30)
    @Size(max = 30, message = "Z długi numer")
    private String houseNumber;

    @Column(length = 150)
    @Size(max = 150, message = "Z długa nazwa")
    @NotBlank(message = "Podaj nazwę  miasta")
    private String cityName;

    @Column(length = 150)
    @Size(max = 150, message = "Z długai kod pocztowy")
    //Dodac jescze sprawdzanie kodu
    private String postalCode;

    @Column(length = 150)
    @Size(max = 150, message = "Z długa nazwa")
    private String phoneNumber;

    public UserDetails() {
    }

    public UserDetails(String companyName, String street, String buildingNumber, String houseNumber, String cityName, String postalCode, String phoneNumber) {
        this.companyName = companyName;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.houseNumber = houseNumber;
        this.cityName = cityName;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

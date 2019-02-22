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
}

package pl.website.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "newsletters")
public class Newsletter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 120, unique = true)
    @Size(min = 5,max =120)
    @Email
    @NotBlank(message = "Musisz podać adres e-mail ")
    private String email; // unique
}

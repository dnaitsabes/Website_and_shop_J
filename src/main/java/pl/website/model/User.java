package pl.website.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Powiązanie oneToOne z UserDetails jednostronnie
// Powiązanie oneToOne z order dwustronnie

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40)
    @Size(max = 40)
    @NotBlank(message = "Musisz podać Imie ")
    private String firstName;

    @Column(length = 60)
    @Size(max = 60)
    @NotBlank(message = "Musisz podać Nazwisko ")
    private String LastName;

    @Column(length = 120)
    @Size(min = 5,max =120)
    @Email
    @NotBlank(message = "Musisz podać adres e-mail ")
    private String email; // unique

    @Column(length = 50)
    @Size(min = 5,max =50)
    @NotBlank(message = "Pole hasło nie możę być puste")
    private String password;

    @NotNull
    private LocalDate userCreatedDate;

    @ColumnDefault("false")
    @NotNull
    private Boolean admin;

    // Relation oneToOne with userDetails one-way relation
    @OneToOne
    @JoinColumn(name ="user_details_id",unique = true)
    private UserDetails userDetails;

    //Relation OneToMany with order two-way relation
    @OneToMany( mappedBy = "user",cascade = CascadeType.ALL)
    private List<Order> order = new ArrayList<>();



}

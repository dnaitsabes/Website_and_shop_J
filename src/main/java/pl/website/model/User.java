package pl.website.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.mindrot.jbcrypt.BCrypt;

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

    @Column(length = 120, unique =true )
    @Size(min = 5,max =120)
    @Email
    @NotBlank(message = "Musisz podać adres e-mail ")
    private String email; // unique

    @Column()
    @Size(min = 5)
    @NotBlank(message = "Pole hasło nie możę być puste")
    private String password;

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

    public User() {
    }

    public User(String firstName, String lastName, String email, String password, LocalDate userCreatedDate, Boolean admin, UserDetails userDetails, List<Order> order) {
        this.firstName = firstName;
        LastName = lastName;
        this.email = email;
        this.password = password;
        this.userCreatedDate = userCreatedDate;
        this.admin = admin;
        this.userDetails = userDetails;
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public LocalDate getUserCreatedDate() {
        return userCreatedDate;
    }

    public void setUserCreatedDate(LocalDate userCreatedDate) {
        this.userCreatedDate = userCreatedDate;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userCreatedDate=" + userCreatedDate +
                ", admin=" + admin +
                ", userDetails=" + userDetails +
                ", order=" + order +
                '}';
    }
}

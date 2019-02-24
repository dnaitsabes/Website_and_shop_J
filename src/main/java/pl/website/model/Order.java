package pl.website.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Powiązanie z OneToMany z productami jednostronnie
//Powiązanie OneToOne z User dwustronnie

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(unique = true)
    @NotBlank
    private String orderCode;

    @Column
    @NotBlank
    private LocalDate orderDate;

    // relation ManyToMany with productsCategory
    @ManyToMany(cascade = CascadeType.MERGE)
    private List<ProductCategory> productCategory = new ArrayList<>();

    @ManyToOne
    private User user;


}

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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_order")
    private List<Product> products = new ArrayList<>();


    @ManyToOne(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;


}

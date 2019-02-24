package pl.website.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// powiązanie OneToMany z productSize jednostronnie
//Powiązanie ManyToMany z productDetails dwustronnie
@Entity
@Table(name = "products_details")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    @Size(max = 100)
    @NotBlank
    private String productColor;

    @Column(length = 100)
    @Size(max = 100)
    @NotBlank
    private String productTypeOfMaterial;

    @NotBlank
    private BigDecimal price;


    @ManyToMany(mappedBy = "productsDetails")
    private List<Product> products = new ArrayList<>();


}

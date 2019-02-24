package pl.website.model;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products_types")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    @Size(max = 100)
    @NotBlank
    private String productTypeName;

    @Column(length = 200)
    @Size(max = 200)
    @NotBlank
    private String productTypeDescription;

    //Relation Many to one with productCategories two-way relation
    @ManyToOne
    private ProductCategory productCategory;

    //Relation one to many with product, two-way relations
    @OneToMany(mappedBy = "products_types", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();
}

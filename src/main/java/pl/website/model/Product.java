package pl.website.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    @Size(max = 100)
    @NotBlank
    private String productName;

    @Column(length = 200)
    @Size(max = 200)
    @NotBlank
    private String productShortDescription;

    @Column(length = 500)
    @Size(max = 500)
    @NotBlank
    private String productCategoryDescription;

    // Relation Many to One with productType two-way relation
    @ManyToOne
    private ProductType productType;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<ProductDetails> productsDetails = new ArrayList<>();


    //Relation Many to many with oproductSuizeTable two-way relation
    @ManyToMany(cascade = CascadeType.MERGE)
    private List<ProductSizeTable> productSizeTables = new ArrayList<>();
}





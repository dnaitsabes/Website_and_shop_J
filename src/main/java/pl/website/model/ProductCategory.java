package pl.website.model;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products_categories")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length =100 )
    @Size(max = 100)
    @NotBlank(message = "pole productCategoryName nie możę być puste")
    private String productCategoryName;

    @Column(length =200 )
    @Size(max = 200)
    @NotBlank(message = "pole productCategoryDescripton nie możę być puste")
    private String productCategoryDescripton;


    //Relation One to many with productType  - two-way relations
    @OneToMany(mappedBy = "product_category", cascade = CascadeType.ALL)
    private List<ProductType> productTypes = new ArrayList<>();


}

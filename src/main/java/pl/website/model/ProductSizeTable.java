package pl.website.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "products_size_table")
public class ProductSizeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(length = 100)
    @Size(max = 100)
    @NotBlank
    private String productSizeCategory;

    //Codle of size type like S or XS
    @Column(length = 2)
    @Size(max = 2)
    @NotBlank
    private String getProductSizeCode;


    @Column(length = 200)
    @Size(max = 200)
    @NotBlank
    private String productSizeDescription;

}


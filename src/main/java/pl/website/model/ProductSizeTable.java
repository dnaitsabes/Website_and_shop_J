package pl.website.model;

import javax.persistence.*;

@Entity
@Table(name = "products_size_table")
public class ProductSizeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productSizeCategory;

    private String productSizeDescription;

}

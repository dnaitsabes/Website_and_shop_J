package pl.website.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products_details")
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private String productNameDescription;

    private String productSize;

    @OneToMany(mappedBy = "productsDetails", cascade = CascadeType.ALL)
    private List<ProductSizeTable> productSizeTables = new ArrayList<>();

    private String productColor;

    @ManyToMany(mappedBy = "productsDetails")
    private List<Product> products = new ArrayList<>();


}

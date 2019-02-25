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

    public Product() {
    }

    public Product(String productName, String productShortDescription, String productCategoryDescription, ProductType productType, List<ProductDetails> productsDetails, List<ProductSizeTable> productSizeTables) {
        this.productName = productName;
        this.productShortDescription = productShortDescription;
        this.productCategoryDescription = productCategoryDescription;
        this.productType = productType;
        this.productsDetails = productsDetails;
        this.productSizeTables = productSizeTables;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductShortDescription() {
        return productShortDescription;
    }

    public void setProductShortDescription(String productShortDescription) {
        this.productShortDescription = productShortDescription;
    }

    public String getProductCategoryDescription() {
        return productCategoryDescription;
    }

    public void setProductCategoryDescription(String productCategoryDescription) {
        this.productCategoryDescription = productCategoryDescription;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public List<ProductDetails> getProductsDetails() {
        return productsDetails;
    }

    public void setProductsDetails(List<ProductDetails> productsDetails) {
        this.productsDetails = productsDetails;
    }

    public List<ProductSizeTable> getProductSizeTables() {
        return productSizeTables;
    }

    public void setProductSizeTables(List<ProductSizeTable> productSizeTables) {
        this.productSizeTables = productSizeTables;
    }
}





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
    @Column(length = 4)
    @Size(max = 4)
    @NotBlank
    private String getProductSizeCode;


    @Column(length = 200)
    @Size(max = 200)
    @NotBlank
    private String productSizeDescription;

    public ProductSizeTable() {
    }

    public ProductSizeTable(String productSizeCategory, String getProductSizeCode, String productSizeDescription) {
        this.productSizeCategory = productSizeCategory;
        this.getProductSizeCode = getProductSizeCode;
        this.productSizeDescription = productSizeDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductSizeCategory() {
        return productSizeCategory;
    }

    public void setProductSizeCategory(String productSizeCategory) {
        this.productSizeCategory = productSizeCategory;
    }

    public String getGetProductSizeCode() {
        return getProductSizeCode;
    }

    public void setGetProductSizeCode(String getProductSizeCode) {
        this.getProductSizeCode = getProductSizeCode;
    }

    public String getProductSizeDescription() {
        return productSizeDescription;
    }

    public void setProductSizeDescription(String productSizeDescription) {
        this.productSizeDescription = productSizeDescription;
    }

    @Override
    public String toString() {
        return "ProductSizeTable{" +
                "id=" + id +
                ", productSizeCategory='" + productSizeCategory + '\'' +
                ", getProductSizeCode='" + getProductSizeCode + '\'' +
                ", productSizeDescription='" + productSizeDescription + '\'' +
                '}';
    }
}


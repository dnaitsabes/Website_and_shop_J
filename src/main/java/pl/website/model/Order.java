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

    // relation ManyToMany with productsCategory
    @ManyToMany(cascade = CascadeType.MERGE)
    private List<ProductCategory> productCategory = new ArrayList<>();

    @ManyToOne
    private User user;

    public Order() {
    }

    public Order(String orderCode, LocalDate orderDate, List<ProductCategory> productCategory, User user) {
        this.orderCode = orderCode;
        this.orderDate = orderDate;
        this.productCategory = productCategory;
        this.user = user;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<ProductCategory> getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(List<ProductCategory> productCategory) {
        this.productCategory = productCategory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

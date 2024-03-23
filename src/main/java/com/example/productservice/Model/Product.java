package com.example.productservice.Model;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter

public class Product
{
    @Id
    @Column(name = "products_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long products_id;


    @Column(name = "name")
    private  String productName;

    @Column(name = "description")
    private String productDetail;

    @Column(name = "price")
    private float productPrice;

    @Column(name = "stock")
    private int stockAvailable;

    @Column(name = "category_name")
    private String category_name;

    @Column(name = "image_url")
    private String image_url;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    public Product() {
        super();
    }

    public Product(String productName, String productDetail, float productPrice, int stockAvailable , String category_name, String image_url) {
        super();
        this.productName = productName;
        this.productDetail = productDetail;
        this.productPrice = productPrice;
        this.stockAvailable = stockAvailable;
        this.category_name = category_name;
        this.image_url = image_url;
    }
}

package com.ecom.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) // Relationship with User
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Ensure this field is properly named and has getters/setters

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> items;

    private LocalDateTime orderDate;
    private double totalAmount;
    private String status;

}
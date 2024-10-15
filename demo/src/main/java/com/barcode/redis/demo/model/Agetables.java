package com.barcode.redis.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import java.time.LocalDateTime;
import javax.persistence.ManyToOne;

@Entity
public class Agetables {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime created_at;
    
    @ManyToOne
    @JoinColumn(name = "name_id", referencedColumnName = "id")
    private TestTable testTable;
    private LocalDateTime updated_at;

    // Getters and setters are omitted for brevity
}
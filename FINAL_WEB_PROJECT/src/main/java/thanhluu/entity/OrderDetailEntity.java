package thanhluu.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "quantity")
    private int quantity;
    
    @Column(name = "unit_price")
    private double unitPrice;
    
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order; // The order this item belongs to
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
}

package thanhluu.entity;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "total_amount")
	private double totalAmount;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	@OneToMany(mappedBy = "order")
	private List<OrderDetailEntity> orderDetails;

	

	@ManyToOne
	@JoinColumn(name = "shipper_id")
	private ShipperEntity shipper; // Shipper for delivery

	// Thêm thông tin discount đã áp dụng
	@ManyToOne
	@JoinColumn(name = "discount_id")
	private DiscountEntity discount;
}

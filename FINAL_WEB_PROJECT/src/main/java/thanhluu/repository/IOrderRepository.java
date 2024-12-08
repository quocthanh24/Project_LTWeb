package thanhluu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thanhluu.entity.OrderEntity;

@Repository
public interface IOrderRepository extends JpaRepository<OrderEntity, Long>{

}

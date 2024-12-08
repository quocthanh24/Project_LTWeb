package thanhluu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import thanhluu.entity.DiscountEntity;
import thanhluu.entity.UserDiscountEntity;
import thanhluu.entity.UserEntity;

@Repository
public interface IUserDiscountRepository extends JpaRepository<UserDiscountEntity, Long>{

	public UserDiscountEntity findByUserAndDiscount(UserEntity user,DiscountEntity discount);
}

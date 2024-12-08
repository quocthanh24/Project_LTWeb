package thanhluu.service;

import org.springframework.stereotype.Service;

import thanhluu.entity.DiscountEntity;
import thanhluu.entity.UserDiscountEntity;
import thanhluu.entity.UserEntity;

@Service
public interface IUserDiscountService {

	public UserDiscountEntity findByUserAndDiscount(UserEntity user, DiscountEntity discount);
	
	public void save(UserDiscountEntity userDiscount);
}

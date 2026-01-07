package E_commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import E_commerce.Model.CartOrders;

@Repository
public interface UserRepository extends JpaRepository <CartOrders,Integer> {    
}

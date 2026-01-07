package E_commerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import E_commerce.Model.CartOrders;
import E_commerce.Repository.UserRepository;

@Service
public class Ecommerceservice {

    @Autowired
    private UserRepository userRepository;

    public void addproduct(CartOrders cartOrders) {
        userRepository.save(cartOrders);
    }
}

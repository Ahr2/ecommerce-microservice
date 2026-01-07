package E_commerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import E_commerce.Model.CartOrders;
import E_commerce.Service.Ecommerceservice;


@RestController
public class EcommerceController {
    
    @Autowired
    private Ecommerceservice ecommerceservice;


    @PostMapping("/addproduct")
    public ResponseEntity<String> addproduct(@RequestBody CartOrders cartOrders){
        ecommerceservice.addproduct(cartOrders);
        return ResponseEntity.status(HttpStatus.CREATED).body("product created successfully");
    }
}

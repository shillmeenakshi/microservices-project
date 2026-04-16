package Order_service.controller;

import Order_service.config.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private UserClient userClient;

//    @GetMapping
//    public String getOrders() {
//        return "Order Service Running";
//    }
    @GetMapping
    public String getOrders() {
        String users = userClient.getUsers();
        return "Order Service + " + users;
    }
}

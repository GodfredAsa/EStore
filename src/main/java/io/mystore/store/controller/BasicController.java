package io.mystore.store.controller;

import io.mystore.store.client.response.ApiResponse;
import io.mystore.store.entity.Address;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BasicController {

    @GetMapping("/address")
    public ApiResponse<Address> getShippingAddress(){
        Address address =  new Address(1L, 2L, "Nima", "Accra", "00233", "Ghana", 230.20);
        System.out.println(address);
        return  new ApiResponse<>("Get All Address", HttpStatus.OK.value(), address);
    }
}

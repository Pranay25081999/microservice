package com.example.address.controller;


import com.example.address.response.AddressResponse;
import com.example.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("address/{emp_id}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("emp_id") int emp_id){
    AddressResponse addressResponse=null;
 addressResponse=addressService.findAddressByEmployeeId(emp_id);
    return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
}

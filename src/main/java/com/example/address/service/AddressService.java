package com.example.address.service;

import com.example.address.entity.Address;
import com.example.address.repository.AddressRepo;
import com.example.address.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;
    @Autowired
    private ModelMapper modelMapper;
    public AddressResponse findAddressByEmployeeId(int emp_id){
       Address address=addressRepo.findAddressByEmployeeId(emp_id);
       AddressResponse addressResponse=modelMapper.map(address,AddressResponse.class);
       return addressResponse;
    }
}

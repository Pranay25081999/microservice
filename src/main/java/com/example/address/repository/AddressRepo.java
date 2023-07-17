package com.example.address.repository;

import com.example.address.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AddressRepo extends JpaRepository<Address,Integer> {
 @Query(nativeQuery = true,value= "select ea.id,ea.lane1,ea.lane2,ea.state,ea.zip from  microservice.address ea join microservice.employee e on e.emp_id=ea.emp_id where ea.emp_id=:emp_id")
 Address findAddressByEmployeeId(@Param("emp_id") int emp_id);
}

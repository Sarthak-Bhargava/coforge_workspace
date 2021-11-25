package com.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

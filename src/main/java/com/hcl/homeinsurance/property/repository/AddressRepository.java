package com.hcl.homeinsurance.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.homeinsurance.property.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {

}

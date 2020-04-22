package com.hcl.homeinsurance.property.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.homeinsurance.property.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}

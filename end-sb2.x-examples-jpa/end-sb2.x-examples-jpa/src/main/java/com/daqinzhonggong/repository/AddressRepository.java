package com.daqinzhonggong.repository;

import com.daqinzhonggong.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
package com.kz.person.dao;

import com.kz.person.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by scelac on 4/19/16.
 */
public interface AddressDAO extends JpaRepository<Address,Long> {
}

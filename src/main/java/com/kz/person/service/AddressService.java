package com.kz.person.service;

import com.kz.person.entity.Address;

import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
public interface AddressService {

    public Address addAddress(Address address);
    public Address getById(Long id);
    public List<Address> getAll();
    public Address editAddress(Address address);
    public void delete(Long id);

}

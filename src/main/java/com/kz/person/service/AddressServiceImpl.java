package com.kz.person.service;

import com.kz.person.dao.AddressDAO;
import com.kz.person.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
@Service
public class AddressServiceImpl implements AddressService
{

    @Autowired
    AddressDAO addressDAO;

    @Override
    @Transactional
    public Address addAddress(Address address) {
        return addressDAO.saveAndFlush(address);
    }

    @Override
    @Transactional
    public Address getById(Long id) {
        return addressDAO.findOne(id);
    }

    @Override
    @Transactional
    public List<Address> getAll() {
        return addressDAO.findAll();
    }

    @Override
    @Transactional
    public Address editAddress(Address address) {
        return addressDAO.saveAndFlush(address);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        addressDAO.delete(id);
    }
}


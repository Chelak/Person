package com.kz.person.controller;

import com.kz.person.entity.Address;
import com.kz.person.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by scelac on 4/19/16.
 */
@RestController
@RequestMapping("/address")
public class AddressController
{
    @Autowired
    AddressService addressService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Address getById(@PathVariable Long id)
    {
        return addressService.getById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Address> getAll()
    {
        return addressService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Address addAddress(@RequestBody Address address)
    {
       return addressService.addAddress(address);
    }

    @RequestMapping(method=RequestMethod.PUT)
    public Address updateAddress (@RequestBody Address address)
    {
        return addressService.editAddress(address);
    }
}

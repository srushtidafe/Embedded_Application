package com.geekster.EmbeddedApplication.Controller;

import com.geekster.EmbeddedApplication.Model.Address;
import com.geekster.EmbeddedApplication.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @GetMapping("Address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @GetMapping("Address/addressId/{addressId}")
    public Optional<Address> getAddressById(@PathVariable Long addressId){
        return addressService.getAddressById(addressId);
    }

    @PostMapping("Address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @DeleteMapping("Address/addressId/{addressId}")
    public String removeAddressById(@PathVariable Long addressId){
        return addressService.removeAddressById(addressId);
    }
}

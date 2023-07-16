package com.geekster.EmbeddedApplication.Service;

import com.geekster.EmbeddedApplication.Model.Address;
import com.geekster.EmbeddedApplication.Repository.IAddressRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public List<Address> getAllAddress() {
        return  addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long addressId) {
        return addressRepo.findById(addressId);
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Added";
    }

    public String removeAddressById(Long addressId) {
        addressRepo.deleteById(addressId);
        return "Deleted";
    }
}

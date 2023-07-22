package com.geekster.JoinMapping.controller.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Address;
import com.geekster.JoinMapping.model.oneToOne.Student;
import com.geekster.JoinMapping.service.oneToOne.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddService addService;
    // add address
    @PostMapping("create/add")

    public String insertAdd(@RequestBody List<Address> addresses){
        return addService.insertAdd(addresses);
    }

    @GetMapping("find/Address")
    public Iterable<Address> findAllAddress(){
        return addService.findAllAddress();
    }

    @GetMapping("find/by/address/{Id}")
   public Optional<Address> getByIdAddress(@PathVariable Long Id){
        return addService.getByIdAddress(Id);
    }

    @GetMapping("find/all/by/ids")
        public Iterable<Address> getAllByIds(@RequestBody Iterable<Long> ids ){

        return addService.getAllByIds(ids);
    }
    @PutMapping("updated/Information/{Id}")
    public String updateAddress(@PathVariable Long Id,@RequestBody Address address ){
        return addService.updateAddress(Id,address);
    }

    @DeleteMapping("delete/address/{Id}")
    public String deleteAddress(@PathVariable Long Id){
        return addService.deleteAddress(Id);
    }
}

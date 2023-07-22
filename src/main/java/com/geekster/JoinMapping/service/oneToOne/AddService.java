package com.geekster.JoinMapping.service.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Address;
import com.geekster.JoinMapping.model.oneToOne.Student;
import com.geekster.JoinMapping.repository.oneToOne.IAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class AddService {
    @Autowired
    IAddRepo iAddRepo;

    public String insertAdd(List<Address> addresses) {
        iAddRepo.saveAll(addresses);
        return "insert into address successful";
    }

    public Iterable<Address> findAllAddress() {
        return iAddRepo.findAll();
    }

    public Optional<Address> getByIdAddress(Long id) {
        return iAddRepo.findById(id);
    }

    public Iterable<Address> getAllByIds(Iterable<Long> ids) {
        return iAddRepo.findAllById(ids);
    }


    public String updateAddress(Long id,Address address) {
       Address address1 = iAddRepo.findFirstByAddressId(id);

        if(address1 == null){
            return "Address not found";
        }
        else {
            iAddRepo.save(address);
        }
        return "address update successful";
    }

    public String deleteAddress(Long id) {
         iAddRepo.deleteById(id);
         return "delete by id";
    }
}

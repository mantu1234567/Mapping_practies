package com.geekster.JoinMapping.repository.oneToOne;

import com.geekster.JoinMapping.model.oneToOne.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddRepo extends CrudRepository<Address,Long> {

    Address findFirstByAddressId(Long id);
}

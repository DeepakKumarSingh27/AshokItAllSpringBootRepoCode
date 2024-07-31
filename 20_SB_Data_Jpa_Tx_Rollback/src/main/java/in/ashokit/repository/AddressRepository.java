package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Serializable>{

}

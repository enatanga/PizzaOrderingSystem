package dmacc.repository;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.model.Customer;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long>
{

  Customer findByEmailAddress(String username);

}

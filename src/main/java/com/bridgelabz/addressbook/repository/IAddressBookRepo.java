package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.entity.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressBookRepo extends JpaRepository <AddressBook , Integer>{
}

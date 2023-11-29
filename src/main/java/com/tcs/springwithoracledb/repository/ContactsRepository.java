package com.tcs.springwithoracledb.repository;

import com.tcs.springwithoracledb.entity.Contacts;
import org.springframework.data.repository.CrudRepository;

public interface ContactsRepository extends CrudRepository<Contacts,Integer> {
}

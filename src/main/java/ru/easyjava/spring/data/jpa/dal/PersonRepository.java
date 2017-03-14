package ru.easyjava.spring.data.jpa.dal;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import ru.easyjava.spring.data.jpa.entity.Person;

/**
 * Repository for person entity.
 */
public interface PersonRepository extends CrudRepository<Person, Long>, JpaSpecificationExecutor<Person> { }

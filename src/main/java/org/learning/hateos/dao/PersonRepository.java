package org.learning.hateos.dao;

import org.learning.hateos.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by vishantshah on 20/05/18.
 */
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{
    /**
     * Find Person by Last Name
     * @param name
     * @return
     */
    List<Person> findByLastName(@Param("name") String name);
}

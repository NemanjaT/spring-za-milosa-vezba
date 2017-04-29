package com.amilos.repositories;

import com.amilos.models.Actor;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface BasicActorCrudRepository extends CrudRepository<Actor, Long> {

    Actor findFirstByFirstName(String firstName);
    Actor findFirstByLastName(String lastName);

}

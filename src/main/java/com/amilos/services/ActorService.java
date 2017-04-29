package com.amilos.services;

import com.amilos.models.Actor;

/**
 *
 */
public interface ActorService {

    Actor getFirstByFirstName(String firstName);
    Actor getFirstByLastName(String lastName);
    // ...

}

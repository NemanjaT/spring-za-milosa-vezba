package com.amilos.servicesimplementations;

import com.amilos.models.Actor;
import com.amilos.repositories.BasicActorCrudRepository;
import com.amilos.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ActorServiceImpl implements ActorService {
//    private final BasicActorCrudRepository basicActorCrudRepository;
//
//    public ActorServiceImpl(BasicActorCrudRepository basicActorCrudRepository) {
//        this.basicActorCrudRepository = basicActorCrudRepository;
//    }
    @Autowired
    private BasicActorCrudRepository basicActorCrudRepository;

    @Override
    public Actor getFirstByFirstName(String firstName) {
        Actor ac = basicActorCrudRepository.findFirstByFirstName(firstName);
        ac.setFirstName(ac.getFirstName() + "AAA");
        return ac;
    }

    @Override
    public Actor getFirstByLastName(String lastName) {
        return basicActorCrudRepository.findFirstByLastName(lastName);
    }

    // ...
}

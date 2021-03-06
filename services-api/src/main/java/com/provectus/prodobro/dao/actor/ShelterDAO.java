package com.provectus.prodobro.dao.actor;


import com.provectus.prodobro.actor.shelter.Shelter;
import com.provectus.prodobro.actor.shelter.ShelterType;
import com.provectus.prodobro.dao.GenericDAO;
import com.provectus.prodobro.shared.status.Status;

import java.util.List;

public interface ShelterDAO extends GenericDAO<Shelter, Long> {

    Shelter getByTitle(String title);

    List<Shelter> getByStatus(Status status);

    List<Shelter> getByType(ShelterType type);
}

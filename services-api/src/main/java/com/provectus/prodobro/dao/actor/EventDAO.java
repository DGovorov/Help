package com.provectus.prodobro.dao.actor;


import com.provectus.prodobro.actor.event.Event;
import com.provectus.prodobro.dao.GenericDAO;
import com.provectus.prodobro.shared.status.Status;

import java.sql.Timestamp;
import java.util.List;

public interface EventDAO extends GenericDAO<Event, Long> {

    Event getByTitle(String title);

    Event getByDate(Timestamp date);

    List<Event> getByStatus(Status status);

    List<Event> getAccessible();

    List<Event> getPrivate();
}

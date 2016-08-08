package com.provectus.prodobro.actor.user;


import com.provectus.prodobro.actor.EmployeeRelation;
import com.provectus.prodobro.actor.event.Event;
import com.provectus.prodobro.additional.avatar.Avatar;
import com.provectus.prodobro.additional.info.Info;
import com.provectus.prodobro.additional.status.Status;

import java.sql.Timestamp;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;

public interface User {

    int getId();

    Optional<Avatar> getAvatar();

    Optional<byte[]> getAvatarBytea();

    /**
     * Information: Photos, Emails, Websites, etc.
     *
     * @return {@link Set<Info>} of Actor`s information
     */
    Set<Info> getInfo();

    Status getStatus();

    Timestamp getCreatedDate();

    User getCreatedBy();

    Timestamp getLastModifiedDate();

    User getLastModifiedBy();

    String getFirstName();

    String getLastName();

    String getEmail();

    String getPassHash();

    String getPhoneNumber();

    /**
     * @return User`s locale
     */
    Locale getLanguage();

    /**
     * @return {@link Optional<EmployeeRelation>} user`s company
     */
    Optional<EmployeeRelation> getEmployeeRelation();

    /**
     * @return {@link Set<Event>} of events, where {@link User} is assigned
     */
    Set<Event> getAssignedEvents();

    /**
     * @return {@link Set<Event>} of events, {@link User} has created
     */
    Set<Event> getCreatedEvents();

    void setId(int id);

    void setAvatar(Avatar avatar);

    void setInfo(Set<Info> info);

    void setStatus(Status status);

    void setCreatedDate(Timestamp createdDate);

    void setCreatedBy(User createdBy);

    void setLastModifiedDate(Timestamp lastModifiedDate);

    void setLastModifiedBy(User lastModifiedBy);

    void addInfo(Info info);

    void removeInfo(Info info);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    void setEmail(String email);

    void setPassHash(String passHash);

    void setPhoneNumber(String phoneNumber);

    void setLanguage(Locale language);

    void setEmployeeRelation(EmployeeRelation employeeRelation);

    void setAssignedEvents(Set<Event> assignedEvents);

    void addAssignedEvent(Event event);

    void removeAssignedEvent(Event event);

}

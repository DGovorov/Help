package com.provectus.prodobro.actor.company;


import com.provectus.prodobro.actor.EmployeeRelation;
import com.provectus.prodobro.actor.event.Event;
import com.provectus.prodobro.actor.user.User;
import com.provectus.prodobro.additional.avatar.Avatar;
import com.provectus.prodobro.additional.info.Info;
import com.provectus.prodobro.additional.status.Status;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.Set;

public interface Company {

    int getId();

    Optional<Avatar> getAvatar();

    Optional<byte[]> getAvatarBytea();

    /**
     * Information: Photos, Emails, Websites, etc.
     *
     * @return {@link Set< Info >} of Actor`s information
     */
    Set<Info> getInfo();

    Status getStatus();

    Timestamp getCreatedDate();

    User getCreatedBy();

    Timestamp getLastModifiedDate();

    User getLastModifiedBy();

    String getTitle();

    Set<String> getStringAliases();

    Set<CompanyAlias> getAliases();

    String getDescription();

    /**
     * @return {@link Set<EmployeeRelation>} of assigned users
     */
    Set<EmployeeRelation> getEmployeeRelations();

    Set<User> getUsers();

    Set<User> getAdmins();

    /**
     * @return {@link Set<User>} of company assigned events
     */
    Set<Event> getAssignedEvents();

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

    void setTitle(String title);

    void setAliases(Set<CompanyAlias> aliases);

    void setDescription(String description);

    void setEmployeeRelations(Set<EmployeeRelation> employeeRelations);

    void setAssignedEvents(Set<Event> assignedEvents);

    void addAlias(CompanyAlias alias);

    void removeAlias(CompanyAlias alias);

    void addEmployeeRelation(EmployeeRelation employeeRelation);

    void removeEmployeeRelation(EmployeeRelation employeeRelation);

    void addAssignedEvent(Event event);

    void removeAssignedEvent(Event event);

}

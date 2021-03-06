package com.provectus.prodobro.actor.shelter;


import com.provectus.prodobro.actor.event.Event;
import com.provectus.prodobro.actor.user.User;
import com.provectus.prodobro.shared.avatar.Avatar;
import com.provectus.prodobro.shared.info.Info;
import com.provectus.prodobro.shared.status.Status;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.Set;

public interface Shelter {

    Long getId();

    Optional<Avatar> getAvatar();

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

    String getTitle();

    Optional<String> getDescription();

    ShelterType getType();

    /**
     * @return {@link Optional}<{@link Event}> for shelter
     */
    Optional<Event> getEvent();

    Set<Tag> getTags();

    void setId(Long id);

    void setAvatar(Avatar avatar);

    void setInfo(Set<Info> info);

    void setStatus(Status status);

    void setCreatedDate(Timestamp createdDate);

    void setCreatedBy(User createdBy);

    void setLastModifiedDate(Timestamp lastModifiedDate);

    void setLastModifiedBy(User lastModifiedBy);

    void setTitle(String title);

    void setDescription(String description);

    void setType(ShelterType type);

    void setEvent(Event event);

    void setTags(Set<Tag> tags);

}

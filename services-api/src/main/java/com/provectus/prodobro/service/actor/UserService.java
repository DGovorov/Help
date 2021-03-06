package com.provectus.prodobro.service.actor;


import com.provectus.prodobro.actor.user.User;
import com.provectus.prodobro.service.GenericService;
import com.provectus.prodobro.shared.status.Status;

import java.util.List;


public interface UserService extends GenericService<User, Long> {

    void makeRemovedById(Long id);

    List<User> getByName(String name);

    List<User> getByStatus(Status status);

    User getByPhoneNumber(String phoneNumber);

    User getByEmail(String email);

}

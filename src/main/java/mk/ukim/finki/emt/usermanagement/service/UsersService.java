package mk.ukim.finki.emt.usermanagement.service;

import mk.ukim.finki.emt.usermanagement.model.User;
import mk.ukim.finki.emt.usermanagement.model.exception.UserDoesNotExistsException;
import mk.ukim.finki.emt.usermanagement.model.exception.UsernameAlreadyExistsException;
import mk.ukim.finki.emt.usermanagement.model.exception.WeakExceptionPassword;
import mk.ukim.finki.emt.usermanagement.model.exception.WrongActivationCodeException;

public interface UsersService {



    User createUnconfirmedUser (String username, String name, String password, String email)
    throws UsernameAlreadyExistsException, WeakExceptionPassword;

    User confirmUser (String username, String password, String activationCode)
            throws UserDoesNotExistsException, WrongActivationCodeException;

}

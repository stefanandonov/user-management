package mk.ukim.finki.emt.usermanagement.service;

import mk.ukim.finki.emt.usermanagement.model.User;
import mk.ukim.finki.emt.usermanagement.model.exception.*;

import java.util.List;

public interface UsersService {


    User createUnconfirmedUser(String username, String name, String password, String email)
            throws UsernameAlreadyExistsException, WeakExceptionPassword;

    User confirmUser(String username, String password, String activationCode)
            throws UserDoesNotExistsException, WrongActivationCodeException;

    User login(String username, String password) throws UserDoesNotExistsException, WrongPasswordException;

    boolean logout(String username);

    User changePassword(String username, String oldPassword, String newPassword) throws WeakExceptionPassword;

    List<User> getAllUsers(Long requestUserId);

    User upadateUserUsername (String username, String newUsername) throws
            UsernameAlreadyExistsException;



}
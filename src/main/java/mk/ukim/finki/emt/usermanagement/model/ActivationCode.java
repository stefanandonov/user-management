package mk.ukim.finki.emt.usermanagement.model;

import mk.ukim.finki.emt.usermanagement.utils.RandomActivationCodeGenerator;

import java.time.ZonedDateTime;

public class ActivationCode {

    public String code;

    public ZonedDateTime expirationDate;

    public ActivationCode () {

    }

    /**
     * Factory method
     */

    public static ActivationCode createActivationCodePerUser (ZonedDateTime dateCreated) {
        ActivationCode activationCode = new ActivationCode();

        activationCode.code = RandomActivationCodeGenerator.generateActivationCode();
        activationCode.expirationDate = dateCreated.plusHours(24);

        return activationCode;
    }

}

package it.sibguys.entities.user;

import it.sibguys.validators.IProfessionValidator;

public class UserFactory {
    private final IProfessionValidator professions;

    public UserFactory(IProfessionValidator professions) {
        this.professions = professions;
    }

    public User createUser(long id, String name, String profession) throws InvalidProfessionException {
        if (!professions.validate(profession)) {
            throw new InvalidProfessionException("Invalid Profession");
        }
        return new User(id, name, profession);
    }
}

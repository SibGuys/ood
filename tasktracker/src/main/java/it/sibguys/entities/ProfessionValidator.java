package it.sibguys.entities;

import it.sibguys.validators.IProfessionValidator;

public class ProfessionValidator implements IProfessionValidator {
    private Professions professions;

    public ProfessionValidator(Professions professions) {
        this.professions = professions;
    }

    public boolean validate(String profession) {
        return professions.getProfessionList().contains(profession);
    }
}

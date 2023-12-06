package it.sibguys.entities;

public class ProfessionValidator {
    private Professions professions;

    public ProfessionValidator(Professions professions) {
        this.professions = professions;
    }

    public boolean validate(String profession) {
        return professions.getProfessionList().contains(profession);
    }
}

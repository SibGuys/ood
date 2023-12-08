package it.sibguys.entities;

import it.sibguys.validators.IProfessionValidator;

import java.util.ArrayList;
import java.util.List;

public class Professions implements IProfessionValidator {
    private final List<String> professionList;

    public Professions() {
        this.professionList = new ArrayList<>();
    }

    public void addProfession(String job) {
        if (!professionList.contains(job)) {
            professionList.add(job);
        }
    }

    public void removeProfession(String job) {
        professionList.remove(job);
    }

    @Override
    public boolean validate(String professionName) {
        return professionList.contains(professionName);
    }
}

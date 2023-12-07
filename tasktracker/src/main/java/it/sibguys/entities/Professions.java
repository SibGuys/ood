package it.sibguys.entities;

import java.util.ArrayList;
import java.util.List;

public class Professions {
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

    public List<String> getProfessionList() {
        return professionList;
    }
}

package it.sibguys.entities;

import java.util.List;

public class Professions {
    private List<String> professionList;

    public void addProfession(String job) {
        professionList.add(job);
    }

    public void removeProfession(String job) {
        professionList.remove(job);
    }

    public List<String> getProfessionList() {
        return professionList;
    }
}

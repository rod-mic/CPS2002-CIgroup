package com.examples.one.petstore;

class Puppy{
    int id;
    String name;
    String breed;
    boolean loudBark;
    int exerciseRequiredPerDay;
    boolean friendlyWithChildren;

    public Puppy(int id, String name, String breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public boolean getLoudBark() {
        return this.loudBark;
    }

    public int getExerciseRequiredPerDay() {
        return this.exerciseRequiredPerDay;
    }

    public int getFriendlyWithChildren() {
        return this.friendlyWithChildren;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setLoudBark(boolean loudBark) {
        this.loudBark = loudBark;
    }

    public void setExerciseRequiredPerDay(int erpd) {
        this.exerciseRequiredPerDay = erpd;
    }

    public void setFriendlyWithChildren(boolean fwc) {
        this.friendlyWithChildren = fwc;
    }
}
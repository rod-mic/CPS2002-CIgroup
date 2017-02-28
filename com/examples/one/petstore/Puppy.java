package com.examples.one.petstore;

class Puppy extends Pet{

    boolean loudBark;
    int exerciseRequiredPerDay;
    boolean friendlyWithChildren;

    public Puppy(int id, String name, String breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
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
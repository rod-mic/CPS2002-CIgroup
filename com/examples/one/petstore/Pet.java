package com.examples.one.petstore;

class Pet{
    int id;
    String name;
    String breed;

    public Pet(int id, String name, String breed) {
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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}

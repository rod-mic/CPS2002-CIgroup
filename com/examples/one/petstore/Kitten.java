package com.examples.one.petstore;

class Kitten extends Pet{

    boolean sensitiveToFeeding;

    public Kitten(int id, String name, String breed){
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public void setBreed(String b){
        if(b.equals("Persian")||b.equals("Siamese")||b.equals("Bengal")){
            breed = b;
        }

    }

    public void setSensitiveToFeeding(boolean s){
        sensitiveToFeeding = s;
    }

    public boolean getSensitiveFeeding(){
        return sensitiveToFeeding;
    }
}
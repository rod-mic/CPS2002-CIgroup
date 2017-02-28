package com.examples.one.petstore;

class Kitten{
    private int id;
    private String name;
    private String breed;
    private boolean sensitiveToFeeding;

    public Kitten(int id, String name, String breed){
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public void setId(int i){
        id = i;
    }

    public void setName(String n){
        name = n;
    }

    public void setBreed(String b){
        if(b.equals("Persian")||b.equals("Siamese")||b.equals("Bengal")){
            breed = b;
        }

    }

    public void setSensitiveToFeeding(boolean s){
        sensitiveToFeeding = s;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public boolean getSensitiveFeeding(){
        return sensitiveToFeeding;
    }
}
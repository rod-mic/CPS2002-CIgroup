package com.examples.one.petstore;
class KittenDB{
	ArrayList<Kitten> Kittens = new ArrayList<Kitten>;
	boolean addKitten(Kitten k){
		return Kittens.add(k);
	}
	boolean delKitten(int id)){
		if(Kittens.remove(id) == null){
			return false;
		}else return true;
	}
	Kitten getKitten(int id){
		return Kittens.get(id);
	}
	int countKittens(){
		return Kittens.size();
	}
}
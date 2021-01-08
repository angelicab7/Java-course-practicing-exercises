package com.angelica.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Animal> animalList = new ArrayList<Animal>();

        List<String> animalFeatures = new ArrayList<>();
        animalFeatures.add("Grey");
        animalFeatures.add("Big");
        animalList.add(new Animal("Elephant", "Mammal", animalFeatures, "Horns"));

        animalFeatures = new ArrayList<>();
        animalFeatures.add("Yellow");
        animalFeatures.add("King");
        animalList.add(new Animal("Lion", "Mammal", animalFeatures, "Jungle King"));

        animalFeatures = new ArrayList<>();
        animalFeatures.add("Black");
        animalFeatures.add("Dangerous");
        animalFeatures.add("Poisonous");
        animalList.add(new Animal("Snake", "Reptile", animalFeatures, "Fangs"));

        animalFeatures = new ArrayList<>();
        animalFeatures.add("Chubby");
        animalFeatures.add("Clumsy");
        animalList.add(new Animal("Panda bear", "Mammal", animalFeatures, "Cute"));

        for(int i = 0; i < animalList.size(); i ++){
            Animal currentAnimal = animalList.get(i);
            System.out.println("Name: " + currentAnimal.getName());
            System.out.println("Specie: " + currentAnimal.getSpecie());
            System.out.println("Features: " + currentAnimal.getFeatures());
            System.out.println("Most liked feature: " + currentAnimal.getMostLikedFeature() + "\n");

        }
    }

}

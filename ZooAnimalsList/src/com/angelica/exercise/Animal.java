package com.angelica.exercise;

public class Animal {
    private String name;
    private String specie;
    private String features;
    private String mostLikedFeature;

    public Animal (String name, String specie, String features, String mostLikedFeature){
        this.name = name;
        this.specie = specie;
        this.features = features;
        this.mostLikedFeature = mostLikedFeature;
    }

    public String getName() {
        return name;
    }

    public String getSpecie() {
        return specie;
    }
    public String getFeatures(){
        return features;
    }
    public String getMostLikedFeature(){
        return mostLikedFeature;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSpecie(String specie){
        this.specie = specie;
    }
    public void setFeatures(String features){
        this.features = features;
    }
    public void  setMostLikedFeature(String mostLikedFeature){
        this.mostLikedFeature = mostLikedFeature;
    }
}

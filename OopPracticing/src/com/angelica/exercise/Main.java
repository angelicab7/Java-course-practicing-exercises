package com.angelica.exercise;

public class Main {

    public static void main(String[] args) { //object
	  Person firstPerson = new Person(); //Instance
	  firstPerson.name = "Jared";
	  firstPerson.lastName = "Leto"; //Instance values
      firstPerson.getInfo();
		System.out.println("firstPerson = " + firstPerson);

      Person secondPerson = new Person();
      secondPerson.name = "Shannon";
      secondPerson.lastName = "Leto";
      secondPerson.getInfo();
		System.out.println("secondPerson = " + secondPerson);

    }
}

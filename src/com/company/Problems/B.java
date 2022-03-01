package com.company.Problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Person{
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        while(scanner.hasNextLine()){
            String[] fullName = scanner.nextLine().split(" ");
            String firstName = fullName[0];
            String lastName = fullName[1];
            people.add(new Person(firstName, lastName));
        }

        //Sort by last name, if the name is equal, sort by first name!
        people.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));

        //Person -> person name frequency
        HashMap<String, Integer> frequencyList = new HashMap<>();

        for (Person person : people) {
            String firstName = person.getFirstName();
            frequencyList.putIfAbsent(firstName, 0);
            int currentFrequency = frequencyList.get(firstName);
            int newFrequency = currentFrequency + 1;
            frequencyList.put(firstName, newFrequency);
        }

        for(Person person : people){
            String firstName = person.getFirstName();
            String lastName = person.getLastName();
            int frequency = frequencyList.get(firstName);

            if(frequency >= 2){
                System.out.println(firstName + " " + lastName);
            }else{
                System.out.println(firstName);
            }
        }
    }
}
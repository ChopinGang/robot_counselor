/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.ArrayList;

/**
 *
 * @author Kellan Elhai
 */
public class Scheduler {
    
    public static void schedulePerson(ArrayList<String> person) {
        ArrayList<ArrayList<String>> period = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            period.add(new ArrayList<String>());
        }
        
        init(period.get(0), "English", "Chemistry", "Med Tech", "Economics");
        init(period.get(0), "Band", "French", "Orchestra", "Debate");
        init(period.get(0), "Algebra", "Social Studies", "Engineering", "Statistics");
        init(period.get(0), "Band", "Gym", "Orchestra", "Med Tech");
        init(period.get(0), "Algebra", "French", "Theater", "Statistics");
        init(period.get(0), "Health", "Social Studies", "Debate", "Horticulture");
        init(period.get(0), "English", "Chemistry", "Engineering", "Economics");
        init(period.get(0), "Health", "Art", "Coding", "Horticulture");
        init(period.get(0), "Art", "Gym", "Coding", "Theater");
        
        String name = person.get(0);
        ArrayList<String> classes = new ArrayList<>();
        for (int i = 1; i < person.size(); i++) {
            classes.add(person.get(i));
        }
        
        for (int i = 0; i < period.size(); i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(period.get(i).get(j));
            }
        }
    }
    
    private static void init(ArrayList<String> list, String c1, String c2, String c3, String c4) {
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
    }
    
}

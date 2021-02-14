/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Kellan Elhai
 */
public class Scheduler {
    
    public static ArrayList<String> schedulePerson(ArrayList<String> person) {
        ArrayList<ArrayList<String>> period = new ArrayList<>();
        ArrayList<String> finPerson = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < 9; i++) {
            period.add(new ArrayList<String>());
        }
        
        init(period.get(0), "English", "Chemistry", "Med Tech", "Economics");
        init(period.get(1), "Band", "French", "Orchestra", "Debate");
        init(period.get(2), "Algebra", "Social Studies", "Engineering", "Statistics");
        init(period.get(3), "Band", "Gym", "Orchestra", "MedTech");
        init(period.get(4), "Algebra", "French", "Theater", "Statistics");
        init(period.get(5), "Health", "Social Studies", "Debate", "Horticulture");
        init(period.get(6), "English", "Chemistry", "Engineering", "Economics");
        init(period.get(7), "Health", "Art", "Coding", "Horticulture");
        init(period.get(8), "Art", "Gym", "Coding", "Theater");
        
        String name = person.get(0);
        person.remove(0);
        try {
            while (++counter < 100) {
                for (int i = 0; i < period.size(); i++) {
                    for (int j = 0; j < person.size(); j++) {
                        if (period.get(i).contains(person.get(j))) {
                            finPerson.add(person.get(j));
                            person.remove(j);
                            break;
                        }
                    }
                }
                if (person.size() > 0) {
                    for (int i = 0; i < finPerson.size(); i++) {
                        person.add(finPerson.get(i));
                        Collections.shuffle(person);
                    }
                    finPerson.clear();
                } else {
                    break;
                }
                if (counter > 99)
                    throw new Exception("based.txt");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<String> retVal = new ArrayList<>();
        retVal.add(name);
        for (int i = 0; i < finPerson.size(); i++)
            retVal.add(finPerson.get(i));
        return retVal;
    }
    
    private static void init(ArrayList<String> list, String c1, String c2, String c3, String c4) {
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
    }
    
    public static String personToString(ArrayList<String> person) {
        String returnVal = "";
        
        returnVal += person.get(0) + ": ";
        for (int i = 1; i < person.size() - 1; i++) {
            returnVal += (person.get(i) + ", ");
        }
        
        return returnVal + person.get(person.size() - 1) + "\n";
    }
    
}

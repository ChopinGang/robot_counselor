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
public class Person {
    String name;
    ArrayList<String> wanted = new ArrayList<>();
    ArrayList<String> schedule = new ArrayList<>();
    
    public Person(ArrayList<String> info) {
        this.name = info.get(0);
        for (int i = 1; i < wanted.size(); i++)
            wanted.add(info.get(i));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implementacionarbolesjava;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author Besgo
 */
public class TreeString {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Ana");
        set.add("Karen");
        set.add("Andres");
        set.add("Besgo");
        set.add("Camila");
        System.out.println(set);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_c_a1_q1;

/**
 *
 * @author M Umair Malik
 */
public abstract class Character {
    int Health;
    Character()
    {
        Health=100;
    }
    void jump()
    {
        System.out.println("Your Character is Jumping");
               
    }
    void defend()
    {
        System.out.println("Your Character is Defending");
               
    }
    void speak()
    {
        System.out.println("Your Character is Speaking");
               
    }
    
    
}

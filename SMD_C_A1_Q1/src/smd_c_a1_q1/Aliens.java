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
public class Aliens extends Character implements InterfaceAlien {
    InterfaceHuman opponent;
     void jump()
    {
        System.out.println("Your Alien is Jumping");
               
    }
    void defend()
    {
        System.out.println("Your Alien is Defending");
               
    }
    void speak()
    {
        System.out.println("Your Alien is Speaking");
               
    }
    
    
    void attack(InterfaceHuman h)
    {
        if(h instanceof Aliens)
        {
         System.out.println("Alien Cannot attack on Aliens");
        } 
        else 
        {
            System.out.println("Alien is attacking on Human");
            h.victim(this);
        }
    }
    void attack(Aliens h)
    {
       System.out.println("Alien Cannot attack on Alien");
    }
    
 
    public void victim(InterfaceHuman h)
    {      
        if(h instanceof Aliens)
        {
         System.out.println("Alien Cannot attack on Alien");
        }
        else if(h instanceof Wizards)
        {  
            if(Health<0)
            {
                System.out.println("Alien is dead");
            }
            else
            {    
                Health=Health-15;
                if(Health<0)
                {
                   System.out.println("Alien is dead");
                }
         
            }
        }
        else if(h instanceof Wizards)
        {
            Health=Health-20;
        }
    }
    
}

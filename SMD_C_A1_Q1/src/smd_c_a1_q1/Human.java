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
public class Human extends Character implements InterfaceHuman {
    String name;
    Human(String s)
    {
        name=new String(s);    
    }    
    void jump()
    {
        System.out.println("Your Human is Jumping");
               
    }
    void defend()
    {
        System.out.println("Your Human is Defending");
               
    }
    @Override
    void speak()
    {
        System.out.println("Your Human is Speaking");
               
    }
   
    public void victim(InterfaceAlien a)
    {
        if(a instanceof Human)
        {
         System.out.println("Human Cannot attack on Human");
        }
        else
        {
            if(Health<0)
            {
                System.out.println("Human is dead");
            }
            else
            {
                Health=Health-5;
                if(Health<0)
                {
                    System.out.println("Human is dead");
                }
            
            }
        }
        
    }
    void attack(InterfaceAlien a)
    {
        if(a instanceof Human)
        {
             System.out.println("Human Cannot attack on Human");
        } 
        else 
        {
            a.victim(this);
        }
       
    }
    void attack(Human h)
    {
       System.out.println("Human Cannot attack on Human");
    }
}

class Wizards extends Human
{
    public Wizards(String s) 
    {
        super(s);
    }
    void heal()
    {
        System.out.println("Wizards is Healing");
        if(Health<91)
        {
            Health=Health+10;
        }
    }  
    void attack(InterfaceAlien a)
    {
        if(a instanceof Human)
         {
               System.out.println("Human Cannot attack on Human");
         } 
         else 
         {
               System.out.println("Wizard is attacking through fireball");
               a.victim(this);
         }
       
    }
    
}  
    class Warriors extends Human
    {

        public Warriors(String s) {
            super(s);
        }
        void Capture()
        {
            System.out.println("Warroior Captiure function");
        }
         void attack(InterfaceAlien a)
        {
         if(a instanceof Human)
         {
               System.out.println("Human Cannot attack on Human");
         } 
         else 
         {
               System.out.println("Warrior is attacking through swords");
               a.victim(this);
         }
       
        }
    
        
        
    }
    
    
    
    
    





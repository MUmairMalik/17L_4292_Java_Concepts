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
public class SMD_C_A1_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Aliens a=new Aliens();
        Wizards h=new Wizards("Ali");
        Warriors w=new Warriors("Asad");
        a.attack(h);
        a.attack(a);
        h.attack(a);
        h.attack(w);
        System.out.println(a.Health);
        h.attack(a);
        System.out.println(h.Health);
        h.heal();
        System.out.println(h.Health);
    */
      Game g=new Game();
      g.play();
      g.play();
      g.play();
      g.play();
      g.play();
      g.play();
      //attack(type of attacker , index in list , type of victim , index of victim);
      //type 0 is for Aliens
      //type 1 is for Wizards
      //type 2 is for Warriors
      g.attack(0, 0, 0, 0);
      g.attack(0, 0, 1, 0);
      g.attack(1, 0, 0, 0);
      g.attack(1, 0, 2, 0);
      
      
      
    
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_c_a1_q1;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author M Umair Malik
 */
public class Game 
{
    List<Wizards> wiz;
    List<Warriors> war;
    List<Aliens> a;
    
    Game()
    {
      wiz=new ArrayList<Wizards>(); 
      war=new ArrayList<Warriors>(); 
      a=new ArrayList<Aliens>();
    }
    void play()
    {
       if((a.size())+(wiz.size())+(war.size())<5)
       {
        System.out.println("Enter what you want to select , 0 for Alien , 1 for Wizard , 2 for Warrior");
        Scanner s=new Scanner(System.in);
        int select=s.nextInt();
        if(select ==0)
        {
            a.add(new Aliens());
        }
        else if(select ==1)
        {
            wiz.add(new Wizards("Wizard"));
        }
        else if(select ==2)
        {
            war.add(new Warriors("Warrior"));
        }
        else
        {
            System.out.println("\nEnter some valid instruction");
        }
       }
       else
       {
             System.out.println("\nOnly 5 Players can play at a same time");
       }
    }
    void attack(int type ,int index , int typeAtck , int indexA)
    {   
        boolean done=false;
        if(type==0)
        {
          if(index<a.size())
          {
              if(typeAtck==0)
              {
                  if(indexA<a.size())
                  {
                      a.get(index).attack(a.get(indexA));
                      if(a.get(indexA).Health<0)
                      {
                          a.remove(a.get(indexA));
                      }
                      done=true;
                  }
              } 
              if(typeAtck==1)
              {
                  if(indexA<wiz.size())
                  {
                      a.get(index).attack(wiz.get(indexA));
                      done=true;
                  }
              }
              if(typeAtck==2)
              {
                  if(indexA<war.size())
                  {
                      a.get(index).attack(war.get(indexA));
                      done=true;
                  }
              }
          }
        }
        else if(type==1)
        {
         if(index<wiz.size())
         {
              if(typeAtck==0)
              {
                  if(indexA<a.size())
                  {
                      wiz.get(index).attack(a.get(indexA));
                      done=true;
                  }
              } 
              if(typeAtck==1)
              {
                  if(indexA<wiz.size())
                  {
                      wiz.get(index).attack(wiz.get(indexA));
                      done=true;
                  }
              }
              if(typeAtck==2)
              {
                  if(indexA<war.size())
                  {
                      wiz.get(index).attack(war.get(indexA));
                      done=true;
                  }
              }
         }
        }
        else if(type==2)
        {
            
         if(index<war.size())
          {
              if(typeAtck==0)
              {
                  if(indexA<a.size())
                  {
                      war.get(index).attack(a.get(indexA));
                      done=true;
                  }
              } 
              if(typeAtck==1)
              {
                  if(indexA<wiz.size())
                  {
                      war.get(index).attack(wiz.get(indexA));
                      done=true;
                  }
              }
              if(typeAtck==2)
              {
                  if(indexA<war.size())
                  {
                      war.get(index).attack(war.get(indexA));
                      done=true;
                  }
              }
          }
        
        }
        if(done==false)
        {
            System.out.println("Attacking is failed");
        }
    
          
    }
}
    
    


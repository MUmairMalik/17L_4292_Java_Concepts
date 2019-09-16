/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_c_a1;

import java.util.Calendar;
import java.util.Scanner;
import smd_c_a1_q2.*;

/**
 *
 * @author M Umair Malik
 */
public 
class Regular extends Clients
{
    boolean swim;
    Swimming sw;
    boolean yoga;
    Yoga yg;
    boolean tennis;
    Tennis tn;
  
   public Regular(String n, int c,int ag,int y,int m , int d)
    {    super(n,c,ag,y,m,d);     
        System.out.println(name+", Would you want swimming facilities? 1 for yes ,0 for no : ");
        Scanner s=new Scanner(System.in);
        int opt=s.nextInt();
        if(opt==1)
        {
            sw=new Swimming();
            swim=true;
        }
        System.out.println(name+", Would you want yoga facilities? 1 for yes ,0 for no : ");
        opt=s.nextInt();
        if(opt==1)
        {
            yoga=true;
            yg=new Yoga();
        }
        System.out.println(name+", Would you want tennis facilities? 1 for yes ,0 for no : ");
        opt=s.nextInt();
        if(opt==1)
        {
            tennis=true;
            tn=new Tennis();
        }
            
    }
    public void calculateFee()
    {
        fees=90;//for gym
        if(swim)
        {
            fees=fees+60;
        }
        if(yoga)
        {
            fees=fees+50;
        }
        if(tennis)
        {
            fees=fees+50;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(regDate);
        cal.add(Calendar.DATE,30); //minus number would decrement the days
        
        System.out.println(name+"'s fees is "+fees+ " dollars and valid upto "+cal.getTime());
        
    }
}


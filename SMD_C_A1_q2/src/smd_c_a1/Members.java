/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_c_a1;

import java.util.Calendar;

/**
 *
 * @author M Umair Malik
 */
public class Members extends Clients
{
    
    public Members(String n, int c,int ag,int y,int m , int d)
    {    super(n,c,ag,y,m,d);     
    }
    public void calculateFee()
    {
        fees=300;
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(regDate);
        cal.add(Calendar.DATE,365); //minus number would decrement the days
        System.out.print(name+ "'s fees is "+fees+ " dollars and valid upto "+cal.getTime());
        System.out.println(" , Monthly fees is decided by Admin");
        
    }

}
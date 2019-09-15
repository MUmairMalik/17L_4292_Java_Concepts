/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_c_a1_q2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import smd_c_a1.*;

/**
 *
 * @author M Umair Malik
 */
public class Systems {
    List<Clients> l;
    int members;
    Systems()
    {
        l=new ArrayList<Clients>();
        members=0;
    }
    void add(int opt,String n,int Credit,int age)
    {
        /*System.out.println("Would you want to register as a regular or member? 1 for regular ,2 for member : ");
        Scanner s=new Scanner(java.lang.System.in);
        int opt=s.nextInt();
        */
        if(opt==1)
        {
            Date date=java.util.Calendar.getInstance().getTime();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            l.add(new Regular(n,Credit,age,year,month,day));
            members++;
        }
        else if(opt==2)
        {
            Date date=java.util.Calendar.getInstance().getTime();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            l.add(new Members(n,Credit,age,year,month,day));
            members++;
        }
     
    }
    void feesPrint()
    {
        for(int i=0;i<members;i++)
        {
            l.get(i).calculateFee(); 
                   
        }
    }
    void checkAndRemove()
    {
        for(int i=0;i<members;i++)
        {
            Date currDate=java.util.Calendar.getInstance().getTime();
            Calendar cal = Calendar.getInstance();
            cal.setTime(l.get(i).getDate());
            cal.add(Calendar.DATE,60); //60 means 30 days after deadline
            if(currDate.after(cal.getTime()))
            {
                System.out.println(l.get(i).getName()+" is dismissed from Fitness center");
                l.remove(l.get(i));
                members--;
            }
        }    
    }
}

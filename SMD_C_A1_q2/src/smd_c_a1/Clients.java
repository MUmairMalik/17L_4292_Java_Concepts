/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_c_a1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author M Umair Malik
 */
public abstract class Clients {
   String name;
   int creditNo;
   int age;
   Date regDate;
   int fees;
   Clients(String n, int c,int ag,int y,int m , int d)
   {
       name=new String(n);
       creditNo=c;
       age=ag;
       regDate=new Date(y,m,d);
   }
   abstract public void calculateFee();
   public Date getDate()
   {
       return regDate;
   }
   public String getName()
   {
       return name;
   }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd_c_a1_q2;
import smd_c_a1.*;


/**
 *
 * @author M Umair Malik
 */
public class FitnessCenter {
    int openingTime;
    int closingTime;
    boolean gearReq;
       
}
class Gym extends FitnessCenter
{
    Gym()
    {
        openingTime=10;
        closingTime=22;
        gearReq=false;
    }
    
} 
class Swimming extends FitnessCenter
{
    Swimming()
    {
        openingTime=10;
        closingTime=17;
        gearReq=true;
    }
    
} 
class Yoga extends FitnessCenter
{
    Yoga()
    {
        openingTime=10;
        closingTime=17;
        gearReq=false;
    }
    
} 
class Tennis extends FitnessCenter
{
    Tennis()
    {
        openingTime=10;
        closingTime=22;//tennis closing time is not available
        gearReq=true;
    }
    
} 

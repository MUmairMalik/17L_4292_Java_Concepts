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
public class SMD_C_A1_q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Systems s=new Systems();
        s.add(2, "Umair", 3689370, 20);
        s.add(1, "Malik", 3589370, 30);
        s.add(2, "Hamza", 4389370, 35);
        s.add(1, "Ali", 8769370, 26);
        s.feesPrint();
        s.checkAndRemove();
    }
    
}

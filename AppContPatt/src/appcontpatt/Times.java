/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontpatt;

/**
 *
 * @author benjaminlangston
 */
public class Times implements calcInt {
    
     @Override
    public void execute(Integer input1, Integer input2) {
                Integer mult = input1 * input2;
                System.out.println(mult);
    
}
}
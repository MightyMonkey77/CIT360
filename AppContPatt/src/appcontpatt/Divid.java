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
public class Divid implements calcInt {
    
     @Override
    public void execute(Double input1, Double input2) {
                Double div = input1 / input2;
                System.out.println(div);
    
}
}
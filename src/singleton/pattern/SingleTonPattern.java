/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.pattern;

/**
 *
 * @author MIHAN
 */
public class SingleTonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingleTon obj = SingleTon.getInstance();
        int show = obj.addition(10, 20);
        System.out.println(show);
        
    }
    
    
}

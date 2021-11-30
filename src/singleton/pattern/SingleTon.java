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

public class SingleTon {
    
    private static SingleTon createInstance;
    public static SingleTon getInstance()
    {
        if(createInstance == null)
        {
            createInstance = new SingleTon();
        }
        return createInstance;
    }
    private SingleTon(){}
    
    public int addition(int a, int b)
    {
        return a+b;
    }
    
}

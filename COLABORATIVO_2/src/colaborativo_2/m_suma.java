/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaborativo_2;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class m_suma {
    public int a;
    public int b;

    public m_suma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void sumar(){
        
        int s;
        
        s=a+b;
        
        JOptionPane.showMessageDialog(null, s);
               
        
        
    }
    
    
}

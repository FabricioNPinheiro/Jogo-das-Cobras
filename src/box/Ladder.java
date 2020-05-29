/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author lucas
 */
public class Ladder extends SpecialBox{ 
    private int numTop;
    
    public Ladder(int num, int eixoX, int eixoY, int numTop) {
        super(num, eixoX, eixoY);
        this.numTop = numTop;
    }
    
    public int getNumTop() {
        return numTop;
    }
}

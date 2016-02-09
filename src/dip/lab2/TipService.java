/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Tim
 */
public class TipService {
    TipCalculator calc;
    public TipService(TipCalculator q){
        calc = q;
    }
    public double calculateTip(){
        double tip = calc.getTip();
        return tip;
    }
    public void setServiceRating(ServiceQuality q){
        calc.setServiceRating(q);
    }
}

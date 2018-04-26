/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prvniuloha;

/**
 *
 * @author lukas.soucek
 */
public class FractionCalculator {
 
    private Fraction f1;
    private Fraction f2;

    char operator;

    public FractionCalculator(Fraction f1, Fraction f2, char operator) {
        this.f1 = f1;
        this.f2 = f2;
        this.operator = operator;
    }

    FractionCalculator(String expression) {
        String[] parts = expression.split(" ");
        f1 = new Fraction(parts[0]); // ukladam si referenci na objekt, jeho adresu
        f2 = new Fraction(parts[2]);
        operator = parts[1].charAt(0); // zlomkova cara se ulozi do nasi charove promenne
    }

      Fraction add() {
        int aNum = (f1.getNum() * f2.getDenom() + f1.getDenom() * f2.getNum());
        int aDenom = f1.getDenom() * f2.getDenom();
        return new Fraction(aNum, aDenom).reduce();

    }

    Fraction substract() {
       
        int aNum = (f1.getNum() * f2.getDenom() - f1.getDenom() * f2.getNum());
        int aDenom = f1.getDenom() * f2.getDenom();
        return new Fraction(aNum, aDenom).reduce();
    }

    Fraction multiply() {
        int aNum = f1.getNum() * f2.getNum();
        int aDenom = f1.getDenom() * f2.getDenom();
        return new Fraction(aNum, aDenom).reduce();
    }

    Fraction divide() {
        int aNum = f1.getNum() * f2.getDenom();
        int aDenom = f1.getDenom() * f2.getNum();
        return new Fraction(aNum, aDenom).reduce();
      
    }
      Fraction power() {
        int aNum = (int) Math.pow(f1.getNum(), f2.getNum()/f2.getDenom());
        int aDenom = (int) Math.pow(f1.getDenom(), f2.getNum()/f2.getDenom());
        return new Fraction(aNum, aDenom).reduce();
      
    }

    public String getResult() {
        Fraction result = calculate();
        return result.toString();
    }

    private Fraction calculate() {
        switch (operator) {
            case '+':
                return add();

            case '-':
                return substract();

            case '*':
                return multiply();

            case '.':
                return multiply();

            case ':':
                return divide();

            case '/':
                return divide();
            case '^':
                return power();
                
                

            default:
                return null;

        }
    }
}

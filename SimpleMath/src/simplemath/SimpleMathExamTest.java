/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplemath;
import java.util.Random;
import java.util.Scanner;
/**
 *Třída pro generování příkladů z elementární matematiky zahrnující sčítání a
 * odčítání v oboru celých kladných čísel. Konfiguraci konkrétní instance je 
 * nutné provést při jejím vytváření. Konfigurovat lze maximální hodnoty členů
 * výrazu (souhrnně) a konkrétní operace (pouze sčítání, pouze odčítání, mix 
 * obou operací) Instance umožňuje vygenerování dalšího aritmetického příkladu 
 * dané sady, zadání/kontrolu výsledku, poskytnutí aktuálního skóre, zahájení 
 * generování nové sady testovacích úloh. Podrobnější způsob jednotlivých funkcí
 * třídy je součástí dokumentace příslušných metod. Tato verze generuje příklady
 * zcela náhodně, nazamezuje případnému opakovanému výskytu téhož příkladu v
 * jedné testovací sadě. Tato verze neumožňuje uchování historie vygenerovaných
 * testovacích úloh a její případné zobrazení.
 * @author lukas.soucek
 */
public class SimpleMathExamTest {
    private static Random rd = new Random();

    private String generateStringQuestion(int[] exer, Operator op) {
       for(int i=0;i<exer.length;i++)
       {
           exer[i] = rd.nextInt();
       }
       return "This";
    }

   
    private static enum Operator {PLUS, MINUS};
    
    private int maxValue;
    private Operator[] allowedOperators;      // pole vyctoveho typu Operator
    private int goodAnswers;
    private int all;
    private long startTime;
    
    
    public SimpleMathExamTest(int maxValue, String allowedOperators)
    {
        this.maxValue = maxValue;
        storeAllowedOperators(allowedOperators);
        initTest();
       
    }
     private void storeAllowedOperators(String ao) {
        switch(ao){
            // pokud není break, tak pokračuje příkazy pod, dokud se neobjeví break
            case "+":
            case "PLUS": 
             this.allowedOperators = new Operator[] {Operator.PLUS};
                break;
            case "-": 
            case"MINUS": this.allowedOperators = new Operator[] {Operator.MINUS};
            break;
            case "MIX":
                this.allowedOperators = new Operator [] {Operator.PLUS, Operator.MINUS};
                break;
            default: 
                throw new IllegalArgumentException("Nepodporovaný operátor"); // probublá až do konstruktoru
        }
    }
    
    private void initTest()
    {
        all = 0;
        goodAnswers = 0;
        startTime = 0;
        
    }
    
    private int [] generateExercise(){
        int [] exercise = new int[3];
        exercise[0] = rd.nextInt(maxValue+1);
        exercise[1] = rd.nextInt(maxValue+1-exercise[0]);
        exercise[2] = exercise[0] + exercise[1];
        return exercise;
        
        
    }
    
    public int [] getScore() {
        // get(score) -> score = new int[2] -> copy = System.arraycopy(score) return copy;
        int [] score = new int [2];
        score[0] = goodAnswers;
        score[1] = all;
        return score;
    }
    
    public String getQuestion()
    {
        if (all ==0)
        {
            startTime = System.currentTimeMillis();
        }
        int [] exer =  generateExercise();
        Operator op = allowedOperators[rd.nextInt(allowedOperators.length)] ;
        String question = generateStringQuestion(exer,op);
        all++;
        return question;
    }
    
     private boolean checkAnswer()
    {
        
        if(all <=0)
        {
            return false;
        }
        else
        {
        return true;
            }
        
    }

    /**
     *
     * @return
     */
    public Integer getAnswerInt(int answer) {
        String s = getQuestion();
         if (s!= null)
        {
           return 0;
        }
         else
         {
             return answer;
         }
    }
     public long getTestDurationSec()
     {
        return (System.currentTimeMillis() - startTime) / 1000;
     }
}

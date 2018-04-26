/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DruhaUloha;

/**
 *
 * @author lukas.soucek
 */
// nelze menit názvy metod -> průser
public class GuessingNumber {

           private int min;
           private int max;
           private int count = 0;
           private boolean found = false;
           private int computernumber;
           
   // pokud není konstruktor, tak je automaticky vytvořen prázdný, či ho musíme vytvořit    

    /**
     * Initialize newly created GuessingNumbrt object.
     * 
     * @param min lower range limit
     * @param max upper range limit
     */
        public GuessingNumber(int min, int max) {
       // potřeba uložit objekty v konstruktoru do nějakých proměnných
        this.max = max;
       this.min = min;
       computernumber = generateNumber();
       
    }
     public GuessingNumber()
     {
         // využití konstruktoru zavoláním klíčového slova this
         this(0,100);
     }
    int getMin() {
        return min;
        
    }

    int getMax() {
        return max;
    }

    boolean isEndGame() {
        return found;
        
    }
    
    /**vyhodnocuje hádané číslo oproti číslu vygenerovanému

     *
     * @param guess user guess
     * @return 0 if user equals generated number, 1 if generated number is 
     * greater than user´s guess, -1 otherwise
     */
        public int evaluate(int guess) {
        count++;
        if (guess == computernumber ){
            found = true;
            return 0;
            
        }
        else if (guess > computernumber)
        {
            return -1;
        }
        return 1;
    }

    int getCount() {
        return count;
    }
    private int generateNumber()
    {
        return (int) ((max+1-min)*Math.random()+min);
    }
    
           
        
    
         
    
        
    
}

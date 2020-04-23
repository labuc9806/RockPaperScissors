/*
 * Launa Bucher-Austin
 * This program allows the user to play rock paper scissors with the computer, and displays the number of games won by the user. 
 * April 22 2020
 */
package rockpaperscissors1;

import java.util.Scanner;

/**
 *
 * @author launa
 */
public class Rockpaperscissors1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner keyedInput = new Scanner (System.in);

        int  response; 
        
        //round 1
        System.out.println("Please choose one : ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        response = keyedInput.nextInt();

         //array 
         int [ ] win = new int [10];
         
         if (response == 3)
         {
             //random number generator
            double randomDouble = Math.random();
            randomDouble = randomDouble * 3 + 1;
            int randomInt = (int) randomDouble;
         
             if (randomInt == 1)
             {
                 System.out.println("Scissors!");
                 System.out.println("Draw");
                 win [1] = 0;
             }
             if (randomInt == 2)
             {
                 System.out.println("Rock!");
                 System.out.println("You lose!");
                 win [1] = 0;
             }
             if (randomInt ==3)
             {
                 System.out.println("Paper!");
                 System.out.println("You win!");
                 win [1] = 1;
             }
             
         }
           if (response ==2 )
             {
             //random number generator
            double random = Math.random();
            random = random * 3 + 1;
            int randomInteger = (int) random;
            
            if (randomInteger == 1)
            {
                System.out.println("Scissors!");
                System.out.println("You lose!");
                win [2] = 0;
            }
            
            if (randomInteger == 2)
            {
                System.out.println("Rock!");
                System.out.println("You win!");
                win [2] = 1;
            }
            
            if (randomInteger == 3)
            {
                System.out.println("Paper");
                System.out.println("Draw");
                win [2] = 0;
           
             }
                 
         }
           
           if (response == 1)
           {
            //random number generator
            double randomD = Math.random();
            randomD = randomD * 3 + 1;
            int randomIntgr = (int) randomD;
            
            if (randomIntgr == 1)
            {
                System.out.println("Scissors!");
                System.out.println("You win!");
                win [3] = 1;
            }
            
            if (randomIntgr == 2)
            {
                System.out.println("Paper!");
                System.out.println("You lose!");
                win [3] = 0;
            }
            
            if (randomIntgr == 3)
            {
                System.out.println("Rock!");
                System.out.println("Draw");
                win [3] = 0; 
            }
         }
           
        //round 2    
        System.out.println("Please choose again  : ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int response1 = keyedInput.nextInt();
        
        if (response1 == 3)
         {
             //random number generator
            double randomDouble = Math.random();
            randomDouble = randomDouble * 3 + 1;
            int randomInt = (int) randomDouble;
         
             if (randomInt == 1)
             {
                 System.out.println("Scissors!");
                 System.out.println("Draw");
                 win [4] = 0;
             }
             if (randomInt == 2)
             {
                 System.out.println("Rock!");
                 System.out.println("You lose!");
                 win [4] = 0;
             }
             if (randomInt ==3)
             {
                 System.out.println("Paper!");
                 System.out.println("You win!");
                 win [4] = 1;
             }
             
         }
           if (response1 == 2 )
             {
             //random number generator
            double random = Math.random();
            random = random * 3 + 1;
            int randomInteger = (int) random;
            
            if (randomInteger == 1)
            {
                System.out.println("Scissors!");
                System.out.println("You lose!");
                win [5] = 0;

            }
            
            if (randomInteger == 2)
            {
                System.out.println("Rock!");
                System.out.println("You win!");
                
                win [5] = 1;
            }
            
            if (randomInteger == 3)
            {
                System.out.println("Paper");
                System.out.println("Draw");
                win [5] = 0;
               
           
             }
                 
         }
           
           if (response1 == 1)
           {
            //random number generator
            double randomD = Math.random();
            randomD = randomD * 3 + 1;
            int randomIntgr = (int) randomD;
            
            if (randomIntgr == 1)
            {
                System.out.println("Scissors!");
                System.out.println("You win!");
                
                win [6] = 1;
            }
            
            if (randomIntgr == 2)
            {
                System.out.println("Paper!");
                System.out.println("You lose!");
                win [6] = 0;
            }
            
            if (randomIntgr == 3)
            {
                System.out.println("Rock!");
                System.out.println("Draw");
                win [6] = 0;
            }
         }
        
        // round 3
        System.out.println("Final Round ! Please choose again  : ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int response2 = keyedInput.nextInt();

           if (response2 == 3)
         {
             //random number generator
            double randomDouble = Math.random();
            randomDouble = randomDouble * 3 + 1;
            int randomInt = (int) randomDouble;
         
             if (randomInt == 1)
             {
                 System.out.println("Scissors!");
                 System.out.println("Draw");
                 win [7] = 0;
             }
             if (randomInt == 2)
             {
                 System.out.println("Rock!");
                 System.out.println("You lose!");
                 win [7] = 0;
             }
             if (randomInt ==3)
             {
                 System.out.println("Paper!");
                 System.out.println("You win!");
                 
                 win [7] = 1;
             }
             
         }
           if (response2 == 2 )
             {
             //random number generator
            double random = Math.random();
            random = random * 3 + 1;
            int randomInteger = (int) random;
            
            if (randomInteger == 1)
            {
                System.out.println("Scissors!");
                System.out.println("You lose!");
                win [8] = 0;

            }
            
            if (randomInteger == 2)
            {
                System.out.println("Rock!");
                System.out.println("You win!");
                
                win [8] = 1;
            }
            
            if (randomInteger == 3)
            {
                System.out.println("Paper");
                System.out.println("Draw");
                win [8] = 0;
             }
                 
         }
           
           if (response2 == 1)
           {
            //random number generator
            double randomD = Math.random();
            randomD = randomD * 3 + 1;
            int randomIntgr = (int) randomD;
            
            if (randomIntgr == 1)
            {
                System.out.println("Scissors!");
                System.out.println("You win!");
                win [9] = 1;
            }
            
            if (randomIntgr == 2)
            {
                System.out.println("Paper!");
                System.out.println("You lose!");
                win [9] = 0;
            }
            
            if (randomIntgr == 3)
            {
                System.out.println("Rock!");
                System.out.println("Draw");
                win [9] = 0;
            }
         }
           int wins = win [1] + win [2] + win [3] + win [4]+ win [5] + win [6] + win [7] + win [8] + win [9];
           System.out.println("You won " + wins + " games");
    }
    
}

    

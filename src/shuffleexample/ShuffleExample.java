/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shuffleexample;
import java.util.*;
/**
 *
 * @author nokid4249
 */
public class ShuffleExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int[] pleaseShuffle = {1,2,3,4,5,6,7,8,9,10};
       displayArray(pleaseShuffle);
       System.out.println();
       long start = System.nanoTime();
       pleaseShuffle = shuffler(pleaseShuffle);
       long elapsedTimeNano = System.nanoTime()-start;
       displayArray(pleaseShuffle);
       System.out.println("\nTime Taken (nanoseconds): " + elapsedTimeNano);
    }
    static int[] shuffler(int[] imArray ){
        Random rand = new Random();
        for (int i = imArray.length - 1; i > 0; i--){
            int index = rand.nextInt(i+1);
            int mix = imArray[index];
            imArray[index] = imArray[i];
            imArray[i] = mix;
        }
        return imArray;
    }
    static void displayArray(int[] displrray){
        for (int i = 0; i < displrray.length; i++){
           System.out.print(displrray[i] + " ");
        }
    }
}

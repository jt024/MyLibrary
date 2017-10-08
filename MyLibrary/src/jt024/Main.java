/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jt024;

import java.util.Random;

import static jt024.Toolkit.Randoms.*;






/**
 *
 * @author Trevi
 */
public class Main {
    public static int size;
    public static int range;
    public static int[] numbers;
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       
        String newGirl;
        String newBoy;        
        
        
        for (int i = 0; i < 10; i++) {
            newGirl = RandomName.getFFull();
            newBoy = RandomName.getMFull();
            System.out.println(newGirl);
            System.out.println(newBoy);
        }

        
        
        
        // <editor-fold defaultstate="collapsed" desc="**LinkedList Testing**">          
//        Queue numQueue = new Queue();
//        Queue StringQueue = new Queue();
//        String testInteger = "1";
//        Random rn = new Random();
//        
//        for (int i = 0; i < 50; i++) {
//            numQueue.addLink(rn.nextInt(100));
//        }
        

        // </editor-fold>        
        
        
        // <editor-fold defaultstate="collapsed" desc="**Array Testing**">         
//        size = 100;
//        range = 1000000;
//        makeArray(size,range);
////      printArray(numbers);
//        Toolkit.integerArray = numbers;        
//        Toolkit.Sort.quick(0,numbers.length-1);
//        printArray(numbers);        

        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="**Validation Testing**">        
        if (Toolkit.Validate.validInteger("user in",1, 9)) 
            System.out.println("It's good");
         else
            System.out.println("It's no good");
        // </editor-fold>        


    
        


        
        
    }
    // <editor-fold defaultstate="collapsed" desc="**Testing Methods**">  
    private static void makeArray(int size, int range){
        // create integerArray integer array
        numbers = new int[size];
        
        // create random object to generate number values
        Random rnd = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(range);
        }
        Toolkit.integerArray = numbers;
    }
    private static void printArray(int[] arr){
        StringBuilder arrayString = new StringBuilder();
        int count = 0;
        int i;
        arrayString.append("The array has a total of ");
        arrayString.append(arr.length);
        arrayString.append(" elements\n");
        for (i = 0; i < arr.length; i++) {
            if (i+1<arr.length) {
                if (arr[i]>arr[i+1]) {
                    count++;              
                }
            }
        }
        if (count>(arr.length/4)) {
            arrayString.append("This array is not sorted!\n");
        } else if (count>0 && count < (arr.length/4)){
            arrayString.append("This array is mostly sorted!\n");
        } else
            arrayString.append("This array is completely sorted!\n");
        for (i = 0; i < arr.length; i++) {
            arrayString.append("Index:\t"); arrayString.append(i+1);
            arrayString.append("\tValue:\t"); arrayString.append(numbers[i]);
            arrayString.append("\n");
        }
        System.out.println(arrayString.toString());
    }
    private static void sortArray(String type){
        Toolkit.Sort.integerArray = numbers;
        switch (type.toUpperCase()) {
            case "QUICK":
                Toolkit.Sort.quick((0), size-1);
                Toolkit.Sort.quick(0, size-1);
                numbers = Toolkit.Sort.integerArray;
                break;
            case "INSERTION":
                Toolkit.Sort.insertion();
                numbers = Toolkit.Sort.integerArray;
                break;
            case "BUBBLE":
                Toolkit.Sort.bubble();
                numbers = Toolkit.Sort.integerArray;
                break;
            case "BUBBLEREC":
                Toolkit.Sort.bubbleRec(numbers,numbers.length);
                numbers = Toolkit.Sort.integerArray;
                break;                
//            case "FIB":
//                Toolkit.Sort.fibonacci();
//                numbers = Toolkit.Sort.integerArray;
//                break;
            default:
                break; 
        }
    }  
    private static void sortTest(int testNumber){
        switch(testNumber){
            case 1:
                makeArray(size,range);
                printArray(numbers);
                Toolkit.integerArray = numbers;        
                sortArray("QUICK");
                printArray(numbers);
                System.out.println("QUICK SORT TEST COMPLETE..\n\n");                
            case 2:
                makeArray(size,range);
                printArray(numbers);
                Toolkit.integerArray = numbers;        
                sortArray("INSERTION");
                printArray(numbers);
                System.out.println("INSERTION SORT TEST COMPLETE..\n\n");                   
            case 3:
                makeArray(size,range);
                printArray(numbers);
                Toolkit.integerArray = numbers;        
                sortArray("BUBBLE");
                printArray(numbers);
                System.out.println("BUBBLE SORT TEST COMPLETE..\n\n");                   
            case 4:
                makeArray(size,range);
                printArray(numbers);
                Toolkit.integerArray = numbers;        
                sortArray("BUBBLEREC");
                printArray(numbers);
                System.out.println("BUBBLEREC SORT TEST COMPLETE..\n\n");                   
            case 5:
                makeArray(size,range);
                printArray(numbers);
                Toolkit.integerArray = numbers;        
                sortArray("BUBBLE");
                printArray(numbers);
                System.out.println("Bubble SORT TEST COMPLETE..\n\n");                   
            case 6:
                makeArray(size,range);
                printArray(numbers);
                Toolkit.integerArray = numbers;        
                sortArray("BUBBLE");
                printArray(numbers);
                System.out.println("Bubble SORT TEST COMPLETE..\n\n");  
            default:
                makeArray(size,range);
                printArray(numbers);
                Toolkit.integerArray = numbers;        
                sortArray("BUBBLE");
                printArray(numbers);
                System.out.println("Bubble SORT TEST COMPLETE..\n\n");                  
                
                
        }
        
        
        
    }


    // </editor-fold>    
    
}

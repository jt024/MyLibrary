
/**
 * Toolkit.java ...
 * 
 * Created on 08 September 2017
 * Copyright(c) 2017 Johnny Trevino  All Rights Reserved.
 * This software is the proprietary information of Johnny Trevino.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 */
package jt024;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * {Toolkit}
 *
 * @version $Revision: 15 $
 * @since Build {1.4} (09 2017)
 * @author Johnny Trevino
 * @author $Author: nbweb $, (this version)
 */
public class Toolkit {

    // <editor-fold defaultstate="collapsed" desc="**Subclasses**">

    /**
* Contains methods used to validate objects passed by caller
*
* @since Build {version 1.1} (09 2017)
* @author Johnny Trevino
*/
    public static class Validate extends Toolkit{

        /**
        * Uses the Regex Pattern compile method to set a pattern
        * to a predefined regular expression designed for a US phone
        * number format. The check string format is compared to pattern.
        * @param check String with format to be validated
        * @return      If string has the correct format
        * @see validEmail(String check)
        */
        public static boolean validPhone(String check) {
                pattern = Pattern.compile(PHONE);
                matcher = pattern.matcher(check);
                return matcher.matches();            
        }

        /**
        * Uses the Regex Pattern compile method to set a pattern
        * to a predefined regular expression designed for a email
        * address format. The check string format is compared to pattern.
        * @param check String with format to be validated
        * @return      If string has the correct format
        * @see validPhone(String check) 
        */        
        public static boolean validEmail(String check) {
                pattern = Pattern.compile(EMAIL);
                matcher = pattern.matcher(check);
                return matcher.matches();            
        }          

        /**
        * Uses the Regex Pattern compile method to set a pattern
        * to a predefined regular expression designed for a email
        * address format. The check string format is compared to pattern.
        * @param check String with format to be validated
        * @return      If string has the correct format
        * @see validPhone(String check) 
        */  
        public static boolean validInteger(int min, int max){

            try{
                inputInteger = Integer.parseInt(inputString);
                if (inputInteger < min || inputInteger > max)
                {
                    return false;
                } else 
                    return true;
            } catch(NumberFormatException e){
                return false;
            }
        }

    } //  end Validate

    /**
* Contains methods used to sort integer arrays
*
* @since Build {version 1.14} (09 2017)
* @author Johnny Trevino
*/
    public static class Sort extends Toolkit{
        
    // <editor-fold defaultstate="collapsed" desc="**Sort Methods**"> 
       /**
        *  Add other methods here ...
        *
        *  @param value1
        *  @param value2
        *
        *  @return
        *
        *  @throw
        */
        public static void bubble() {
            for (int i = 0; i < integerArray.length; i++)
                for (int j = 0; j < integerArray.length-i-1; j++)
                    if (integerArray[j] > integerArray[j+1])
                    {
                        swap(j,j+1);
                     }
            }
       /**
        *  Add other methods here ...
        *
        *  @param value1
        *  @param value2
        *
        *  @return
        *
        *  @throw
        */
        public static void bubbleRec(int[] arr, int n) {
            if (n == 1)
                return;
            for (int i=0; i<n-1; i++)
                if (arr[i] > arr[i+1])
                {
                    swap(i,i+1);
                }
            bubbleRec(arr, n-1);
        }        
       /**
        *  Add other methods here ...
        *
        *  @param value1
        *  @param value2
        *
        *  @return
        *
        *  @throw
        */        
        public static void insertion() {
            for (int i=1; i<integerArray.length; ++i)
            {
                int key = integerArray[i];
                int j = i-1;
                /* Move elements of arr[0..i-1], that are
                   greater than key, to one position ahead
                   of their current position */
                while (j>=0 && integerArray[j] > key)
                {
                    integerArray[j+1] = integerArray[j];
                    j = j-1;
                }
                integerArray[j+1] = key;
            }
        }
       /**
        *  Add other methods here ...
        *
        *  @param value1
        *  @param value2
        *
        *  @return
        *
        *  @throw
        */        
        public static void shell() {
        
        }
       /**
        *  Add other methods here ...
        *
        *  @param value1
        *  @param value2
        *
        *  @return
        *
        *  @throw
        */
        public static void binaryInsertion() {
            for (int i = 1; i < integerArray.length; i++)
            {
                int x = integerArray[i];

                // Find location to insert using binary search
                int j = Math.abs(Arrays.binarySearch(integerArray, 0, i, x) + 1);

                //Shifting array to one location right
                System.arraycopy(integerArray, j, integerArray, j+1, i-j);

                //Placing element at its correct location
                integerArray[j] = x;
            }
        }        
       /**
        *  Add other methods here ...
        *
        *  @param value1
        *  @param value2
        *
        *  @return
        *
        *  @throw
        */        
        public static void selection(){
            for (int i = 0; i < integerArray.length-1; i++)
            {
                int minIndex = i;
                for (int j = i+1; j < integerArray.length; j++)
                    if (integerArray[j] < integerArray[minIndex])
                        minIndex = j;
                swap(minIndex,i);
            }
        }
       /**
        *  Add other methods here ...
        *
        *  @param value1
        *  @param value2
        *
        *  @return
        *
        *  @throw
        */        
        public static void quick(int left, int right){
            if (left < right) {
                int pi = partition(left, right);
                quick(left, pi-1);
                quick(pi+1, right);
            }
        };
       /**
        *  Add other methods here ...
        *
        *  @param value1
        *  @param value2
        *
        *  @return
        *
        *  @throw
        */        
        public static void merge() {
        
        };
       /**
        *  Add other methods here ...
        *
        *  @param value1
        *  @param value2
        *
        *  @return
        *
        *  @throw
        */        
        public static void heap() {

        };    

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="**Private Methods**">         

       /**
        *   Used by multiple sorting methods ...
        *   Used by sorting methods to swap two elements
        *   within the array
        *   @param indexOne
        *   @param indexTwo
        */
        private static void swap(int indexOne, int indexTwo){
            int value = integerArray[indexOne];
            integerArray[indexOne] = integerArray[indexTwo];
            integerArray[indexTwo] = value; 
            
        }

        /**
        * Describe method here
        * @param left   Describe parameter here
        * @param right  Describe parameter here
        * @return       Describe return here
        * @see selection()
        * @see swap(int, int)
        * @see bubble()
        * @see bubbleRec(int[], int)
        * @see 
        */
        private static int partition(int left, int right){
            int pivot = integerArray[right]; 
            int i = (left-1);
            for (int j=left; j<right; j++) {
                if (integerArray[j] <= pivot){
                    i++;
                    swap (i,j);
                }
            }
            swap(i+1,right);
            return i+1;
        }

    // </editor-fold> 
    } //  end Sort

    /**
* Contains methods used to search for values in integer arrays
*
* @since Build {version 1.23} (09 2017)
* @author Johnny Trevino
*/
    public static class Search extends Toolkit {

        // <editor-fold defaultstate="collapsed" desc="**Search methods**"> 

        /**
        * Searches integer array using a jump search algorithm
        * @param target Integer to be found
        * @return       The index of the element or
        *               -1 if the element is not found
        * @see linear(int)
        * @see fibonacci(int)
        * @see binary(int)
        * @see binaryRec(int[],int,int,int)
        */
        public static int jump(int target){
            int n = integerArray.length;
            int prev = 0;
            int step = (int)Math.floor(Math.sqrt(n));
            while (integerArray[Math.min(step, n)-1] < target)
            {
                prev = step;
                step += (int)Math.floor(Math.sqrt(n));
                if (prev >= n)
                    return -1;
            }
            while (integerArray[prev] < target)
            {
                prev++;
                // If we reached next block or end of
                // array, element is not present.
                if (prev == Math.min(step, n))
                    return -1;
            }            
            if (integerArray[prev] == target)
            return prev;
        return -1;
        }

        /**
        * Searches integer array using a linear search algorithm
        * @param target      Integer to be found
        * @return       The index of the element or
        *               -1 if the element is not found
        * @see jump(int)
        * @see fibonacci(int)
        * @see binary(int)
        * @see binaryRec(int[],int,int,int)
        */        
        public static int linear(int target) {
            for (int i = 0; i < integerArray.length; i++)
            {
                if (integerArray[i] == target)
                    return i;
            }
            return -1;
        }

        /**
        * Iteratively searches integer array using a binary search algorithm
        * @param target Integer to be found
        * @return       The index of the element or
        *               -1 if the element is not found
        * @see jump(int)
        * @see linear(int)
        * @see fibonacci(int)
        * @see binaryRec(int[],int,int,int)
        */
        public static int binary(int target) {
            int low = 0, high = integerArray.length - 1;
            while (low <= high)
            {
                int m = low + (high-low)/2;
                if (integerArray[m] == target)
                    return m;
                if (integerArray[m] < target)
                    low = m + 1;
                else
                    high = m - 1;
            }
            return -1;
        }

        /**
        * Searches integer array using a Fibonacci Sequence search algorithm
        * @param target      Integer to be found
        * @return       The index of the element or
        *               -1 if the element is not found
        * @see      jump(int)
        * @see      linear(int)
        * @see      binary(int)
        * @see      binaryRec(int[],int,int,int)
        * @see      fibonacci(int)
        * @see      fibSequenceIterative(int)
        */
        public static int fibonacci(int target){
            int n = integerArray.length;
            int m = findFm(n);                  //m = Fm iff n is Fibonacci number else returns Fm+1
            int p = fibSequenceIterative(m-1);  //p = Fm-1, always a fibonacci number
            int q = fibSequenceIterative(m -2); //q = Fm-2, always a fibonacci number

            while(true){
                if(target == integerArray[m])
                    return m;
                else if (target < integerArray[m]){
                    if(q == 0)
                        return -(m - 1);// we crossed 0th index in array, number not found.
                    m = m - q;
                    int tmp = p;
                    p = q;
                    q = tmp - q;
                }else if(target > integerArray[m]){
                    if(p == 1)
                        return -m;
                    m = m + q;
                    p = p - q;
                    q = q - p;
                }
            }
       }

        /**
        * Recursively searches integer array using a binary search algorithm
        * @param arr    Array to be searched
        * @param low    Lowest index in array {usually = 0}
        * @param high   Highest index in array {example: array.length -1}
        * @param target Integer to be found
        * @return       The index of the element or
        *               -1 if the element is not found
        * @see jump(int)
        * @see linear(int)
        * @see binary(int)
        * @see fibonacci(int)
        */
        public static int binaryRec(int[] arr, int low, int high, int target) {
            if (high>=low)
            {
                int mid = low + (high - low)/2;
                if (arr[mid] == target)
                   return mid;
                if (arr[mid] > target)
                   return binaryRec(arr, low, mid-1, target);
                return binaryRec(arr, mid+1, high, target);
            }
            return -1;
        }

        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="**Private Methods**"> 

        /**
        * Description goes here
        * @param n    
        * @return   describe return
        * @see      fibonacci(int)
        */
        private static int fibSequenceIterative(int n){
            int prev = 1;
            int curr = 1;
            int next = 0;
            switch (n) {
                case 0:
                    next = 0;
                    //return 0;
                    break;
                case 1:
                case 2:
                    next = 1;
                    //return 1;
                    break;
                default:
                    for(int i = 3; i <= n; i++){
                        next = prev + curr;
                        prev = curr;
                        curr = next;
                    }
                    return next;
            }
            return next;
        }

        /**
        * Description goes here
        * @param n    
        * @return   describe return
        * @see      fibonacci(int)
        * @see      fibSequenceIterative(int)
        */
        private static int findFm(int n){
            int prev = 1;
            int curr = 1;
            int next = 0;

            if(n == 0){
                next = 0;
                return -1;
            }else if(n == 1 || n == 2){
                next = 1;
                return 1;
            }else{
                for(int i = 3; ; i++){
                    next = prev + curr;
                    prev = curr;
                    curr = next;
                    if(n <= curr)
                        return i;
                }
            }
        }

        // </editor-fold>

    } //  end Search

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="**Constants**">    
    private static final String EMAIL = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
    private static final String PHONE = "((\\(\\d{3}\\) ?)|(\\d{3}-))?\\d{3}-\\d{4}";
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="**Protected Variables**">     
    protected static int[] integerArray;
    protected static String inputString="";
    protected static int inputInteger=0;
    protected static Pattern pattern;
    protected static Matcher matcher;
    // </editor-fold>

}
    


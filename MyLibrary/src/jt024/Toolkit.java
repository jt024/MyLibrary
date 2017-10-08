
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
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random; 

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
         * @param input     String to be checked
         * @param min       minimum allowed keyInt of input
         * @param max       maximum allowed keyInt of input
        * @return      If string has the correct format
        * @see validPhone(String check) 
        */  
        public static boolean validInteger(String input,int min, int max){

            try{
                inputInteger = Integer.parseInt(input);
                return inputInteger > min-1 && inputInteger <max+1;

            } catch(NumberFormatException nfe){
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

    public static class LList extends Toolkit{

        public static class Queue extends LList{

            private Node head = null;
            private Node tail = null;
            private StringBuilder key2String = new StringBuilder();

            public void setTail(Node in){
                this.tail = in;
            }
            public void setHead(Node out){
                this.head = out;
            }
            public Node getHead(){
                return head;
            }
            public Node getTail(){
                return tail;
            }
            
            public void addLink(int value) {


                if(head==null) 
                {
                    head = new Node();
                    head.setKey(value);
                    tail=head;
                }   
                else
                {
                    if (head.getNLink()==null) {
                        head.setNLink(tail);
                    }

                    Node temp = new Node();
                    temp.setKey(value);
                    tail.setNLink(temp);
                    tail = temp;
                }
            }        
            public void addLink(String value) {


                if(head==null) 
                {
                    head = new Node();
                    head.setKey(value);
                    tail=head;
                }   
                else
                {
                    if (head.getNLink()==null) {
                        head.setNLink(tail);
                    }

                    Node temp = new Node();
                    temp.setKey(value);
                    tail.setNLink(temp);
                    tail = temp;
                }
            }
            public void resetValueString(){
                this.key2String = new StringBuilder();
            }
            public String Int2String(Node start){

                key2String.append(Integer.toString(start.getKeyInt()));

                if (start.getNLink()!=null) 
                {
                    key2String.append(", ");
                    Int2String(start.getNLink());
                }

                return key2String.toString();
            }            
            public String String2String(Node start){

                key2String.append(start.getKeyStr());

                if (start.getNLink()!=null) 
                {
                    key2String.append(", ");
                    String2String(start.getNLink());
                }

                return key2String.toString();
            }

            
        }
        public static class Stack extends LList{
        }
        public class Node extends LList{

            private int keyInt;
            private String keyString;
            private Node nNode=null;

            public Node(){
                this.nNode=null;
            }
            public Node(int key){
                this.keyInt = key;
            }
            public Node(String key){
                this.keyString = key;
            }
            public int getKeyInt(){
                return keyInt;
            }
            public String getKeyStr(){
                return keyString;
            }
            public Node getNLink(){
                return nNode;
            }
            public void setKey(int newKey){
                this.keyInt = newKey;
            }
            public void setKey(String newKey){
                this.keyString = newKey;
            }
            public void setNLink(Node nLink){
                this.nNode = nLink;

            }        
        }    

    }
   
    
    public static class Randoms extends Toolkit {

        
        /**
        * Generate a random string.
        */        
        
        public static class RandomName{

            // <editor-fold defaultstate="collapsed" desc="**MALE**">             
            
            // 100 elements in array
            private static final String[] FIRSTMALE = {"James","John","Robert",
                "Michael","William","David","Richard","Joseph","Thomas",
                "Charles","Christopher","Daniel","Matthew","Anthony","Donald",
                "Mark","Paul","Steven","Andrew","Kenneth","George","Joshua",
                "Kevin","Brian","Edward","Ronald","Timothy","Jason","Jeffrey",
                "Ryan","Gary","Jacob","Nicholas","Eric","Stephen","Jonatha",
                "Larry","Justin","Scott","Frank","Brandon","Raymond","Gregory",
                "Benjamin","Samuel","Patrick","Alexander","Jack","Dennis",
                "Jerry","Tyler","Aaron","Henry","Douglas","Jose","Peter","Adam",
                "Zachary","Nathan","Walter","Harold","Kyle","Carl","Arthur",
                "Gerald","Roger","Keith","Jeremy","Terry","Lawrence","Sean",
                "Christian","Albert","Joe","Ethan","Austin","Jesse","Willie",
                "Billy","Bryan","Bruce","Jordan","Ralph","Roy","Noah","Dylan",
                "Eugene","Wayne","Alan","Juan","Louis","Russell","Gabriel",
                "Randy","Philip","Harry","Vincent","Bobby","Johnny","Logan"};
            // </editor-fold>

            // <editor-fold defaultstate="collapsed" desc="**FEMALE**">
            
            // 100 elements in array
            private static final String[] FIRSTFEMALE = {"Patricia","Mary","Jennifer",
                "Elizabeth","Linda","Barbara","Susan","Jessica","Margaret","Sarah",
                "Karen","Nancy","Betty","Lisa","Dorothy","Sandra","Ashley",
                "Kimberly","Donna","Carol","Michelle","Emily","Amanda","Helen",
                "Melissa","Deborah","Stephanie","Laura","Rebecca","Sharon",
                "Cynthia","Kathleen","Amy","Shirley","Anna","Angela","Ruth",
                "Brenda","Pamela","Nicole","Katherine","Virginia","Catherine",
                "Christine","Samantha","Debra","Janet","Rachel","Carolyn","Emma",
                "Maria","Heather","Diane","Julie","Joyce","Evelyn","Frances",
                "Joan","Christina","Kelly","Victoria","Lauren","Martha","Judith",
                "Cheryl","Megan","Andrea","Ann","Alice","Jean","Doris",
                "Jacqueline","Kathryn","Hannah","Olivia","Gloria","Marie","Teresa",
                "Sara","Janice","Julia","Grace","Judy","Theresa","Rose","Beverly",
                "Denise","Marilyn","Amber","Madison","Danielle","Brittany","Diana",
                "Abigail","Jane","Natalie","Lori","Tiffany","Alexis","Kayla"};            

            // </editor-fold>            

            // <editor-fold defaultstate="collapsed" desc="**LAST**">

            // 1k elements in array
            private static final String[] LAST = {"Smith", "Johnson", "Williams", 
                "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", 
                "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", 
                "Martin", "Thompson", "Garcia", "Martinez", "Robinson", "Clark", 
                "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", 
                "Hernandez", "King", "Wright", "Lopez", "Hill", "Scott", 
                "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter", 
                "Mitchell", "Perez", "Roberts", "Turner", "Phillips", 
                "Campbell", "Parker", "Evans", "Edwards", "Collins", "Stewart", 
                "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", 
                "Murphy", "Bailey", "Rivera", "Cooper", "Richardson", "Cox", 
                "Howard", "Ward", "Torres", "Peterson", "Gray", "Ramirez", 
                "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", 
                "Bennett", "Wood", "Barnes", "Ross", "Henderson", "Coleman", 
                "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", 
                "Flores", "Washington", "Butler", "Simmons", "Foster", 
                "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", 
                "Diaz", "Hayes", "Myers", "Ford", "Hamilton", "Graham", 
                "Sullivan", "Wallace", "Woods", "Cole", "West", "Jordan", 
                "Owens", "Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", 
                "Mcdonald", "Cruz", "Marshall", "Ortiz", "Gomez", "Murray", 
                "Freeman", "Wells", "Webb", "Simpson", "Stevens", "Tucker", 
                "Porter", "Hunter", "Hicks", "Crawford", "Henry", "Boyd", 
                "Mason", "Morales", "Kennedy", "Warren", "Dixon", "Ramos", 
                "Reyes", "Burns", "Gordon", "Shaw", "Holmes", "Rice", 
                "Robertson", "Hunt", "Black", "Daniels", "Palmer", "Mills", 
                "Nichols", "Grant", "Knight", "Ferguson", "Rose", "Stone", 
                "Hawkins", "Dunn", "Perkins", "Hudson", "Spencer", "Gardner", 
                "Stephens", "Payne", "Pierce", "Berry", "Matthews", "Arnold", 
                "Wagner", "Willis", "Ray", "Watkins", "Olson", "Carroll", 
                "Duncan", "Snyder", "Hart", "Cunningham", "Bradley", "Lane", 
                "Andrews", "Ruiz", "Harper", "Fox", "Riley", "Armstrong", 
                "Carpenter", "Weaver", "Greene", "Lawrence", "Elliott", 
                "Chavez", "Sims", "Austin", "Peters", "Kelley", "Franklin", 
                "Lawson", "Fields", "Gutierrez", "Ryan", "Schmidt", "Carr", 
                "Vasquez", "Castillo", "Wheeler", "Chapman", "Oliver", 
                "Montgomery", "Richards", "Williamson", "Johnston", "Banks", 
                "Meyer", "Bishop", "Mccoy", "Howell", "Alvarez", "Morrison", 
                "Hansen", "Fernandez", "Garza", "Harvey", "Little", "Burton", 
                "Stanley", "Nguyen", "George", "Jacobs", "Reid", "Kim", 
                "Fuller", "Lynch", "Dean", "Gilbert", "Garrett", "Romero", 
                "Welch", "Larson", "Frazier", "Burke", "Hanson", "Day", 
                "Mendoza", "Moreno", "Bowman", "Medina", "Fowler", "Brewer", 
                "Hoffman", "Carlson", "Silva", "Pearson", "Holland", "Douglas", 
                "Fleming", "Jensen", "Vargas", "Byrd", "Davidson", "Hopkins", 
                "May", "Terry", "Herrera", "Wade", "Soto", "Walters", "Curtis", 
                "Neal", "Caldwell", "Lowe", "Jennings", "Barnett", "Graves", 
                "Jimenez", "Horton", "Shelton", "Barrett", "O'brien", "Castro", 
                "Sutton", "Gregory", "Mckinney", "Lucas", "Miles", "Craig", 
                "Rodriquez", "Chambers", "Holt", "Lambert", "Fletcher", 
                "Watts", "Bates", "Hale", "Rhodes", "Pena", "Beck", "Newman", 
                "Haynes", "Mcdaniel", "Mendez", "Bush", "Vaughn", "Parks", 
                "Dawson", "Santiago", "Norris", "Hardy", "Love", "Steele", 
                "Curry", "Powers", "Schultz", "Barker", "Guzman", "Page", 
                "Munoz", "Ball", "Keller", "Chandler", "Weber", "Leonard", 
                "Walsh", "Lyons", "Ramsey", "Wolfe", "Schneider", "Mullins", 
                "Benson", "Sharp", "Bowen", "Daniel", "Barber", "Cummings", 
                "Hines", "Baldwin", "Griffith", "Valdez", "Hubbard", "Salazar", 
                "Reeves", "Warner", "Stevenson", "Burgess", "Santos", "Tate", 
                "Cross", "Garner", "Mann", "Mack", "Moss", "Thornton", "Dennis", 
                "Mcgee", "Farmer", "Delgado", "Aguilar", "Vega", "Glover", 
                "Manning", "Cohen", "Harmon", "Rodgers", "Robbins", "Newton", 
                "Todd", "Blair", "Higgins", "Ingram", "Reese", "Cannon", 
                "Strickland", "Townsend", "Potter", "Goodwin", "Walton", "Rowe", 
                "Hampton", "Ortega", "Patton", "Swanson", "Joseph", "Francis", 
                "Goodman", "Maldonado", "Yates", "Becker", "Erickson", "Hodges", 
                "Rios", "Conner", "Adkins", "Webster", "Norman", "Malone", 
                "Hammond", "Flowers", "Cobb", "Moody", "Quinn", "Blake", 
                "Maxwell", "Pope", "Floyd", "Osborne", "Paul", "Mccarthy", 
                "Guerrero", "Lindsey", "Estrada", "Sandoval", "Gibbs", "Tyler", 
                "Gross", "Fitzgerald", "Stokes", "Doyle", "Sherman", "Saunders", 
                "Wise", "Colon", "Gill", "Alvarado", "Greer", "Padilla", 
                "Simon", "Waters", "Nunez", "Ballard", "Schwartz", "Mcbride", 
                "Houston", "Christensen", "Klein", "Pratt", "Briggs", "Parsons", 
                "Mclaughlin", "Zimmerman", "French", "Buchanan", "Moran", 
                "Copeland", "Roy", "Pittman", "Brady", "Mccormick", 
                "Holloway", "Brock", "Poole", "Frank", "Logan", "Owen", 
                "Bass", "Marsh", "Drake", "Wong", "Jefferson", "Park", 
                "Morton", "Abbott", "Sparks", "Patrick", "Norton", "Huff", 
                "Clayton", "Massey", "Lloyd", "Figueroa", "Carson", "Bowers", 
                "Roberson", "Barton", "Tran", "Lamb", "Harrington", "Casey", 
                "Boone", "Cortez", "Clarke", "Mathis", "Singleton", "Wilkins", 
                "Cain", "Bryan", "Underwood", "Hogan", "Mckenzie", "Collier", 
                "Luna", "Phelps", "Mcguire", "Allison", "Bridges", "Wilkerson", 
                "Nash", "Summers", "Atkins", "Wilcox", "Pitts", "Conley", 
                "Marquez", "Burnett", "Richard", "Cochran", "Chase", 
                "Davenport", "Hood", "Gates", "Clay", "Ayala", "Sawyer", 
                "Roman", "Vazquez", "Dickerson", "Hodge", "Acosta", "Flynn", 
                "Espinoza", "Nicholson", "Monroe", "Wolf", "Morrow", "Kirk", 
                "Randall", "Anthony", "Whitaker", "O'connor", "Skinner", "Ware", 
                "Molina", "Kirby", "Huffman", "Bradford", "Charles", "Gilmore", 
                "Dominguez", "O'neal", "Bruce", "Lang", "Combs", "Kramer", 
                "Heath", "Hancock", "Gallagher", "Gaines", "Shaffer", "Short", 
                "Wiggins", "Mathews", "Mcclain", "Fischer", "Wall", "Small", 
                "Melton", "Hensley", "Bond", "Dyer", "Cameron", "Grimes", 
                "Contreras", "Christian", "Wyatt", "Baxter", "Snow", "Mosley", 
                "Shepherd", "Larsen", "Hoover", "Beasley", "Glenn", "Petersen", 
                "Whitehead", "Meyers", "Keith", "Garrison", "Vincent", 
                "Shields", "Horn", "Savage", "Olsen", "Schroeder", "Hartman", 
                "Woodard", "Mueller", "Kemp", "Deleon", "Booth", "Patel", 
                "Calhoun", "Wiley", "Eaton", "Cline", "Navarro", "Harrell", 
                "Lester", "Humphrey", "Parrish", "Duran", "Hutchinson", "Hess", 
                "Dorsey", "Bullock", "Robles", "Beard", "Dalton", "Avila", 
                "Vance", "Rich", "Blackwell", "York", "Johns", "Blankenship", 
                "Trevino", "Salinas", "Campos", "Pruitt", "Moses", "Callahan", 
                "Golden", "Montoya", "Hardin", "Guerra", "Mcdowell", "Carey", 
                "Stafford", "Gallegos", "Henson", "Wilkinson", "Booker", 
                "Merritt", "Miranda", "Atkinson", "Orr", "Decker", "Hobbs", 
                "Preston", "Tanner", "Knox", "Pacheco", "Stephenson", "Glass", 
                "Rojas", "Serrano", "Marks", "Hickman", "English", "Sweeney", 
                "Strong", "Prince", "Mcclure", "Conway", "Walter", "Roth", 
                "Maynard", "Farrell", "Lowery", "Hurst", "Nixon", "Weiss", 
                "Trujillo", "Ellison", "Sloan", "Juarez", "Winters", "Mclean", 
                "Randolph", "Leon", "Boyer", "Villarreal", "Mccall", "Gentry", 
                "Carrillo", "Kent", "Ayers", "Lara", "Shannon", "Sexton", 
                "Pace", "Hull", "Leblanc", "Browning", "Velasquez", "Leach", 
                "Chang", "House", "Sellers", "Herring", "Noble", "Foley", 
                "Bartlett", "Mercado", "Landry", "Durham", "Walls", "Barr", 
                "Mckee", "Bauer", "Rivers", "Everett", "Bradshaw", "Pugh", 
                "Velez", "Rush", "Estes", "Dodson", "Morse", "Sheppard", 
                "Weeks", "Camacho", "Bean", "Barron", "Livingston", "Middleton", 
                "Spears", "Branch", "Blevins", "Chen", "Kerr", "Mcconnell", 
                "Hatfield", "Harding", "Ashley", "Solis", "Herman", "Frost", 
                "Giles", "Blackburn", "William", "Pennington", "Woodward", 
                "Finley", "Mcintosh", "Koch", "Best", "Solomon", "Mccullough", 
                "Dudley", "Nolan", "Blanchard", "Rivas", "Brennan", "Mejia", 
                "Kane", "Benton", "Joyce", "Buckley", "Haley", "Valentine", 
                "Maddox", "Russo", "Mcknight", "Buck", "Moon", "Mcmillan", 
                "Crosby", "Berg", "Dotson", "Mays", "Roach", "Church", "Chan", 
                "Richmond", "Meadows", "Faulkner", "O'neill", "Knapp", "Kline", 
                "Barry", "Ochoa", "Jacobson", "Gay", "Avery", "Hendricks", 
                "Horne", "Shepard", "Hebert", "Cherry", "Cardenas", "Mcintyre", 
                "Whitney", "Waller", "Holman", "Donaldson", "Cantu", "Terrell", 
                "Morin", "Gillespie", "Fuentes", "Tillman", "Sanford", 
                "Bentley", "Peck", "Key", "Salas", "Rollins", "Gamble", 
                "Dickson", "Battle", "Santana", "Cabrera", "Cervantes", 
                "Howe", "Hinton", "Hurley", "Spence", "Zamora", "Yang", 
                "Mcneil", "Suarez", "Case", "Petty", "Gould", "Mcfarland", 
                "Sampson", "Carver", "Bray", "Rosario", "Macdonald", "Stout", 
                "Hester", "Melendez", "Dillon", "Farley", "Hopper", "Galloway", 
                "Potts", "Bernard", "Joyner", "Stein", "Aguirre", "Osborn", 
                "Mercer", "Bender", "Franco", "Rowland", "Sykes", "Benjamin", 
                "Travis", "Pickett", "Crane", "Sears", "Mayo", "Dunlap", "Hayden", 
                "Wilder", "Mckay", "Coffey", "Mccarty", "Ewing", "Cooley", 
                "Vaughan", "Bonner", "Cotton", "Holder", "Stark", "Ferrell", 
                "Cantrell", "Fulton", "Lynn", "Lott", "Calderon", "Rosa", 
                "Pollard", "Hooper", "Burch", "Mullen", "Fry", "Riddle", 
                "Levy", "David", "Duke", "O'donnell", "Guy", "Michael", 
                "Britt", "Frederick", "Daugherty", "Berger", "Dillard", 
                "Alston", "Jarvis", "Frye", "Riggs", "Chaney", "Odom", 
                "Duffy", "Fitzpatrick", "Valenzuela", "Merrill", "Mayer", 
                "Alford", "Mcpherson", "Acevedo", "Donovan", "Barrera", 
                "Albert", "Cote", "Reilly", "Compton", "Raymond", "Mooney", 
                "Mcgowan", "Craft", "Cleveland", "Clemons", "Wynn", "Nielsen", 
                "Baird", "Stanton", "Snider", "Rosales", "Bright", "Witt", 
                "Stuart", "Hays", "Holden", "Rutledge", "Kinney", "Clements", 
                "Castaneda", "Slater", "Hahn", "Emerson", "Conrad", "Burks", 
                "Delaney", "Pate", "Lancaster", "Sweet", "Justice", "Tyson", 
                "Sharpe", "Whitfield", "Talley", "Macias", "Irwin", "Burris", 
                "Ratliff", "Mccray", "Madden", "Kaufman", "Beach", "Goff", 
                "Cash", "Bolton", "Mcfadden", "Levine", "Good", "Byers", 
                "Kirkland", "Kidd", "Workman", "Carney", "Dale", "Mcleod", 
                "Holcomb", "England", "Finch", "Head", "Burt", "Hendrix", 
                "Sosa", "Haney", "Franks", "Sargent", "Nieves", "Downs", 
                "Rasmussen", "Bird", "Hewitt", "Lindsay", "Le", "Foreman", 
                "Valencia", "O'neil", "Delacruz", "Vinson", "Dejesus", "Hyde", 
                "Forbes", "Gilliam", "Guthrie", "Wooten", "Huber", "Barlow", 
                "Boyle", "Mcmahon", "Buckner", "Rocha", "Puckett", "Langley", 
                "Knowles", "Cooke", "Velazquez", "Whitley", "Noel", "Vang"};
            // </editor-fold>
            
            public static String getMFirsft(){
                return FIRSTMALE[RAND.nextInt(101)];
            }
            public static String getFFirst(){
                return FIRSTFEMALE[RAND.nextInt(1001)];                
            }
            public static String getLast(){
                return LAST[RAND.nextInt(1001)];                
            }
            public static String getMFull(){
                return FIRSTMALE[RAND.nextInt(101)] +" "+ LAST[RAND.nextInt(1001)];             
            }
            public static String getFFull(){
                return FIRSTFEMALE[RAND.nextInt(101)] +" "+ LAST[RAND.nextInt(1001)];                
            }
            
        }
        
        

    }
    
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="**Constants**">    
    private static final String EMAIL = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
    private static final String PHONE = "((\\(\\d{3}\\) ?)|(\\d{3}-))?\\d{3}-\\d{4}";
    protected static final Random RAND = new Random();   
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="**Protected Variables**">     
    protected static int[] integerArray;
    protected static String inputString="";
    protected static int inputInteger=0;
    protected static Pattern pattern;
    protected static Matcher matcher;
     
    
    // </editor-fold>

}
    


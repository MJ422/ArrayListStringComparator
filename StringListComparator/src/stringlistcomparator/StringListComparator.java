/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringlistcomparator;
import java.util.ArrayList;
/**
 *
 * @author Michael
 */
public class StringListComparator {

    
    public static void main(String[] args) {
        
    ArrayList<String> testArray1 = new ArrayList<String>();
    testArray1.add("to");
    testArray1.add("be");
    testArray1.add("or");
    testArray1.add("not");
    testArray1.add("to");
    testArray1.add("be");
    testArray1.add("hamlet");
    
    
    
    ArrayList<String> testArray2 = new ArrayList<String>();
    testArray2.add("hello");
    testArray2.add("my");
    testArray2.add("baby");
    testArray2.add("hello");
    testArray2.add("my");
    testArray2.add("honey");
    testArray2.add("hello");
    testArray2.add("my ragtime, ragtime");
    testArray2.add("gal");
    
    ArrayList<String> testArray3 = new ArrayList<String>();
    
    ArrayList<String> testArray4 = new ArrayList<String>();
    testArray4.add("biggest");
    testArray4.add("middle");
    testArray4.add("small");

    //establish counter variable to track the number of tests for each array we are given in main
    int testCount = 1;
    System.out.println("The largest string in Test List #"+testCount+" contains " + maxLength(testArray1) + " characters! \n");
    testCount++;
    System.out.println("The largest string in Test List #"+testCount+" contains " + maxLength(testArray2) + " characters! \n");
    testCount++;
    System.out.println("The largest string in Test List #"+testCount+" contains " + maxLength(testArray3) + " characters! \n");
    testCount++;
    System.out.println("The largest string in Test List #"+testCount+" contains " + maxLength(testArray4) + " characters! \n");
    testCount++;

    }
    
    
    
    public static int maxLength(ArrayList<String> entry){

        //declare the max length number that will hold the size of largest string
        int maxLength;

        //if the size of the list is zero (empty list) then return 0
        if (entry.size() == 0){
            maxLength = 0;
        }
        //else, if the list contains at least 1 object
        else{
            //set the maxlength to the first object in the list, we will compare from there
            maxLength= entry.get(0).length();
            //for the length of the list, count each item in the list
            for (int i = 0; i < entry.size(); i++){
                //if the value in maxlength is less than the size of the next item, make that next item's size the new max length
                if (maxLength <= entry.get(i).length()){
                    maxLength = entry.get(i).length();
                }//end nested if
                //by now, we have run through the entirety of the list, and max length now holds the value of the largest String object within

            }//end for loop through the entry list size

        }//end else block comparing objects in entry list


        //return the value that we found to be the size of the largest string in the list 'entry'
        return maxLength;
    }//end maxlength method
    
}//end class StringListComparator

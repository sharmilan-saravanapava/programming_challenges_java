package UniqueNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class UniqueNum {
    public static int[] findUnique(int[] lst){
        int[] temp = lst; //making copy of the array so that the original is left untouched
        HashMap<Integer,Integer> processedNums = new HashMap<Integer,Integer>(); /*map with elements of the array so that it can be
                                                                    checked if unique or not*/
        ArrayList<Integer> uniqueNums = new ArrayList<Integer>(); //array with numbers that are unique

        for (int i=0; i<temp.length; i++){ //filling the map
            if(processedNums.containsKey(temp[i])){
                processedNums.put(temp[i],processedNums.get(temp[i])+1);
            }
            else{
                processedNums.put(temp[i],1);
            }
        }

        for(int i=0; i<temp.length; i++){ //check which elements are unique
            if(processedNums.get(temp[i]) < 2){
                uniqueNums.add(temp[i]);
            }
        }

        int[] unique = new int[uniqueNums.size()];
        for(int i=0; i<uniqueNums.size(); i++){ //convert ArrayList to array since method is expected to return an array
            unique[i] = uniqueNums.get(i);
        }
        return unique;
    }

    public static void main(String[] args){
        int[] a = {1,2,2,3,4,5,6,7,7,7};
        int[] b = {2,2};
        int[] c = {1};
        int[] d = {};

        System.out.println(Arrays.toString(UniqueNum.findUnique(a)));
        System.out.println(Arrays.toString(UniqueNum.findUnique(b)));
        System.out.println(Arrays.toString(UniqueNum.findUnique(c)));
        System.out.println(Arrays.toString(UniqueNum.findUnique(d)));
    }
}

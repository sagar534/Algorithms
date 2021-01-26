package main.java.com.dhana.veera.sorting;

import java.util.HashMap;

public class CheckDuplicateInArray {
    public static void main(String args[]){
        int[] input={23,45,32,12,4,76,7,9,34,76,89,12};
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i]==input[j]){
                    System.out.println(input[i]);
                }
            }
        }

        HashMap<Integer, Integer> inputHash=new HashMap<Integer, Integer>();
        int count=1;
        for(int i:input){
            inputHash.put(i, inputHash.get(i)==null?count:inputHash.get(i)+1);
        }
        for(Integer p:inputHash.keySet()){
            if(inputHash.get(p)!=count)
            System.out.println("key    "+p +"   value  "+inputHash.get(p));
        }



    }
}

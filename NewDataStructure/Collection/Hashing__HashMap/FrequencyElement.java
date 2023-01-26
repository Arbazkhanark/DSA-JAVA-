package NewDataStructure.Collection.Hashing__HashMap;

import java.util.HashMap;

public class FrequencyElement {

    public static int frequencyElement(int arr[], int num){
        HashMap<Integer,Integer> map=new HashMap<>();

        int count=0;
        for (Integer x : arr) {  
            if(x==num){
                count++;
                map.put(x, x);
            }else{
                map.put(x,0);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={3,1,4,4,4,9,9,3,4,2,2,3,5};
        int num=4;
        System.out.println(frequencyElement(arr,num));
    }
}





class AllFrequencyElement{

    public static void frequencyElement(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i : arr) {
            if(map.containsKey(i)){
                int temp=map.get(i);
                map.put(i,temp+1);
            }else{
                map.put(i, 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        int arr[]={3,1,4,4,4,9,9,3,4,2,2,3,5};
        frequencyElement(arr);
    }
}
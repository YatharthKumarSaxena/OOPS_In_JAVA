package Question_Practice;

import java.util.Arrays;

public class ArrayList {
    private int[] arr = new int[2];
    private int capacity;
    private int index;
    // Public Default Constructor
    public ArrayList(){
        index = -1;
        capacity = arr.length;
    }
    // Default Parameterized Constructor
    ArrayList(int capacity){
        index = -1;
        this.capacity = capacity;
        int[] brr = Arrays.copyOf(arr,capacity);
        arr = new int[brr.length];
        arr = Arrays.copyOf(brr,brr.length);
    }
    public int size(){
        return index+1;
    }
    public void add(int val){
        if(this.size() >= capacity){
            int[] brr = Arrays.copyOf(arr,arr.length*2);
            arr = new int[brr.length];
            arr = Arrays.copyOf(brr,brr.length);
            capacity = arr.length;
        }
        index++;
        arr[index] = val;
        return;
    }
    public void set(int idx,int val){
        if(idx >= this.size()){
            System.out.println("Index Out of Bound Error");
            return;
        }
        arr[idx] = val;
        return;
    }
    public int capacity(){
        return capacity;
    }
    public void display(){
        System.out.print("[ ");
        for(int i=0;i<this.size();i++){
            if(i!=this.size()-1) System.out.print(arr[i]+" , ");
            else System.out.print(arr[i]);
        }
        System.out.print(" ]\n");
    }
}

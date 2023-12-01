// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
class HelloWorld {
    
    public static void main(String[] args) {
        int[] a={7,3,2,1,0,9,8};
        int size=a.length;
        heapSort(a,size);
        for(int i=0;i<size;i++){
            System.out.println(a[i]);
        }
    }
    public static void heapSort(int[] a, int size){
        for(int i=size/2-1;i>=0;i--){
            heapify(a,size,i);
        }
        for(int i=size-1;i>=0;i--){
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;
            heapify(a,i,0);
        }
    }
    public static void heapify(int[] a, int size,int i){
        int max=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<size && a[left]>a[max]){
            max=left;
        }
        if(right<size && a[right]>a[max]){
            max=right;
        }
        if(max!=i){
            int temp=a[max];
            a[max]=a[i];
            a[i]=temp;
            heapify(a,size,max);
        }
    }
    
}

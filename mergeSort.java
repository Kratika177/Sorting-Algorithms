// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
class HelloWorld {
    
    public static void main(String[] args) {
        int[] a={2,3,1,4,5,9,8,7};
        mergeSort(a,0,a.length-1);
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    public static void mergeSort(int[] a,int left,int right){
        int mid;
        if(left<right){
            mid=(left+right)/2;
            mergeSort(a,left,mid);
            mergeSort(a,mid+1,right);
            merge(a,left,mid,right);
        }
    }
    public static void merge(int[] a,int left,int mid,int right){
        int i,j,k;
        int n1=mid-left+1;
        int n2=right-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(i=0;i<n1;i++){
            L[i]=a[left+i];
        }
        for(j=0;j<n2;j++){
            R[j]=a[mid+1+j];
        }
        i=0;
        j=0;
        k=left;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                a[k++]=L[i++];
            }
            else{
                a[k++]=R[j++];
            }
        }
        while(i<n1){
            a[k++]=L[i++];
        }
        while(j<n2){
            a[k++]=R[j++];
        }
    }
    
}

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int[] insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,4,3,2,5,6,9,7,8};
        a=insertionSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

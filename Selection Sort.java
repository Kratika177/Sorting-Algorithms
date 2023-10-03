// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int[] selectionSort(int a[]){
        int min;
        for(int i=0;i<a.length-1;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            if(min!=i)
            {
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
                
            }
        }
        
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,4,3,2,5,6,9,7,8};
        a=selectionSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

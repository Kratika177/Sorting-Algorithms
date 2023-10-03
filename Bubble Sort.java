// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int[] bubbleSort(int a[]){
        boolean swapped=false;
        for(int i=0;i<a.length-1;i++){
            swapped=false;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                return a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={1,4,3,2,5,6,9,7,8};
        a=bubbleSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}

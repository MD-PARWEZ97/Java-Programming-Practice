public class uniqueElement {
    public static void main(String[] args) {
        int [] a={8,5,7,8,5,7,8,10,8,10,6,};
        uniqueElementOf(a);
    }
    public static void uniqueElementOf(int [] a){
        int max=a[0], min=a[0];
        for(int x:a){
            if(x>max)
                max=x;
                else if(x<min)
                min=x;
        }
        int [] freq = new int[max-min+1];
        for(int x:a){
            freq[x-min]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1)
            System.out.println(i+min);
        }
    }
}

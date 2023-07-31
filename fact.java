public class fact{
    public static int facto(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int binCoff(int n,int r){
            int a=facto(n);
            int b=facto(r);
            int c=facto(n-r);

            int  binCoff=a/(b*c);
    
          return binCoff;
    }

    public static void main(String[] args){
      System.out.println(binCoff(7,5));
    }
}
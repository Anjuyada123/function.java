public class prime {
    public static boolean isPrime(int n){
        //we can use if(n==2) return true(corner case) 
        boolean isPrime=true;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                 isPrime=false;
                break;
            }

        }
        return isPrime;
    }
    //using helper function isprime
    public static void range(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" "); 
            }
        }
        System.out.println();
    }
    
        
    public static void main(String args[]){
        System.out.println(isPrime(18));
         System.out.println(isPrime(17));
         range(20);
    }
}

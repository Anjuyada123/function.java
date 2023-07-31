public class dectobin {
    public static void binary(int dec){
        int mynum=dec;
        int pow=0;
        int decimal=0;
        while(dec>0){
           int rem=dec%2;
           decimal=decimal +(rem*(int)Math.pow(10,pow));
            pow++;
        
           dec=dec/2;

    }
    System.out.println("binary of"+mynum+"="+decimal);
}
public static void main(String args[]){
    binary(78);
}
}

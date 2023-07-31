public class bintodec {
    public static void decimal(int binary){
       int mynum=binary;
       int pow=0;
        int deci=0;
        while(binary>0){
          int lastdigit=binary%10; 
          deci=deci+(lastdigit*(int)Math.pow(2,pow));
           pow++;
           binary=binary/10;
    }
        System.out.println("decimal of "+ mynum +"= "+deci);
}
    public static void main(String[]args){
        decimal(11111);
    }
}

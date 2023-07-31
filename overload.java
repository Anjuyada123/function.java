public class overload {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b,float c){
    return a+b+c;
}
public static void main(String[] args){
      System.out.println(sum(4.6f,7.9f,9.6f ));
      System.out.println(sum(6,5));
}
}

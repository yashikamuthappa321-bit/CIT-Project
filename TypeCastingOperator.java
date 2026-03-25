public class TypeCastingOperator {
    public static void main(String[] args) {
        
        double d=9.78;
        int num=(int)d;
        System.out.println("Double value before conversion:"+d);
        System.out.println("After explict type conversion:"+num);
        int a=10;
        double b=a;
        System.out.println("After implicit type conversion:"+b);
    }
    
}

package Java8Features;

import java.util.function.Consumer;
import java.util.function.Supplier;

@FunctionalInterface
interface Square{
    int calculateSquare(int x);
}
class Test {
    public static void main(String[] args){
        int a = 25;
        Square s= (int x)->(int)Math.pow(x,2);

        System.out.println("Square: "+s.calculateSquare(a));
        Supplier<String> supplier= ()-> "HelloLearners";
        System.out.println(supplier.get());
        Consumer<String> consumerString= b->System.out.println(b);
        consumerString.accept("HelloWorld");
    }

}

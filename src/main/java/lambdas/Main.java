package lambdas;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;

public class Main {

  //TODO: Use math operation interface with lambdas
  public static void main(String[] args) {

      DoubleUnaryOperator power = x -> x * x;
      double v = power.applyAsDouble(2.0);
      System.out.println(v);

      BiConsumer<String, String> tPublisher = (name, surname) -> System.out.println("Hi " + name);

      Test test = (a, b) -> {
          if(a > b){
             return "OK";
          }else{
             return "NOT OK";
          }
      };


      System.out.println(test.test(2, 3));

      // <lista parametrów> -> <ciało wyrażenia>
  }
}

import java.util.Scanner;

class ForLoops {
  public static void main(String[] args) {
    Scanner INPUT = new Scanner(System.in);
    int sum = 0;
    System.out.println("Enter an integer: ");
    int firstNum = INPUT.nextInt();
    System.out.println("Enter another integer larger than the first one: ");
    int secondNum = INPUT.nextInt();
    System.out.print("Even numbers: ");
    for(int i = firstNum; i <= secondNum; i++){
      if(i % 2 == 0){
        System.out.print(i + " ");
        sum += i;
      }
    }
    System.out.println("");

    System.out.println("Sum of even numbers: " + sum);

    sum = 0;
    System.out.print("Odd numbers: ");
    for(int i = firstNum; i <= secondNum; i++){
      if(i % 2 != 0){
        System.out.print(i + " ");
        sum += i;
      }
    }
    System.out.println("");
    System.out.print("Sum of odd numbers = " + sum);
  }
}

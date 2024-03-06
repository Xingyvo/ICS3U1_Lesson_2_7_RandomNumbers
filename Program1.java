import java.util.Random;

class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
       // create a random object
       Random myRandom = new Random();


       // generate a random int number and store it in a variable
       // this generates a number between 10 and 30
       int intRandom = myRandom.nextInt((30 - 10) + 1) + 10;      
       System.out.println(intRandom);

  }
}

import java.util.Scanner; 

/**
 *
 * @author Neil Fischer
 */
public class Main { 

  //Create factor method 
  public static int factors(int factorNum){
    //create factor formula 
    for(int i = 1; i <= factorNum; i++){
      if(factorNum % i == 0){
        System.out.println(i);
      }
    } 
    return factorNum;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create Scanner for user input 
    Scanner input = new Scanner(System.in); 

    //prompt the user to enter in a number 
    System.out.println("Enter a number to find the factors"); 

    //put the users number into the variable 
    int factorNum = input.nextInt(); 

    int factorMethod = factors(factorNum); 


    
  }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
  System.out.println("Enter a number to count down or up from:");
  int userNum = s.nextInt();

  if (userNum >0){
    while (userNum > 0){
      userNum--;
      System.out.println(userNum);
    }
      }
  else{
    while (userNum<0){
      userNum++;
      System.out.println(userNum);
    }
  }
System.out.println("Blast Off!"); 
  }  }



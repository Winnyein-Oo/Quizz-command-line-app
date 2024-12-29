import java.util.Scanner;

public class QuestionService {
  private Question[] questions = new Question[5];
  private int score = 0;

  public QuestionService (){
   questions[0] = new Question("1","Who developed the Java programming language?", new String[]{"Dennis Ritchie", "James Gosling", "Bjarne Stroustrup","Guido van Rossum"}, 2);
   questions[1] = new Question("2","Which of the following is not a Java feature?", new String[]{"Platform Independence", "Object-Oriented", "Supports Pointers","Multithreading"}, 3);
   questions[2] = new Question("3","What is the default value of a local variable in Java?", new String[]{"0", "null", "Garbage Value","Not Initialized"}, 
   4);
   questions[3] = new Question("4","Which component of the Java platform converts bytecode into machine code?", new String[]{"JVM (Java Virtual Machine)", "JDK (Java Development Kit)", "JRE (Java Runtime Environment)","Compiler"}, 1);
   questions[4] = new Question("5","What does the final keyword in Java mean?", new String[]{"The variable cannot be modified.", "The method cannot be overridden.", "The class cannot be inherited.","All of the above."}, 4);
  }
  
  public void playQuizz(){
    Scanner scanner = new Scanner(System.in);
    for(Question q : questions){
      System.out.println(q.getQuestion());
      String[] options = q.getOptions();
      int i = 1;
      for (String option : options){
        System.out.println(i +" : " +option);
        i++;
      }
      System.out.print("Enter Your answer from 1 to " +options.length + " : ");
      int answer = scanner.nextInt();

      if(answer == q.getCorrectAnswer()){
        System.out.println("You are corrected!");
        this.score++;
      }else{
        System.out.println("You are wrong! The correct answer is : " +q.getCorrectAnswer() + " : " + q.getOptions()[q.getCorrectAnswer()-1].toString());
      }

      System.out.println("------------------------------------------------------------");

    }
    scanner.close();
    System.out.println("Questions are finished!");
  }

  public void displayScore (){
    System.out.println("Your score is " + score + "/" + questions.length + "!");
  }
}

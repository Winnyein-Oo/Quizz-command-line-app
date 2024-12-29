public class Main {

  public static void main(String[] args){
    //creating question
    QuestionService questionService = new QuestionService();

    //starting quizz section
    questionService.playQuizz();
    //displaying score
    questionService.displayScore();
  }
}
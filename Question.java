public class Question {
  private String id;
  private String question;
  private String[] options ;
  private int correctAnswer;

  public Question(String id,String question, String[] options, int correctAnswer){
     this.id = id;
     this.question = question;
     this.options = options;
     this.correctAnswer = correctAnswer;
  }

  public String getId(){
    return id;
  }
  public String getQuestion(){
    return question;
  }

  public String[] getOptions(){
    return options;
  }

  public int getCorrectAnswer(){
    return correctAnswer;
  }

}

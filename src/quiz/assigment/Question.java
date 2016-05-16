package quiz.assigment;


public abstract class Question {
    
    private String myText;
    private String answer;
    private int QuestionScore;
    
    public String getMyText() {
        return myText;
    }
    
     public String getAnswer() {
        return answer;
    }
     
      public int getQuestionScore() {
        return QuestionScore;
    }
    
    
    public Question (String myText , String answer , int QuestionScore)
    {
        this.myText = myText;
        this.answer = answer;
        this.QuestionScore = QuestionScore;
    }
    
    public abstract String getQuestion();
    public abstract int checkAnswer(String answer);

   
    
            
    
}

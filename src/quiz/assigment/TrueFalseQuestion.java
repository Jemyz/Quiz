package quiz.assigment;


public class TrueFalseQuestion extends Question{

    public TrueFalseQuestion(String myText, String answer, int QuestionScore) {
        super(myText, answer, QuestionScore);
    }

   

     public int checkAnswer(String answer) {
        if (getAnswer().equalsIgnoreCase(answer)) return getQuestionScore();
        return 0;
    }

    
    public String getQuestion() {
        return "True False Question :- \n" + getMyText() ;
    }

   


 
    
   
    
}

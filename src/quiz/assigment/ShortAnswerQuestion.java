package quiz.assigment;

public class ShortAnswerQuestion extends Question{

    public ShortAnswerQuestion(String myText, String answer, int QuestionScore) {
        super(myText, answer, QuestionScore);
    }

    @Override
    public String getQuestion() {
         return "Short Answer Question :- \n" + getMyText() ;    }

    @Override
    public int checkAnswer(String answer) {
      if (getAnswer().equalsIgnoreCase(answer)) return getQuestionScore();
        return 0;   
    }

   
    


    

}

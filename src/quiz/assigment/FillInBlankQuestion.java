package quiz.assigment;

public class FillInBlankQuestion extends Question {

    public FillInBlankQuestion(String myText, String answer, int QuestionScore) {
        super(myText, answer, QuestionScore);
    }

    @Override
    public String getQuestion() {
        return "Fill In Blank Question :- \n" + getMyText() ;
    }

    @Override
    public int checkAnswer(String answer) {
        if (getAnswer().equalsIgnoreCase(answer)) return getQuestionScore();
        return 0;
    }

     


   

    
    
}

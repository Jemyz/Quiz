package quiz.assigment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class WriteFiles {
    
    File f;
    
    /**
     *
     * @param path
     * @throws IOException
     */
    public void saveQuestions (String path) throws IOException
    {
 
        f = new File(path);
       
        
         BufferedWriter infoToWrite = new BufferedWriter(new FileWriter(f));           
            
            for (int i = 0 ; i < Data.getQuestions().size() ; i++)
            {

                String line = Data.getQuestion(i).getClass().getSimpleName() + "," + Data.getQuestion(i).getMyText() + "," + Data.getQuestion(i).getAnswer() + "," + Data.getQuestion(i).getQuestionScore() ;
                
                infoToWrite.write(line);
                infoToWrite.newLine();
                
            }
            infoToWrite.close();
        
        
        
        
        
    }
    
    public void saveUsers (String path) throws IOException
    {
 
        f = new File(path);
        String line; 
        
        
             BufferedWriter infoToWrite = new BufferedWriter(new FileWriter(f));         
          
            for (int i = 0 ; i < Data.getInstructors().size() ; i++)
            {
                
                line = Data.getInstructor(i).getClass().getSimpleName() + "," + Data.getInstructor(i).getUserName() + "," + Data.getInstructor(i).getPassword();
                
                infoToWrite.write(line);
                infoToWrite.newLine();
                
            }    
                
            
            for (int i = 0 ; i < Data.getStudents().size() ; i++)
            {

                line = Data.getStudent(i).getClass().getSimpleName() + "," + Data.getStudent(i).getUserName() + "," + Data.getStudent(i).getPassword();
                
                infoToWrite.write(line);
                infoToWrite.newLine();
                
            }
            infoToWrite.close();
       
        
        
        
        
    }
    
    public static void main(String[] args) throws IOException {
        WriteFiles x = new WriteFiles();
        Instructor y = new Instructor("mah", "123");
        Data.addInstructor(y);
        Student z = new Student("hamd", "456");
        Data.addStudent(z);
        Question c = new FillInBlankQuestion("10", "11", 12);
        Data.addQuestion(c);
        
        
        
        x.saveQuestions("questions.txt");
        x.saveUsers("users.txt");
    }
        
}

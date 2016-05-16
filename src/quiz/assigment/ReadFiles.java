package quiz.assigment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadFiles  {
    
    File f;
  
    public ReadFiles ()
    {
       
    }
    
    public void readQuestions (String Path) throws FileNotFoundException
    {
        f = new File(Path);
        Scanner s = new Scanner(f);
        Question temp = null;
        Data.getQuestions().clear();
        while (s.hasNext())
        {
            String line = s.nextLine();
            String []Qparts = line.split(",");
            if(Qparts[0].equals("TrueFalseQuestion"))
            {             
                temp = new TrueFalseQuestion(Qparts[1], Qparts[2], Integer.parseInt(Qparts[3]));
               
            }
            else if(Qparts[0].equals("FillInBlankQuestion"))
            {
                temp = new FillInBlankQuestion(Qparts[1], Qparts[2], Integer.parseInt(Qparts[3]));
            }
            else if(Qparts[0].equals("ShortAnswerQuestion"))
            {
                temp = new ShortAnswerQuestion(Qparts[1], Qparts[2], Integer.parseInt(Qparts[3]));
            }
            Data.addQuestion(temp);
            
            
        }
        
    }
    public void readUsers (String Path) throws FileNotFoundException
    {
        f = new File(Path);
        Scanner s = new Scanner(f);
        Student tempStudent = null;
        Instructor tempInstructor = null;
        Data.getInstructors().clear();
        Data.getStudents().clear();
        while (s.hasNext())
        {
            String line = s.nextLine();
            String []Qparts = line.split(",");
            if(Qparts[0].equals("Student"))
            {             
                tempStudent = new Student(Qparts[1], Qparts[2]);
                Data.addStudent(tempStudent);
            }
            else if(Qparts[0].equals("Instructor"))
            {
                tempInstructor = new Instructor(Qparts[1], Qparts[2]);
                Data.addInstructor(tempInstructor);
            }
        }
        
        
        
           
        
        
    }
        
        
  
    
        
    
}

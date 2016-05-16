package quiz.assigment;

import java.awt.List;
import java.util.LinkedList;

public class Data {
    
    private static LinkedList<Question> questions  = new LinkedList();
    private static LinkedList<Student>  students = new LinkedList();
    private static LinkedList<Instructor>  instructors = new LinkedList();
    
   
   

    public static Question getQuestion (int counter)
    {
        return getQuestions().get(counter);
    }
    public static void addQuestion ( Question question)
    {
        getQuestions().add(question);
    }
    
    
    
    
     public static Student getStudent (int counter)
    {
        return getStudents().get(counter) ;
    }
    public static void addStudent ( Student student)
    {
        getStudents().add(student);
    }
    
    
    
    
    public static Instructor getInstructor (int counter)
    {
        return getInstructors().get(counter) ;
    }
    public static void addInstructor ( Instructor instructor)
    {
        getInstructors().add(instructor);
    }

    public static LinkedList<Question> getQuestions() {
        return questions;
    }

    public static LinkedList<Student> getStudents() {
        return students;
    }

    public static LinkedList<Instructor> getInstructors() {
        return instructors;
    }

    public static void setQuestions(LinkedList<Question> aQuestions) {
        questions = aQuestions;
    }

    public static void setStudents(LinkedList<Student> aStudents) {
        students = aStudents;
    }

    public static void setInstructors(LinkedList<Instructor> aInstructors) {
        instructors = aInstructors;
    }

    public static boolean checkInstructor (String Username , String Password )
    {
        for (Instructor temp : instructors)
        {
            if (temp.getUserName().equals(Username) && temp.getPassword().equals(Password)) return true;
        }
        return false;
    }
    public static boolean checkStudent (String Username , String Password )
    {
        for (Student temp : students)
        {
            if (temp.getUserName().equals(Username) && temp.getPassword().equals(Password)) return true;
        }
        return false;
    }
    
    
   
    
    
    
    
    
}


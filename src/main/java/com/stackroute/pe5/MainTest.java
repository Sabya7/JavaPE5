package com.stackroute.pe5;
//a Student class that represents the following information of a student: id, name, and age
//all the member variables should be private .
//a. Implement `getter and setter` .
//b. Create a `StudentSorter` class that implements `Comparator interface` .
//c. Write a class `Maintest` create Student class object(minimum 5)
//d. Add these student object into a List of type Student .
//e. Sort the list based on their age in decreasing order, for student having
//same age, sort based on their name.
//f. For students having same name and age, sort them according to their ID.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTest  {


    public static String implementer(ArrayList<Student> students) {
       /* ArrayList<Student>students=new ArrayList<Student>();
        Student student1=new Student("abc","sab",1);
        Student student2=new Student("def","yas",2);
        Student student3=new Student("ghi","sac",2);
        Student student4=new Student("jkl","his",3);
        Student student5=new Student("mno","sah",4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        */
        Comparator<Student> studentComparator=new StudentSorter();// creation of comparator object
        Collections.sort(students,studentComparator);  //sorting the array
        //System.out.println(students);
       return students.toString();
    }
}

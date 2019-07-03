package com.stackroute.pe5;
//Implementing the abstract class Comparator
import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() == o2.getAge())
        {
          if(o1.getName().compareTo(o2.getName())==0)
              return o1.getId().compareTo(o2.getId());
          else return o1.getName().compareTo(o2.getName());
        }
        else if(o1.getAge()>o2.getAge())
            return 1;
        else
            return -1;
   }
}

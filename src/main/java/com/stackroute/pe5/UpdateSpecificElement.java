package com.stackroute.pe5;
//a program to update specific array element by given element and clear the arraylist.
import java.util.ArrayList;
import java.util.Collection;

public class UpdateSpecificElement {
    public static <E> ArrayList<E> update(ArrayList<E> al,E e,E r)
    {
      int index=al.indexOf(e);
      al.set(index,r);
      ArrayList<E> copy=new ArrayList<E>(al);
      al.clear();
        System.out.println("After removing  all elements");
        System.out.println(al);
    return copy;
    }

}

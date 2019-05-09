
package picture_puzzle_project.Help;
import java.lang.reflect.Array;
import java.util.*;

import java.util.*;

public class LinkedListMethods 
{

  public static void main(String[] args) {

  LinkedList llist = new LinkedList();

  llist.add("Hi");

  llist.add("I");

  llist.add("Hi");

  llist.add("Love");

  llist.add("java");

  System.out.println("Linked List :" + llist);

 // remove first occurance of  "Hi"


 // print the list
 llist.set(2,"too much");
      System.out.println(""+llist);

  System.out.println("LinkedList:" + llist);
  
  Object[] array = llist.toArray();
  
  for(int i=0;i<llist.size();i++)
  {
      System.out.println(""+array[i]);
  }

 }

}
import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

    // ARRAYS (50 points)
    System.out.println("======================================================");
    // 1. Create an array of characters of your SURNAME.
    
          char[] surname = { 'T', 'E', 'N', 'E', 'R', 'I', 'F', 'E' };


    // 2. Display each character of your SURNAME on each line.
    
    for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);

    // 3. Display the first character of your SURNAME.
    
    System.out.println(surname[0]);

    // 4. Display the last character of your SURNAME.
    
    System.out.println(surname[7]);

    // 5. Display the character of your SURNAME in reverse order.
    
     for (int i = surname.length - 1; i >= 0; i--) {
            System.out.println(surname[i]);

    // LINKED LIST (25 points)
    System.out.println("======================================================");
    // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
    
    LinkedList<String> studNo = new LinkedList<>();

        studNo.add("1");
         studNo.add("0");
          studNo.add("5");
          studNo.add("2");
         studNo.add("6");
        studNo.add("8");

    // 2. Add an asterisk (*) to the head/front of the Linked list.
    
    studNo.addFirst("*");

    // 3. Add an asterisk (*) to the tail/end of the Linked list.
    
    studNo.addLast("*");
  
    // 4. Display the Linked list.
    
    System.out.println(studNo);

    // 5. Display the last character of the Linked list.
    
    System.out.println(studNo.get(7));
  
    // 6. Replace the last character of the Linked list with the exclamation symbol (!).
    
    studNo.set(7, "!");

    // 7. Remove the first character of the Linked list.
    
    studNo.remove(0);

    // 8. Display the LinkedList.
    
    System.out.println(studNo);

    // STACK (25 points)
    System.out.println("======================================================");
    // 1. Create a Stack of characters of your SURNAME.
    
    Stack<String> surname = new Stack<>();
    
    surname.push("T");
     surname.push("E");
      surname.push("N");
        surname.push("E");
        surname.push("R");
      surname.push("I");
     surname.push("F");
    surname.push("E");

    // 2. Print the Stack.
    
    System.out.println(surname);

    // 3. Add a "INF214" to the stack.
    
          surname.push(" ");
        surname.push("I");
      surname.push("N");
     surname.push("F");
       surname.push("2");
        surname.push("1");
         surname.push("4");
  
    // 4. Print the Stack.
    
    System.out.println(surname);

    // 5. Remove "INF214".
    
     surname.pop();
      surname.pop();
       surname.pop();
       surname.pop();
      surname.pop();
     surname.pop();
     

    // 6. Add "CCDATRCL-INF214".
    
       surname.push("C");
        surname.push("C");
         surname.push("D");
        surname.push("A");
      surname.push("T");
     surname.push("R");
    surname.push("C");
   surname.push("L");
    
   surname.push("-");
    surname.push("I");
     surname.push("N");
       surname.push("F");
        surname.push("2");
         surname.push("1");
           surname.push("4");
           
           
    

    // 7. Print the Stack.
    
    System.out.println(surname);

    }
}

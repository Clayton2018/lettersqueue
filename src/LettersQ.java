import java.util.LinkedList;

public class LettersQ {

    private static LinkedList<String> lettersQ = new LinkedList<String>();

    public static void main(String args[]){

        lettersQ.add("A");
        lettersQ.add("B");
        lettersQ.add("C");
        lettersQ.add("D");

        //displaying the contents of the linked list
        System.out.println("Linked list : " + lettersQ);
        //Size of linked list
        System.out.println("Queue size : " + lettersQ.size());

        while(!lettersQ.isEmpty()){

            System.out.println(lettersQ.removeFirst());

        }//end while

        System.out.println("Linked list : " + lettersQ);


    }

}

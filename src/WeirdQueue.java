import java.util.Stack;

public class WeirdQueue {
    public static Stack<java.lang.Object> StackOne = new Stack<java.lang.Object>();
    public static Stack<Object> StackTwo = new Stack<Object>();

    public void enqueue(Object item){
        while(!StackOne.isEmpty()){ //Check to make sure queue has elements
            StackTwo.push(StackOne.pop());
        }
        StackOne.push(item);
        while(!StackOne.isEmpty()){
            StackOne.push(StackTwo.pop());
        }
    }//All elemets except new element are pushed and popped. N is the queue size therefore Time Complexity = Θ(N)
    public Object dequeue(){
        if(StackOne.isEmpty()){ //Checks if queue is already empty
            return -1; //returns -1 if empty
        }
        Object curr = StackOne.peek();
        StackOne.pop();
        return curr;
    } // Constant number of stack operations wihtout extra space. Time Complexity Θ(1)

}

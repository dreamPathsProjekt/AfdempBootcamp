/**
 *
 * @author dreamPathsProjekt
 */
import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
	

	public static Stack<Integer> reverse(Stack<Integer> initial) {
		Stack<Integer> cacheStack1 = new Stack<>();
		Stack<Integer> cacheStack2 = new Stack<>();
		Stack<Integer> newStack = new Stack<>();
		
		int stacklength=initial.size();
		for(int i=0;i<stacklength;i++){
			cacheStack1.push(initial.peek()); //implement initial stack to maintain shape
			cacheStack2.push(cacheStack1.pop());
			newStack.push(initial.pop());
			
		//initial.push(cacheStack.pop());
		}
		for(int i=0;i<stacklength;i++){
			initial.push(cacheStack2.pop());
		}
		return newStack;
    }

	public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9,10}));
        System.out.println("initial stack: " + myStack);
        System.out.println("reversed stack: " + reverse(myStack));
        
        System.out.println("initial stack: " + myStack); //check state of initial stack 

	}

}

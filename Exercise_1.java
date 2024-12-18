
class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here
        return top==0;
    } 

    Stack() 
    { 
        //Initialize your constructor
        top=0;
    } 
  
    boolean push(int x) 
    { 
        //Check for stack Overflow
        //Write your code here
        if(top==MAX){
            return false;
        }
        a[top++]=x;
        return true;
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        return a[--top];
    } 
  
    int peek() 
    { 
        //Write your code here
        if(isEmpty()) {
            System.out.println("Stack is empty, hence returning 0");
            return 0;
        }
        return a[top-1];
    } 
} 
  
// Driver code 
class Main {
    public static void main(String args[]) 
    { 
        Stack s = new Stack();
        s.push(10); 
        s.push(20); 
        s.push(30);
    } 
}

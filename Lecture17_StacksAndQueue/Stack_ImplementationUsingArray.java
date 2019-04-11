package Lecture17_StacksAndQueue;

public class Stack_ImplementationUsingArray {
    private int[] data;
    private int top;
    public Stack_ImplementationUsingArray(){
        top=-1;
        data=new int[10];
    }
    public int getSize(){
        return top+1;
    }
    public Boolean isEmpty(){
        return getSize()==0;
    }
    public Boolean isFull(){
        return getSize()==data.length;
    }
    public void push(int element){
        if(isFull()){
            return;
        }
        top++;
        data[top]=element;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        return data[top--];
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return data[top];
    }

}

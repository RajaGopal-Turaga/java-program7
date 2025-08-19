package sorting;

	public class crt_exmple {
	    int capacity;                 
	    int top;                       
	    String[] dairy;                

	    public crt_exmple(int size) {        
	        capacity = size;           
	        top = -1;                  
	        dairy = new String[capacity]; 
	    }

	    void add(String item) {        
	        if (top == capacity - 1) { 
	            System.out.println("Stack overflow");
	            return;                
	        }
	        dairy[++top] = item;       
	    }

	    String remove() {              
	        if (top == -1) {           
	            System.out.println("Stack underflow - no elements to remove");
	            return null;           
	        }
	        String removeVal = dairy[top--]; 
	        System.out.println(removeVal + " is removed"); 
	        return removeVal;    
	    }
	   void printStack() { 
	        if (top == -1) {          
	            System.out.println("Stack is empty"); 
	            return;                
	        }
	        System.out.print("Stack elements: ");  
	        for (int i = 0; i <= top; i++) {       
	            System.out.print(dairy[i] + " ");  
	        }
	        System.out.println();       
	    }
	   public class crt_exmple1 {

	    public static void main(String[] args) {  
	    	crt_exmple cc = new crt_exmple(6);                   
	        cc.add("milk");                        
	        cc.add("curd");                          
	        cc.add("butter");                       
	        cc.add("ghee");                        
	        cc.add("rice");                         
	        cc.add("water");                        
	        cc.remove();                          
	        cc.printStack();                       
	        System.out.println("Added successfully"); 
	    }
	}
	}



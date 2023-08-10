import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    Queue<Integer> queue=new LinkedList<>();
	    while(true)
	    {
	    System.out.println("|=======Queue Operation====|");
	    System.out.println("|1|         Enqueue        |");
	    System.out.println("|==========================|");
	    System.out.println("|2|         Dequeue        |");
	    System.out.println("|==========================|");
	    System.out.println("|3|         Peek           |");
	    System.out.println("|==========================|");
	    System.out.println("|4|         Display        |");
	    System.out.println("|==========================|");
	    
	    System.out.print("Enter your choice:");
	    int n=sc.nextInt();
	    switch(n)
	    {
	        case 1:
	            System.out.print("Enter your Enqueue data ");
	            int a=sc.nextInt();
	            queue.add(a);
	            System.out.println("Enqueued data is "+ a);
	           break;
	       case 2:
	           if(queue.isEmpty())
	           {
	               System.out.println("No Element in the Queue");
	           }
	           else
	           {
	               int dequeuedata=queue.poll();
	               System.out.println("Dequeued data is "+dequeuedata);
	           }
	           break;
	         case 3:
	           if(queue.isEmpty())
	           {
	               System.out.println("No Element in the Queue");
	           }
	           else
	           {
	               int peekeddata=queue.peek();
	               System.out.println("Peek  data is "+peekeddata);
	           }
	           break;  
	           case 4:
	           if(queue.isEmpty())
	           {
	               System.out.println("No Element in the Queue");
	           }
	           else
	           {
	               System.out.println("Element in the Queue");
	               for(int element:queue)
	               {
	                   System.out.println(element+" ");
	               }
	               System.out.println(" ");
	           }
	           break;  
	           
	           
	       default:
	       System.out.println("-----Enter vaild choice-----");
	      }
	    
	    }
		
	}
}

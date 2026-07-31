import java.util.Scanner;
public class Stackjava{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter stack size:");
        int size=sc.nextInt();
        int[]stack=new int[size];
        int top=-1;
        int choice;
        do{
            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peak");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.print("Enter choice:");
            choice=sc.nextInt();
            switch(choice){
    case 1:
        if(top==size-1) {
            System.out.println("stack overflow");
        }else{
            System.out.println("Enter value:");
            int value=sc.nextInt();
            top++;
            stack[top]=value;
            System.out.println(value+"inserted");
        }
        break;
case 2:
    if(top==1) {
            System.out.println("stack unerflow");
        }else{
            System.out.println("stack[top]+removed:");
            top--;
        }
        break;
case 3:
    if(top==-1) {
            System.out.println("stack is empty");
        }else{
            System.out.println("Top Element="+stack[top]);
        }
        break;
case 4:
    if(top==-1) {
            System.out.println("stack is empty");
        }else{
            System.out.println("Stack Elements:");
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
        break;
case 5:
    System.out.println("Program Ended:");
    break;
default:
System.out.println("Invalid choice");
}
        }while(choice!=5);
        sc.close();
    }
}

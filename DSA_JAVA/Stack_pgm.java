package DSA_JAVA;


import java.util.Scanner;



    public class Stack_pgm{
      
    
       public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=s.nextInt();
        int arr[]=new int[size];
        int c;
        actions as=new actions();
        do{
        System.out.println("Enter the choice : 1 for push || 2 for pop || 3 for Display");
         c=s.nextInt();
    
         switch(c){
            case 1:as.push(size,arr);break;
            case 2:as.pop();break;
            case 3:as.display(arr);break;
            default:System.out.println("Enter the valid input.");
        }
        System.out.println("To continue operation press 4");
        c=s.nextInt();
       }while(c==4);
       System.out.println("Exiting....");
    } 
    }
   
    class actions{
      Scanner sc=new Scanner(System.in);
        int top=-1;
        void push(int size,int arr[]){
         if(top==size-1){
          System.out.println("Stack is overflow we cant push");
         }
         else{
          System.out.println("Enter the element :");
          arr[top+1]=sc.nextInt();
          top++;
         }
         }
         void pop(){
          if(top==-1){
            System.out.println("Stack is underflow ,we cant perform pop operation.");
          }
          else{
            top=top-1;
            System.out.println("we did pop operation.");
          }
        
         }
         void display(int arr[]){
          if(top==-1){
            System.out.println("Stack is empty we cant display.");
          }
         else{
          for(int i=0;i<top+1;i++){
            System.out.print(arr[i]+" ");
          }
          System.out.println("");
         }
         }
     
     }
    

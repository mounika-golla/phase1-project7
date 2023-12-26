package project7;

class OuterClass {
 private int outerData;

 public OuterClass(int data) {
     this.outerData = data;
 }

 public void displayOuter() {
     System.out.println("Outer Data: " + outerData);
 }

 // Inner class
 class InnerClass {
     private int innerData;

     public InnerClass(int data) {
         this.innerData = data;
     }

     public void displayInner() {
         System.out.println("Inner Data: " + innerData);
     }
 }
}

public class InnerClassVerification {

 public static void main(String[] args) {
     
     OuterClass outerObject = new OuterClass(126);

    
     OuterClass.InnerClass innerObject = outerObject.new InnerClass(34);

     
     outerObject.displayOuter();
     innerObject.displayInner();
 }
}


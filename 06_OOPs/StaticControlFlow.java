// class StaticControlFlow
// {
//     static int i=10;
//     static 
//     {
//         m1();
//         System.out.println("First Static Blaock");
//     }
//     public static void main(String[] args) {
//         m1();
//         System.out.println("Main method");
//     }
//     public static void m1()
//     {
//         System.out.println(j);
//     }
//     static
//     {
//         System.out.println("Second Static Block");
//     }
//     static int j=20;
// }





// class StaticControlFlow
// {
//     static int i=10;
//     static
//     {
//         System.out.println(i);
//         System.exit(0);
//     }
// }




// class StaticControlFlow
// {
//     static
//     {
//         System.out.println(i);
//     }
//     static int i=10;
// }




// class StaticControlFlow
// {
//     static
//     {
//         m1();
//     }
//     public static void m1()
//     {
//         System.out.println(i);
//     }
//     static int i=10;
// }





// class Base
// {
//     static int i=10;
//     static
//     {
//         m1();
//         System.out.println("Base Static Block");
//     }
//     public static void main(String[] args) {
//         m1();
//         System.out.println("Base Main");
//     }
//     public static void m1()
//     {
//         System.out.println(j);
//     }
//     static int j=20;
// }
// class Derived extends Base{
//     static int x=100;
//     static
//     {
//         m2();
//         System.out.println("Derived first static block");
//     }
//     public static void m2()
//     {
//         System.out.println(y);
//     }
//     public static void main(String[] args) {
//         m2();
//         System.out.println("Derived Main");
//     }
//     static 
//     {
//         System.out.println("Derived Second Static Block");
//     }
//     static int y=200;
// }







// class StaticControlFlow
// {
//     static 
//     {
//         System.out.println("Hello I can Print");
//         System.exit(0);
//     }
// }
// public class ReturnVsFinally {
//     public static void main(String[] args) {
//         try{
//             System.out.println("Try Block");
//             return;
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("catch block");
//         }
//         finally
//         {
//             System.out.println("Finally block");
//         }
//     }
// }





// public class ReturnVsFinally {
//     public static void main(String[] args) {
//        System.out.println(m1());
//     }
//     public static int m1()
//     {
//          try{
//             System.out.println(10/0);
//             return 777;
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("catch block");
//             return 888;
//         }
//         finally
//         {
//             System.out.println("Finally block");
//             return 999;
//         }
//     }
// }




// class Test{
//     public static void main(String[] args) {
//          try{
//             System.out.println("try");
//             System.exit(0);
//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println("catch block");
//         }
//         finally
//         {
//             System.out.println("Finally block");
//         }
//     }
// }



// class Test
// {
//     public static void main(String[] args) {
//          try{
//             System.out.println(10/0);

//         }
//         catch(ArithmeticException e)
//         {
//             System.out.println(10/0);
//         }
//         finally
//         {
//             String s=null;
//             System.out.println(s.length());
//         }
//     }
// }
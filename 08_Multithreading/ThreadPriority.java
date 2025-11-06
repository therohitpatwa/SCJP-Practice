// // class ThreadPriority extends Thread {
  
// // }
// // class Test{
// //     public static void main(String[] args) {
// //         System.out.println(Thread.currentThread().getPriority());
// //         // Thread.currentThread().setPriority(9);
// //          System.out.println(Thread.currentThread().getPriority());
// //          ThreadPriority t=new ThreadPriority();
// //          System.out.println(t.getPriority());
        

// //     }
// // }





// class ThreadClass extends Thread {
//     public void run()
//     {
//         for(int i=0;i<10;i++)
//         {
//             System.out.println("Child Thread");
//         }
//     }
   
// }
// class Test 
// {
//     public static void main(String[] args) {
//         ThreadClass t=new ThreadClass();
//         t.setPriority(10);
//         t.start();
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("main Thread");
//         }

//     }
// }


// class Join extends Thread {
//     public void run()
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("Seeta Thread");
//             try{
//                 Thread.sleep(2000);
//             }
//             catch(InterruptedException e)
//             {

//             }
//         }
//     }
// }
// class Test{
//     public static void main(String[] args) throws InterruptedException{
//         Join t=new Join();
//         t.start();
//         t.join();
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("Rama Thread");
//         }

//     }
// }







// class Join extends Thread {
//     static Thread mt;
//     public void run()
//     {
//         try{
//             mt.join();
//         }
//         catch(InterruptedException e)
//         {

//         }
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("Seeta Thread");
//             try{
//                 Thread.sleep(2000);
//             }
//             catch(InterruptedException e)
//             {

//             }
//         }
//     }
// }
// class Test{
//     public static void main(String[] args) throws InterruptedException{
//         Join t=new Join();
//         // Join mt=Thread.currentThread();
//         t.start();
//         t.join();
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("Rama Thread");
//         }

//     }
// }




//19


// class Test {

//     private static Test t = null;

//     privatge Test() {

//     }

//     public static Test getTest() {
//         if (t == null) {
//             t = new Test();

//         }
//         return t;
//     }
// }

// class Client {

//     public static void main(String[] args) {
//         System.out.println(Test.getTest().hashCode());
//         System.out.println(Test.getTest().hashCode());
//         System.out.println(Test.getTest().hashCode());
//         System.out.println(Test.getTest().hashCode());
//     }
// }





// class Test{
//     private static Test t1=null;
//     private static Test t2=null;
//     private Test()
//     {

//     }
//     public static Test getTest()
//     {
//         if(t1==null)
//         {
//             t1=new Test();
//             return t1;

//         }
//         else if(t2==null)
//         {
//             t2=new Test();
//             return t2;
//         }
//         else
//         {
//             if(Math.random()<0.5)
//             return t1;
//             else
//             return t2;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(Test.getTest().hashCode());
//         System.out.println(Test.getTest().hashCode());
//         System.out.println(Test.getTest().hashCode());
//         System.out.println(Test.getTest().hashCode());
//     }

// }



//By Si
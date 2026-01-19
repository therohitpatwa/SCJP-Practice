//13


// class Parent{
//     public void m1(int... i)
//     {
//         System.out.println("Parent Class");
//     }
// }
// class Child extends Parent
// {
//     public void m1(int... i)
//     {
//         System.out.println("Child Class");
//     }
// }






// class Parent{
//     public void m1(int... i)
//     {
//         System.out.println("Parent Class");
//     }
// }
// class Child extends Parent
// {
//     public void m1(int i)
//     {
//         System.out.println("Child Class");      //overloading not overriding
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Parent p=new Parent();
//         p.m1(10);
//         Child c=new Child();
//         c.m1(10);
//         Parent p1=new Child();
//         p.m1(10);

//     }
// }
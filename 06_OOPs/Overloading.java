// class Test{
//     public void m1()
//     {
//         System.out.println("No arg");
//     }
//     public void m1(int i)
//     {
//         System.out.println("Int Arg");
//     }
//     public void m1(double d)
//     {
//         System.out.println("Double Arg");
  
//     }
//     public static void main(String[] args) {
//         Test t=new Test();
//         t.m1();
//         t.m1(10);
//         t.m1(10.5);
//     }

// }







// class Test{
//     public void m1(int i)
//     {
//         System.out.println("Int arg");
//     }
//     public void m1(float f)
//     {
//         System.out.println("float Arg");
//     }
//     public static void main(String[] args) {
//         Test t=new Test();
//         t.m1('a');
//         t.m1(10l);
//         // t.m1(10.5);
//     }

// }



// class Test{
  
//     public void m1(String s)
//     {
//         System.out.println("String Version");
//     }
//     public void m1(Object o)
//     {
//         System.out.println("Object Version");
  
//     }
//     public static void main(String[] args) {
//         Test t=new Test();
//         t.m1("Rohit");
//         t.m1(new Object());
//         t.m1(null);
//     }

// }





// class Test{
  
//     public void m1(String s)
//     {
//         System.out.println("String Version");
//     }
//     public void m1(StringBuffer sb)
//     {
//         System.out.println("SB Version");
  
//     }
//     public static void main(String[] args) {
//         Test t=new Test();
//         t.m1("Rohit");
//         t.m1(new StringBuffer());
//         // t.m1(null);
//     }

// }





// class Test{
  
//     public void m1(int i,float f)
//     {
//         System.out.println("int-float");
//     }
//     public void m1(float f,int i)
//     {
//         System.out.println("float-int");
  
//     }
//     public static void main(String[] args) {
//         Test t=new Test();
//         t.m1(10,10.5f);
//         t.m1(10.5f,10);
//         // t.m1(10,10);
//         // t.m1(10.5f,10.5f);
//     }

// }




class Animal{

}
class Monkey extends Animal
{

}
class Test{
    public void m1(Animal a)
    {
        System.out.println("Animal Version");
    }
    public void m1(Monkey m)
    {
        System.out.println("Monkey Version");
    }
    public static void main(String[] args) {
        Test t=new Test();
        Animal a=new Animal();
        Animal a1=new Monkey();
        Monkey m=new Monkey();
        t.m1(a);
        t.m1(m);
        t.m1(a1);
    }
}
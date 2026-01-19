//18




// class Student
// {
//     String name;
//     int roll;

//     Student(String name,int roll) {
//         this.name=name;
//         this.roll=roll;
//     }
//     public static void main(String[] args) {
//         Student s1=new Student("Rohit", 101);
//         Student s2=new Student("Riyuuu",143);
//     }   
// }




// class Test{
//     static int count=0;
//     {
//         count++;
//     }
//     Test() {

//     }
//     Test(int i)
//     {

//     }
//     public static void main(String[] args) {
//         Test t1=new Test();
//         Test t2=new Test(10);
//         Test t3=new Test();
//         System.out.println(count);
//     }

// }




// class  Student
// {
//     void Student()    //it is not a  constuctor it is method 
//     {

//     }
// }





// class Student{
//     static Student()    //only allowed public, default, private, protected
//     {
//     }
// }





// class Test{

//    Test() {
//        super();
//     }

// }





// class Test{

//    Test() {
//        System.out.println("Constructer");
//        super();
//     }
// }




// class Test{

//    Test() {
//        this();
//        super();
//     }
// }



// class Test{

//    Test() {
//        super();
//        this();
//     }
// }




// class Test{

//    public void m1() {
//        super();
//     }
// }


// class Test
// {
//     int x=10;
// }
// class Constructer extends Test{
//     public void m1()
//     {
//        System.out.println(this);
//        System.out.println(super.hashCode());
//     }
//     public static void main(String[] args) {
//         Test t=new Test();
//         Constructer c=new Constructer();
//         c.m1();
        
//     }
// }


// class Test
// {
//     Test(double d)
//     {
//         this(10);
//         System.out.println("Double-argument constructor");
//     }
//     Test(int i)
//     {
//         this();
//         System.out.println("int-arg constructor");
//     }
//     Test()
//     {
//         System.out.println("no-arg constructor");
//     }
//     public static void main(String[] args) {
//         Test t1=new Test(10.5);
//         Test t2=new Test(10);
//         Test t3=new Test();
//         Test t4=new Test();

//     }
// }


// class Constructors
// { 

//     Constructors() {
//     }
    

// }
// class B extends Constructors{

//     B(int i) {
         
//     }
    
// }



// abstract class Parent{

//     public Parent() {
//         System.out.println(this.hashCode());
//     }
    
// }
// class Child extends Parent
// {

//     public Child() {
//         System.out.println(this.hashCode());
//     }
    
// }
// class Test{
//     public static void main(String[] args) {
//          Child c=new Child();
//          System.out.println(c.hashCode());
//     }
   
// }





// class Test{
//     public static void m1()
//     {
//         m2();
//     }
//     public static void m2()
//     {
//         m1();
//     }
//     public static void main(String []  args)
//     {
//         m1();
//         System.out.println("Hello");
//     }
// }




// class Test{

//     public Test(int i) {
//         this();
//     }

//     public Test() {
//         this(10);
//     }
//     public static void main(String[] args) {
//         System.out.println("Hello");
//     }
// }







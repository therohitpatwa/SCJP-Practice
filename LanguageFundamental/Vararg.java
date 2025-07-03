class Vararg
{
    public static void main(String[] args) {
          m1();
        m1(10,20);
        m1(10,20,30);

        
        
    }
    public static void m1(int... x)
    {
        System.out.println("I am Var-arg");
      
    }
}


// class Vararg
// {
//     public static void main(String[] args) {
//         sum();
//         sum(10,20);
//         sum(10,20,30);
        
//     }
//     public static void sum(int... x)
//     {
//         int sum=0;
//         System.out.println("The number of argument is "+x.length);
//         for(int i=0;i<x.length;i++)
//         {
//             sum=sum+x[i];
    
//         }
//         System.out.println("The total sum is "+sum);
//     }
//     void m2(int... x)
//     {

//     }
//     void m3(int ...x)
//     {

//     }
//     // void m4(int x...)
//     // {

//     // }
//     void m5(int a,int... b)
//     {

//     }
//     void m6(String s,int... x)
//     {

//     }
//     // void m7(int a,int... b,int c)
//     // {

//     // }
//     // void m8(int a,int... b,int... c)
//     // {

//     // }
//     // void m9(int... a,int b)
//     // {

//     // }


// }



// class Vararg{
//     public static void main(String[] args) {
//             m1();
//             m1(10);
//             m1(10,20);
//             m1(10,20,30);
         
//     }
//     public static void m1(int i)
//     {
//          System.out.println("General Method");
//     }
//     public static void m1(int... i)
//     {
//         System.out.println("Var-arg Method");
//     }
// }


// class Vararg{
//     public static void main(String[] args) {
        
//     }
//     public void m1(int... x)
//     {

//     }
//     public void m1(int[] x)
//     {

//     }
// }


// class Vararg{
//     public static void main(String[] args) {
//         m1(new int[]{10,20});
        
//     }
//     public static void m1(int... x)
//     {
//         System.out.println("Hello");
//     }
 
// }


// class Vararg
// {
//     public static void main(String... args) {
        
//     }
// }


// class Vararg
// {
//     public static void m1(int[]... x)
//     {
//         for(int [] a:x)
//         {
//             System.err.println(a[0]);
//         }
//     }
//     public static void main(String[] args) {
//         int[] l={10,20};
//         int[] m={30,40,50};
//         m1(l,m);

//     }
// }



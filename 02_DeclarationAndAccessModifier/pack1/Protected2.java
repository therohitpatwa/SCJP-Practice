package pack1;
class Protected2 extends Protected1
{
   public static void main(String[] args) {
       Protected1 a=new Protected1();
       a.m1();
       Protected2 b=new Protected2();
       b.m1();
       Protected1 c=new Protected2();
       c.m1();
  }
}
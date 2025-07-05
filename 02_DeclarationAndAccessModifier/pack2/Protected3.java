package  pack2;
import pack1.Protected1;

class P extends Protected1
{

}
class Protected3 extends P
{
    public static void main(String[] args) {
        Protected3 p=new Protected3();
        p.m1();
    }
}
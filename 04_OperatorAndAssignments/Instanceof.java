class Test
{
    public static void main(String[] args) {
        Thread t=new Thread();
        System.out.println(t instanceof  Thread);
        System.out.println(t instanceof Runnable);
        System.out.println(t instanceof Object);
        Object o=new Object();
        System.out.println(o instanceof String);
        System.out.println(null instanceof String);
    }
}
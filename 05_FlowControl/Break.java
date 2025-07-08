class Test{
    public static void main(String[] args) {
        int x=10;
        l1:
        {
            System.out.println("Hello");
            if(x==10)
            {
                break l1;
            }
            System.out.println("Hiii");


        }
        System.out.println("End");
    }
}
// class Test
// {
//     public static void main(String[] args) {
//         int a[]={10,20,30,40,50};
//         for(int i=0;i<a.length;i++)
//         {
//             System.out.println(a[i]);
//         }
//     }
// }



// class Test
// {
//     public static void main(String[] args) {
//         int a[]={10,20,30,40,50};
//         for(int x:a)
//         {
//             System.out.println(x);
//         }
//     }
// }




class Test
{
    public static void main(String[] args) {
        int a[][]={{10,20,30},{40,50}};
        for(int []x:a)
        {
            for(int y:x)
            {
                System.out.println(y);
            }
        }
    }
}


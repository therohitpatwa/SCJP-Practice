
class Test {

    public static void main(String[] args) {
        int x = 2;
        for (int i = 0; i < 10; i++) {
            if (i % x == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

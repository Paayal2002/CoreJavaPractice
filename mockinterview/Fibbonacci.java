package mockinterview;

class Fibbonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;

        while (b < 200) {
            if (b >= 100) {
                System.out.print(b + " ");
            }

            int next = a + b;
            a = b;
            b = next;
        }
    }
}

public class TestErr20071 {
    public static void main(String[] args) {
        int tot = 0;
        int j = 0;

        for (int i = 0; i < 10; i++) {
            tot += i;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }

        do {
            j++;
        } while (j < 10);

        while (j < 15) {
            j++;
        }

        System.out.println("Total: " + tot);
    }
}
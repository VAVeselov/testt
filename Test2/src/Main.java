public class Main {
    public static void main(String[] args) {

       /* int a = 5;
        int b = 3;

        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        System.out.println("Макс: " + result);
*/
        CalcService service = new CalcService();

        System.out.println();
        System.out.println("5 / 6");
        System.out.println(service.max(5, 6));

        System.out.println();
        System.out.println("10 / 10");
        System.out.println(service.max(10, 10));

        System.out.println();
        System.out.println("-10 / -20");
        System.out.println(service.max(-10, -20));


    }
}

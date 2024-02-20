public class spadaTommasoEs1Verifica {
    public static int sum(int num) {
        int sum = 0;
        for (int i = 0; i < num + 1; i++)
            sum += i;
        return sum;
    }

    public static int expression(int num) {
        return (num * (num + 1)) / 2;
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.print("Non valido. Compilare usando: java <nomefile> <numeromaggioredi0>\n");
            System.exit(1);
        }
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        int sumFunction = sum(num);
        int expression = (num * (num + 1)) / 2;
        int exprFunction = expression(num);

        for (int i = 0; i < num + 1; i++)
            sum += i;

        if (sum == expression)
            System.out.println("uguaglianza verificata nel main: " + sum + " = " + expression + ".");

        if (sumFunction == exprFunction)
            System.out.println("uguaglianza verificata nelle funzioni: " + sumFunction + " = " + exprFunction + ".");
    }
}
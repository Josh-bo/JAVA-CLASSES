e        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter value 1");
                int val1 = scanner.nextInt();
                System.out.println("Enter value 2");
                int val2 = scanner.nextInt();
                try {
                    int result = val1 / val2;
                    System.out.println(result);

                } catch (java.util.InputMismatchException im) {
                    System.out.println("Value 1 or 2 must be a whole number");
                } catch (java.lang.ArithmeticException ar) {
                    System.out.println("Value 2 cannot be zero");
                } catch (java.lang.Exception e) {
                    System.out.println("Unknown error occurred");
                } finally {
                    System.out.println("Iteration completed");
                }
            }
        } finally {
            scanner.close();
        }
    }
}xce
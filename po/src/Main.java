public class Main {
    public static void main(String[] args) {
        printSquare(10);
        System.out.println("------------------");
        printSquare(20);
    }

        public static void printSquare(int length){
            //for that prints width
            for(int i = 1; i <= length; i++) {
                //for that prints height
                for (int j = 1; j <= length; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
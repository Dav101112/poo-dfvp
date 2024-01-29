public class Main {
    public static void main(String[] args) {
        printSquare(10);
        System.out.println("------------------");
        printSquare(20);
        System.out.println("------------------");
        printTriangle(4);
        System.out.println("------------------");
        printTriangle(6);
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
    public static void printTriangle(int base){
        //for that prints width
        for(int x = 0; x <= base - 1; x++) {
            //for that prints height
            for (int y = 1; y <= x + 1 ; y++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    }
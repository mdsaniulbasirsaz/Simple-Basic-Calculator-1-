import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------Simple Basic Calculator--------\n");
        int n;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Trigonometry");
            System.out.println("6. Exit");
            System.out.println("Enter Your Choice:");
            n = input.nextInt();

            switch (n) {
                case 1:
                    System.out.println("------------Addition---------");
                    Addition add = new Addition();
                    System.out.println("Enter Your First Number:");
                    float a = input.nextFloat();
                    add.setA(a);
                    System.out.println("Enter Your Second Number:");
                    float b = input.nextFloat();
                    add.setB(b);
                    System.out.println("Ans = " + (add.getA() + add.getB()));
                    break;

                case 2:
                    System.out.println("------------Subtraction---------");
                    Subtruction S=new Subtruction();
                    System.out.println("Enter Your First Number:");
                     a = input.nextFloat();
                    S.setA(a);
                    System.out.println("Enter Your Second Number:");
                     b = input.nextFloat();
                    S.setB(b);
                    System.out.println("Ans = " + (S.getA() - S.getB()));
                    break;

                case 3:
                    System.out.println("------------Multiplication---------");
                    Multiplication Mul= new Multiplication();
                    System.out.println("Enter Your First Number:");
                    a = input.nextFloat();
                    Mul.setA(a);
                    System.out.println("Enter Your Second Number:");
                    b = input.nextFloat();
                    Mul.setB(b);
                    System.out.println("Ans = " + (Mul.getA() * Mul.getB()));
                    break;

                case 4:
                    System.out.println("------------Division---------");
                    Division Div=new Division();
                    System.out.println("Enter Your First Number:");
                    a = input.nextFloat();
                    Div.setA(a);
                    System.out.println("Enter Your Second Number:");
                    b = input.nextFloat();
                    Div.setB(b);
                    System.out.println("Ans = " + (Div.getA() / Div.getB()));
                    break;

                case 5:
                    System.out.println("------------Trigonometry---------");
                    Trigonometry tri=new Trigonometry();
                    System.out.println("1. Tan");
                    System.out.println("2. Sin");
                    System.out.println("3. Cos");
                    System.out.println("4. Sec");
                    System.out.println("5. Cosec");
                    System.out.println("6. Exit");
                    System.out.println("Choice Your Operator:");
                    int x= input.nextInt();
                    switch (x) {
                        case 1:
                            System.out.println("------------Tan---------");
                            Trigonometry tan = new Trigonometry();
                            System.out.println("Enter the angle in degrees:");
                            float angle = input.nextFloat();
                            tan.setA(angle);
                            double result = Math.tan(Math.toRadians(angle));
                            System.out.println("Tan(" + angle + ") = " + result);
                            break;

                        case 2:
                            System.out.println("------------Sin---------");
                            Trigonometry sin = new Trigonometry();
                            System.out.println("Enter the angle in degrees:");
                            angle = input.nextFloat();
                            sin.setA(angle);
                            result = Math.sin(Math.toRadians(angle));
                            System.out.println("Sin(" + angle + ") = " + result);
                            break;

                        case 3:
                            System.out.println("------------Cos---------");
                            Trigonometry cos = new Trigonometry();
                            System.out.println("Enter the angle in degrees:");
                            angle = input.nextFloat();
                            cos.setA(angle);
                            result = Math.cos(Math.toRadians(angle));
                            System.out.println("Cos(" + angle + ") = " + result);
                            break;

                        case 4:
                            System.out.println("------------Sec---------");
                            Trigonometry sec = new Trigonometry();
                            System.out.println("Enter the angle in degrees:");
                            angle = input.nextFloat();
                            sec.setA(angle);
                            result = 1 / Math.cos(Math.toRadians(angle));
                            System.out.println("Sec(" + angle + ") = " + result);
                            break;

                        case 5:
                            System.out.println("------------Cosec---------");
                            Trigonometry cosec = new Trigonometry();
                            System.out.println("Enter the angle in degrees:");
                            angle = input.nextFloat();
                            cosec.setA(angle);
                            result = 1 / Math.sin(Math.toRadians(angle));
                            System.out.println("Cosec(" + angle + ") = " + result);
                            break;

                        case 6:
                            System.out.println("Exiting...");
                            break;

                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                            break;
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (n != 6);
    }
}

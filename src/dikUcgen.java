import java.util.Scanner;

public class dikUcgen {

    public static void main(String[] args) {
        double dikKenar1, dikKenar2, hipotenus;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci dik kenar uzunluğunu giriniz: ");
        dikKenar1 = input.nextDouble();
        System.out.println("Lütfen ikinci dik kenar uzunluğunu giriniz: ");
        dikKenar2 = input.nextDouble();

        hipotenus = Math.sqrt((dikKenar1 * dikKenar1) + (dikKenar2 * dikKenar2));
        System.out.println("Hipotenüs Uzunluğunuz: " + hipotenus);

    }
}


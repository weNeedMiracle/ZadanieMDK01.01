public class Reshenie {
    public void R1(String a, int parse) {
        if (parse == 8) {
            int Decimal = Integer.parseInt(a, 8);
            System.out.println("Number in octal system: " + a + ", number in binary system: " + Integer.toBinaryString(Decimal) + ", number in decimal number: " + Decimal + ", number in hexadecimal system: " + Integer.toHexString(Decimal));
        } else if (parse == 16) {
            int Decimal = Integer.parseInt(a, 16);
            System.out.println("Number in hexadecimal system: " + a + ", number in binary system: " + Integer.toBinaryString(Decimal) + ", number in octal number: " + Integer.toOctalString(Decimal) + ", number in decimal system: " + Decimal);
        }
    }
}

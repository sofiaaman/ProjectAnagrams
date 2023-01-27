public class Main {
    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        System.out.print("Enter string: ");
        String str = reverseString.getStr();
        String[] splitStr = reverseString.splitStr(str);

        System.out.println("Reverse string: ");
        reverseString.printStr(splitStr);
    }
}

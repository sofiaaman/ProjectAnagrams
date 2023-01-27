import java.util.Scanner;

public class ReverseString {

    String str;

    public String getStr() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public StringBuilder reverseString(String s) {
        int pos = 0;
        StringBuilder revStr = new StringBuilder(s);

        //создадим пока строку, где только не-буквы. Где были буквы, поставим пробел
        for (int i = 0; i <= s.length() - 1; i++) {
            boolean b = Character.isLetter(s.charAt(i));
            if (!b) {
                revStr.setCharAt(i, s.charAt(i)); // переносим в revStr только не-буквы
            } else {
                revStr.setCharAt(i, ' ');
            }
        }
        //теперь инвертируем только строку из букв
        for (int i = s.length() - 1; i >= 0; i--) {
            //очередной символ - буква
            if (Character.isLetter(s.charAt(i))) {
                //ищем первое пустое место
                while (revStr.charAt(pos) != ' ') {
                    pos++;
                }
                revStr.setCharAt(pos, s.charAt(i));    //нашли пустое место, тогда переносим
            }
        }
        return revStr;
    }

    public void printStr(String[] splitStr) {
        for (int i = 0; i <= splitStr.length - 1; i++) {
            StringBuilder reverseStr = reverseString(splitStr[i]);
            if (i < splitStr.length - 1) {
                System.out.print(reverseStr + " ");
            } else {
                System.out.print(reverseStr);
            }
        }
    }

    public String[] splitStr(String str) {
        return str.split("\\s+");
    }
}

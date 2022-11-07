import java.io.IOException;

public class Input {
    public static char input(char[] arr) throws IOException {
        for (int i = 0; i < arr.length; i++) { // проверка ввода
            if (!(arr[i] >= 48 && arr[i] <= 57) && arr[i] != 'I' && arr[i] != 'V' && arr[i] != 'X' && arr[i] != '-' && arr[i] != '+' && arr[i] != '*' && arr[i] != '/') {// проверка ввода
                throw new IOException();// проверка ввода
            }// проверка ввода
            if (arr[0] == 48 || arr[0] == 43 || arr[0] == 45 || arr[0] == 42 || arr[0] == 47) {// проверка ввода
                throw new IOException();// проверка ввода
            }// проверка ввода
        }
        return 0;
    }

}

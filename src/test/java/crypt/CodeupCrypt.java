package crypt;

public class CodeupCrypt {
    public static String hash = "";

    public String hashPassword(String password) {
        hash = "";
        for (int i = 0; i < password.length(); i++) {
            switch (password.charAt(i)) {
                case 'a':
                case 'A':
                    hash += '4';
                    break;
                case 'e':
                case 'E':
                    hash += '3';
                    break;
                case 'i':
                case 'I':
                    hash += '1';
                    break;
                case 'o':
                case 'O':
                    hash += '0';
                    break;
                case 'u':
                case 'U':
                    hash += '9';
                    break;
                default:
                    hash += password.charAt(i);
            }
        }
        return hash;
    }

    public boolean checkPassword(String password, String hash) {
        return hashPassword(password).equals(hash);
    }
}

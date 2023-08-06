package pwd;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i < ip.length(); i ++){
            sb.append((char) (ip.charAt(i) - 1));
        }
        System.out.println(sb);
    }
}

package test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for(int i=0;i<2;i++){
            list.add(scanner.nextLine());

        }
        char []c = {'E','A','S','Y'};
        for (String s : list) {
            int flag = 0;
            for(int i=0;i<s.length();i++){
                if(c[flag] == s.charAt(i)){
                    flag++;
                }

                if(flag == 4){
                    System.out.println("easy");
                    break;
                }
            }
            if(flag != 4){
                System.out.println("difficult");
            }
        }

    }
}

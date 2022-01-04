import java.util.Scanner;

public class read_number_to_word {
    public static void main(String[] args) {
        System.out.println("nhập số từ 1 đến 20:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        String word="";
        switch (number) {
            case 0: {
                word = "zero";
                break;
            }
            case 1: {
                word = "one";
                break;
            }
            case 2: {
                word = "two";
                break;
            }
            case 3: {
                word = "three";
                break;
            }
            case 4: {
                word = "four";
                break;
            }
            case 5: {
                word = "five";
                break;
            }
            case 6: {
                word = "six";
                break;
            }
            case 7: {
                word = "seven";
                break;
            }
            case 8: {
                word = "eight";
                break;
            }
            case 9: {
                word = "nine";
                break;
            }
            case 10: {
                word = "ten";
                break;
            }
            case 11: {
               word = "eleven";
                break;
            }
            case 12: {
                word = "twelve";
                break;
            }
            case 13: {
                word = "thirteen";
                break;
            }
            case 14: {
                word = "fourteen";
                break;
            }
            case 15: {
                word = "fifteen";
                break;
            }
            case 16: {
                word = "sixteen";
                break;
            }
            case 17: {
                word = "seventeen";
                break;
            }
            case 18: {
                word = "eighteen";
                break;
            }
            case 19: {
                word = "nineteen";
                break;
            }
            case 20: {
                word = "twenty";
                break;
            }
            default: {
                System.out.println("out of ability");
            }
        }
        System.out.println(word);
    }
}

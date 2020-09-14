import java.util.Arrays;
public class Encrypter {
    public String encrypt(String input) {
        int converted_num = convert(input);
        int[] array1 = calculation(converted_num);
        array1 = swap(array1);
        String dig1 = Integer.toString(array1[0]);
        String dig2 = Integer.toString(array1[1]);
        String dig3 = Integer.toString(array1[2]);
        String dig4 = Integer.toString(array1[3]);
        String final_encryption = dig1 + dig2 + dig3 + dig4;
        return final_encryption;
    }
    public int convert(String input){
        return Integer.parseInt(input);
    }

    /* this helper function does Step 1
    aka adding each digit by 7, dividing that by 10, and
    replacing each digit with its remainder */
    public int [] calculation(int converted_num){
        int digit1, digit2, digit3, digit4;
        digit1 = converted_num / 1000;
        digit1 = digit1 + 7;
        digit1 = digit1 % 10;
        digit2 = converted_num / 100;
        digit2 = digit2 % 10;
        digit2 = digit2 + 7;
        digit2 = digit2 % 10;
        digit3 = converted_num / 10;
        digit3 = digit3 % 10;
        digit3 = digit3 + 7;
        digit3 = digit3 % 10;
        digit4 = converted_num % 10;
        digit4 = digit4 + 7;
        digit4 = digit4 % 10;
        int [] array2 = new int[4];
        array2[0] = digit1;
        array2[1] = digit2;
        array2[2] = digit3;
        array2[3] = digit4;
        return array2;
    }

    /* this helper function swaps the first digit
    with the third and swaps the second digit
    with the fourth */
    public int [] swap (int[] array1){
        int tmp;
        tmp = array1[2];
        array1[2] = array1[0];
        array1[0] = tmp;
        tmp = array1[3];
        array1[3] = array1[1];
        array1[1] = tmp;
        return array1;
    }
}


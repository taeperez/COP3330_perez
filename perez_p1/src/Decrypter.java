public class Decrypter {
    public String decrypt(String input) {

        char [] ch_array = input.toCharArray(); // converts string to char array

        int [] int_array = convert(ch_array);

        int_array = swap(int_array);

        String original = calculation (int_array);

        return original;
    }

    // converts characters from string to integer digits

    public int [] convert(char [] ch_array) {

        char ch_digit1, ch_digit2, ch_digit3, ch_digit4;
        ch_digit1 = ch_array[0];
        ch_digit2 = ch_array[1];
        ch_digit3 = ch_array[2];
        ch_digit4 = ch_array[3];

        int num_digit1 = Integer.parseInt(String.valueOf(ch_digit1));
        int num_digit2 = Integer.parseInt(String.valueOf(ch_digit2));
        int num_digit3 = Integer.parseInt(String.valueOf(ch_digit3));
        int num_digit4 = Integer.parseInt(String.valueOf(ch_digit4));

        int [] int_array = new int[4];
        int_array[0] = num_digit1;
        int_array[1] = num_digit2;
        int_array[2] = num_digit3;
        int_array[3] = num_digit4;

        return int_array;
    }
    /* swaps the first digit
    with the third and swaps the second digit
    with the fourth */

    public int [] swap(int [] int_array){

        int [] swapped = new int [4];
        swapped[0] = int_array[2];
        swapped[1] = int_array[3];
        swapped[2] = int_array[0];
        swapped[3] = int_array[1];

        return swapped;
    }

    // performs inverse of encryption method

    public String calculation (int [] int_array){

        int digit1, digit2, digit3, digit4;
        digit1 = int_array[0];
        digit2 = int_array[1];
        digit3 = int_array[2];
        digit4 = int_array[3];

        digit1 =  digit1 + 10;
        digit1 = digit1 - 7;
        digit1 = digit1 % 10;

        digit2 = digit2 + 10;
        digit2 = digit2 - 7;
        digit2 = digit2 % 10;

        digit3 = digit3 + 10;
        digit3 = digit3 - 7;
        digit3 = digit3 % 10;

        digit4 = digit4 + 10;
        digit4 = digit4 - 7;
        digit4 = digit4 % 10;

        String d1 = Integer.toString(digit1);
        String d2 = Integer.toString(digit2);
        String d3 = Integer.toString(digit3);
        String d4 = Integer.toString(digit4);

        return (d1 + d2 +d3 + d4);
    }
}

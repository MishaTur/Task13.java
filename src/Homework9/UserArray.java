package Homework9;

public class UserArray {
    public static int[] Add(int[] array, int value)
    {
        Array.Resize<int>(ref array, array.Length + 1);
        for (int i = array.Length-2; i>=0 ; i--)
            array[i + 1] = array[i];
        array[0] = value;
        return array;
    }
}

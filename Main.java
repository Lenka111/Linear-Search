//Elena Voinu
public class Main {
    public static void main(String[] args) {
        int [] array = {12, 5, 67, 3, 4, 9};
        int result = linearSearch(array, 9);

        if(result == -1){
            System.out.println("Number not in the array");
        }
        else
            System.out.println("Found number at index " + result);
    }

    // array to be searched, num = the value we are looking for
    public static int linearSearch(int[]array, int num)
    {
        for(int i = 0; i < array.length; i++){
            if(array[i] == num) {
                return (i);
            }
        }
        return -1;

    }
}

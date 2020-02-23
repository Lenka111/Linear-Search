//Elena Voinu
public class Main {
    public static void main(String[] args) {
        
        int [] array = {12, 5, 67, 3, 4, 9};
        //search in the array for number 9.
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
        //loop through the array 
        for(int i = 0; i < array.length; i++){
            //if number found 
            if(array[i] == num) {
                //return the index it's at
                return (i);
            }
        }
        // return -1 when number is not found in the array
        return -1;

    }
}

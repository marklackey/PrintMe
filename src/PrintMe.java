class PrintMe {
    public void printNumbers(int[] numbers) {
       for(int number: numbers){
           printMe(number);
       }

       for(int i=0; i < numbers.length; i++){
           printMe(numbers[i]);
       }
    }
    private static void printMe(int val) {
        System.out.println(val);
    }
}
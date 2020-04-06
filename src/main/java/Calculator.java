public class Calculator {
     public static int add(int num1 , int num2)
    {
        return num1+num2;
    }
    public static int add(int... nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length;i++)
            sum += nums[i];
        return sum;
    }
    public static int multiply(int num1 , int num2){
        return num1 * num2;

    }
    public static int multiply(int... nums){
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            product *= nums[i];

        }
        return product;

    }
}

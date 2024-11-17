class TestStatic
{
    static int num1 = 10;
    static int result;
    static void test(int num2)

    {   
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        System.out.println("Result = " + result);
    }

    static 
    {
        System.out.println("Block initialised after num1 is set.");
        result = num1 * 20;
    }
    public static void main(String[] args) {
        test(80);
    }
}
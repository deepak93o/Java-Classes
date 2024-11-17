class Demo
{
    void check()
    {
        System.out.println("No parameters in method check()");
    }

    void check(int sum)
    {
        System.out.println("sum :" + sum);
    }

    void check(int sum, int count)
    {
        System.out.println("sum and count :" +sum + " " + count);
    }

    double check(double sum)
    {
        System.out.println("Double sum: " +sum);
        return sum*sum;
    }
}

class Oload
{
    public static void main(String[] args) {
        
        Demo ob = new Demo();
        double result;

        ob.check();
        ob.check(100);
        ob.check(100, 200);
        result = ob.check(2.0);
        System.out.println("Result of ob.check(2.0) :" + result);
    }
}
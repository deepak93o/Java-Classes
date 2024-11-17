abstract class bike {
    abstract void run();

}

class Honda4 extends bike {
   @Override
    void run() {
        System.out.println("Honda 4 running...");
    }
    public static void main(String args[]) {
        bike obj = new Honda4();
        obj.run();
    }

}
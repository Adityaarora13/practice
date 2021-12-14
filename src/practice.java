class Mythread extends Thread
{
    public void run()
    {
        System.out.println("i am thread 1");

    }
}
class Mythread2 extends Thread
{
    public void run()
    {
        System.out.println("i am thread 2");
    }
}
public class practice {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();

    }
}

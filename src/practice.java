class Mythread implements Runnable
{
    public void run()
    {
        while(true) {
            System.out.println("good morning");
        }


    }
}
class Mythread2 implements Runnable
{
    public void run()
    {
        while(true) {
            System.out.println("welcome");
        }

    }
}
public class practice {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Thread a1 = new Thread(t1);
        Mythread2 t2 = new Mythread2();
        Thread a2 = new Thread(t2);
        a1.start();
        a2.start();

    }
}

package bai10;

public class video61 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello from a thread");
    }
    public static void main(String[] args) {
        (new video61()).start();
        System.out.println("run video 61");
}

}

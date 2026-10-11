//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String error = null;

    public static String main(String[] args) {
        try {
            System.out.println("--Start --");
            AsyncService.futureMethod();
            System.out.println("Do something");
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            return e.getMessage();
        }

        return null;
    }
}
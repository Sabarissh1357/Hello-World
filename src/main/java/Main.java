public class Main {
    public static void main(String[] args) {

        MessageManager manager = new MessageManager();

        manager.create(new Message(1, "Hello world"));

        System.out.println("STATUS:FINISHED");
        System.out.println(manager.readAll().get(0).getText());
    }
}
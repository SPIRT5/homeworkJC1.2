public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start(); // Выведет: Task 0 is done ... Task 99 is done
    }
}

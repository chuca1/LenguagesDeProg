


public class ProducerConsumer {

    public static void main(String[] args) {
        
        Buffer buffer = new Buffer();
        
        Producer producer = new Producer(buffer, 1);
        producer.start();
        
        Consumer consumer = new Consumer(buffer, 1);
        consumer.start();
    }
    
}

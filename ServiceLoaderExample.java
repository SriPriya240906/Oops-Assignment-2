package em;

import java.util.ServiceLoader;

public class ServiceLoaderExample {
    public static void main(String[] args) {
    	System.out.println("-----> Sri Priya Dharshini M );<------");
    	System.out.println("Reg No:2117240020364");
        ServiceLoader<MessageService> loader = ServiceLoader.load(MessageService.class);

        for (MessageService service : loader) {
            service.sendMessage("Hello from ServiceLoader!");
        }
    }
}


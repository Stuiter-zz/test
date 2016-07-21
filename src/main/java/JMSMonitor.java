import javax.jms.*;
import javax.naming.*;

	/** TODO
		- lookup the connection factory via a JNDI lookup
	*/

class JMSMonitor {

	public static void main(String[] args) {

//	public class ConnectJMS {
		 String serverUrl = "tcp://localhost:7222";
	//	private String userName = "admin";
		//private String password = "";
		

		// Dynamically Creating Connection Factories (page 371)
		/* Normally client applications use JNDI to look up a Connection Factory object.
		However, some situations require clients to connect to the server directly. To
		connect to the EMS server directly, the application must dynamically create a
		connection factory. */
		ConnectionFactory factory = new com.tibco.tibjms.TibjmsConnectionFactory(serverUrl);
//	}

		// Setting Connection Attempts, Timeout and Delay Parameters (page 372)
/*
		factory.setConnAttemptCount(10);
		factory.setConnAttemptDelay(1000);
		factory.setConnAttemptTimeout(1000);
*/

		// A connection with the EMS server is defined by the Connection object obtained from a Connection Factory (page 374)
//		Connection connection = factory.createConnection(userName,password);

		// Starting, Stopping and Closing a Connection

		// Creating a Session (page 376)
		/* A Session is a single-threaded context for producing or consuming messages. You
		create Message Producers or Message Consumers using Session objects. A Session
		can be transactional to enable a group of messages to be sent and received in a
		single transaction. A non-transactional Session can define the acknowledge mode
		of message objects received by the session. */
		// To create a Session that uses the default AUTO_ACKNOWLEDGE session mode
//		Session session = connection.createSession();
		
		// The EMS extended session modes, such as NO_ACKNOWLEDGE, require that you include the com.tibco.tibjms.Tibjms constant when you specify the EMS session mode.
			//Session session = connection.createSession(
			//	com.tibco.tibjms.Tibjms.NO_ACKNOWLEDGE);

		System.out.println("Hello World!"); // Display the string.
    }
}
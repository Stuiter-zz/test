import com.tibco.tibjms.admin.QueueInfo;
import com.tibco.tibjms.admin.TibjmsAdmin;
import com.tibco.tibjms.admin.TibjmsAdminException;

class JMSMonitor {

	public static void main(String[] args) {

		 String serverUrl = "tcp://vdtwintmp000001:7222";
		 String userName = "admin";
		 String password = "";
		
		TibjmsAdmin admin;
		try {
			admin = new TibjmsAdmin(serverUrl,userName,password);

			QueueInfo[] queueInfo = admin.getQueues();

			for(int i = 0;i < queueInfo.length; i++){
				System.out.println(queueInfo[i]);				
			}
		} catch (TibjmsAdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Einde bereikt.");
    }
}
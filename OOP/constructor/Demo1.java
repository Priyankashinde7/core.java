abstract class JDBCInterface    // RBI 
{
	abstract void save(); 
	abstract void delete();
	abstract void update();
	void notification() {
		System.out.println("Notification sent!!");
	}
}

abstract class MySql extends JDBCInterface {
	void save() {
		System.out.println("1 row inserted");
	}
	void delete() {
		System.out.println("1 row deleted");
	}
	abstract void update();
}

class MySqlConnector extends MySql {
	void update() {
		System.out.println("1 row updated");
	}

}
class Demo1 { // Bank creator
	public static void main(String args[]) {
		JDBCInterface Ji = new MySqlConnector();
		Ji.save();
		Ji.delete();
		Ji.update();
		Ji.notification();
	}
}

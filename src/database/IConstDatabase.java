package database;

public interface IConstDatabase {

	String URL = new String("jdbc:mysql://localhost:3306/mediateka");
	String CLIENT_NAME = new String("root");
	String CLIENT_PASSWORD = new String("Nikita09061999");
	String SQL_INSERT_USER = new String("INSERT INTO user(name, surname, birth_day, birth_month, birth_year,"
			+ " sex, login, password) VALUES(?,?,?,?,?,?,?,?)");
	String SQL_INSERT_IMAGE = new String("INSERT INTO images(user_id, image_path) VALUES(?,?)");
	String SQL_SELECT_USER = new String("SELECT * FROM user ");
	String SQL_SELECT_IMAGE = new String("SELECT * FROM images ");
	String SQL_DELETE_FROM_USER = new String("DELETE FROM user ");
	String SQL_DELETE_FROM_IMAGES = new String("DELETE FROM images "); 

}

package java28;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	public List<Student> getAllStudents() {
		List<Student> list = new ArrayList<Student>();
		String sql = "SELECT * FROM students";
		try {
			PreparedStatement statement = MySQLConnection.getConnection().prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getString("student_id"), rs.getString("student_name"), rs.getInt("age")));
			}
			rs.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Student getStudentById(String id) {
		Student found = null;
		String sql = "SELECT * FROM students WHERE student_id = ?";
		try {
			PreparedStatement statement = MySQLConnection.getConnection().prepareStatement(sql);
			statement.setString(1, id);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {
				found = new Student(rs.getString("student_id"), rs.getString("student_name"), rs.getInt("age"));
			}
			rs.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return found;
	}
	
	public boolean addStudent(Student student) {
		String sql = "INSERT INTO students (student_id, student_name, age) VALUES (?, ?, ?)";
		try {
			PreparedStatement statement = MySQLConnection.getConnection().prepareStatement(sql);
			statement.setString(1, student.getId());
			statement.setString(2, student.getName());
			statement.setInt(3, student.getAge());
			int result = statement.executeUpdate();
			statement.close();
			return result != 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateStudent(Student student) {
		String sql = "UPDATE students SET student_name = ?, age = ? WHERE student_id = ?";
		try {
			PreparedStatement statement = MySQLConnection.getConnection().prepareStatement(sql);
			statement.setString(1, student.getName());
			statement.setInt(2, student.getAge());
			statement.setString(3, student.getId());
			int result = statement.executeUpdate();
			statement.close();
			return result != 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean removeStudentById(String id) {
		String sql = "DELETE FROM students WHERE student_id = ?";
		try {
			PreparedStatement statement = MySQLConnection.getConnection().prepareStatement(sql);
			statement.setString(1, id);
			int result = statement.executeUpdate();
			statement.close();
			return result != 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
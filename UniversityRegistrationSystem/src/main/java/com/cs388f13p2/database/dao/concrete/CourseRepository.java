package com.cs388f13p2.database.dao.concrete;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cs388f13p2.database.connection.DBHelper;
import com.cs388f13p2.model.course.Course;

public class CourseRepository {
	
	private static class SingletonHolder { 
		public static final CourseRepository INSTANCE = new CourseRepository();
	}

	public static CourseRepository getInstance() {

		return SingletonHolder.INSTANCE;
	}
	
	private CourseRepository() {
		
	}
	
	private void createCourseTable(final Statement st) throws SQLException {
		final String createTableStatement = "CREATE TABLE Course(" +
				"department VARCHAR(20) NOT NULL, " +
				"courseNumber smallint NOT NULL, " +
				"cost DOUBLE NOT NULL, " +
				"courseDescription VARCHAR(100) NOT NULL, " +
				"PRIMARY KEY (department, courseNumber), " +
				"KEY (courseNumber)" +
				") Engine=InnoDB;";
		st.execute(createTableStatement);
	}
	
	private void databaseCreationCheck(final DatabaseMetaData dbm, 
			final Statement st) throws SQLException {
		final ResultSet tables = dbm.getTables(null, null, "Course", null);
		if (!tables.next()) {
			// Table does not exist
			createCourseTable(st);
		}
	}

	public void add(final Course obj) throws SQLException {
		
		final Connection c = DBHelper.getConnection();
		final Statement st = c.createStatement();

		databaseCreationCheck(c.getMetaData(), st);

		final String insertStudentStatement = "INSERT INTO Course(department, courseNumber, " +
				"cost, courseDescription)" + " VALUES('" + obj.getDepartment() + "', " + 
				obj.getCourseNumber() + ", " + obj.getCost() + ", '" + 
				obj.getCourseDescription() + "');";

		st.execute(insertStudentStatement);
	}

	public Course findById(final String department, final short courseNumber)
			throws SQLException {
		
		final Connection c = DBHelper.getConnection();
		final Statement st = c.createStatement();

		databaseCreationCheck(c.getMetaData(), st);
		
		// TODO marcellin
		return null;
	}

	public boolean delete(final String department, final short courseNumber)
			throws SQLException {
		
		final Connection c = DBHelper.getConnection();
		final Statement st = c.createStatement();

		databaseCreationCheck(c.getMetaData(), st);
		
		// TODO marcellin
		return false;
	}
}
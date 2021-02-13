package main;

import java.sql.*;


public class SQLiteConnect {
	private static String url = "jdbc:sqlite:Progress.db";
	private static Connection conn = null;
	
	
	/**
	 * Creates default database
	 * @param args
	 */
	public static void main(String[] args) {
		connect();
	}
	
	/**
	 * Connects to database file
	 * @return
	 */
	public static Connection connect() {
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return conn;
	}
	
	
	
	/**
	 * Updates all values in database with given parameters
	 *@param columns
	 */
	public void updateAll( String[] columns) {
		String sql = "UPDATE Progress SET"
				+ "	Turn = ? ,"
				+ " Playing = ? ,"
				+ " Tutorial = ? ,"
				+ " PositionX = ? ,"
				+ " PositionY = ? ,"
				+ " Points1 = ? ,"
				+ "	Points2 = ?";
		try {
			PreparedStatement input = connect().prepareStatement(sql);
			input.setString(1, columns[0]);
//			input.setInt(2, playing);
//			input.setInt(3, tutorial);
//			input.setInt(4, positionX);
//			input.setInt(5, positionY);
//			input.setInt(6, points1);
//			input.setInt(7, points2);
//			input.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Updates volume in database with a given parameter
	 * @param volume
	 */
	public void updateVolume(int volume) {
		String sql = "UPDATE Progress SET Volume = " + volume;
		try {
			PreparedStatement input = connect().prepareStatement(sql);
			input.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Returns value of volume from database
	 * @return
	 */
	public int volume() {
		String sql = "SELECT Volume FROM Progress";
		int volumeData = 0;
		try {
			Statement stmt = connect().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			volumeData = rs.getInt("Volume");
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return volumeData;
	}
	
	/**
	 * Returns value of turn from database
	 * @return
	 */
	public int turn() {
		String sql = "SELECT Turn FROM Progress";
		int turnData = 0;
		try {
			Statement stmt = connect().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			turnData = rs.getInt("Turn");
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return turnData;
	}
	
	/**
	 * Returns value of playing from database
	 * @return
	 */
	public int playing() {
		String sql = "SELECT Playing FROM Progress";
		int turnData = 0;
		try {
			Statement stmt = connect().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			turnData = rs.getInt("Playing");
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return turnData;
	}
	
	/**
	 * Returns value of tutorial from database
	 * @return
	 */
	public int tutorial() {
		String sql = "SELECT Tutorial FROM Progress";
		int turnData = 0;
		try {
			Statement stmt = connect().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			turnData = rs.getInt("Tutorial");
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return turnData;
	}
	
	/**
	 * Returns value of positionX from database
	 * @return
	 */
	public int positionX() {
		String sql = "SELECT PositionX FROM Progress";
		int xData = 0;
		try {
			Statement stmt = connect().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			xData = rs.getInt("PositionX");
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return xData;
	}
	
	/**
	 * Returns value of positionY from database
	 * @return
	 */
	public int positionY() {
		String sql = "SELECT PositionY FROM Progress";
		int yData = 0;
		try {
			Statement stmt = connect().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			yData = rs.getInt("PositionY");
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return yData;
	}
	
	/**
	 * Returns value of points1 from database
	 * @return
	 */
	public int points1() {
		String sql = "SELECT Points1 FROM Progress";
		int point1Data = 0;
		try {
			Statement stmt = connect().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			point1Data = rs.getInt("Points1");
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return point1Data;	}
	
	/**
	 * Returns value of points 2 from database
	 * @return
	 */
	public int points2() {
		String sql = "SELECT Points2 FROM Progress";
		int point2Data = 0;
		try {
			Statement stmt = connect().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			point2Data = rs.getInt("Points2");
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return point2Data;
	}
}

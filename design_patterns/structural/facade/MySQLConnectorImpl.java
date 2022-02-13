/**
 * 
 */
package structural.facade;

/**
 * @author utkarsh
 *
 */
public class MySQLConnectorImpl {

	/**
	 * Returns the MySQL Connection
	 * 
	 * @return
	 */
	public void getMySQLConnection() {
		System.out.println("MySQL Connection");
	}

	/**
	 * Genereate PDF Report
	 * 
	 * @param connection
	 * @return
	 */
	public void getMySQLPDFEport(String tableName) {
		System.out.println("MySQL pdf report generated " + tableName);
	}

	/**
	 * Generate HTML Report
	 * 
	 * @param connection
	 * @return
	 */
	public void getMySQLHTMLREport(String tableName) {
		System.out.println("MySQL html report generated " + tableName);
	}
}

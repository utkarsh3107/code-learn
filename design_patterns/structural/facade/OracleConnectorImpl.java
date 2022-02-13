package structural.facade;

public class OracleConnectorImpl {

	/**
	 * Returns the Oracle Connection
	 * 
	 * @return
	 */
	public void getOracleConnection() {
		System.out.println("Oracle Connection");
	}

	/**
	 * Genereate PDF Report
	 * 
	 * @param connection
	 * @return
	 */
	public void getOraclePDFEport(String tableName) {
		System.out.println("Oracle pdf report generated "+ tableName);
	}

	/**
	 * Generate HTML Report
	 * 
	 * @param connection
	 * @return
	 */
	public void getOracleHTMLREport(String tableName) {
		System.out.println("Oracle html report generated " + tableName);
	}
}

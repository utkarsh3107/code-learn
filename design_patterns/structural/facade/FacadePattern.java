package structural.facade;

public class FacadePattern {

	public static enum DBType {
		MYSQL, ORACLE
	};

	public static enum ReportType {
		PDF, HTML
	};

	public void generateReport(DBType db, ReportType report, String tableName) {

		switch (db) {

		case MYSQL:
			MySQLConnectorImpl mysql = new MySQLConnectorImpl();
			mysql.getMySQLConnection();
			switch (report) {
			case PDF:
				mysql.getMySQLPDFEport(tableName);
				break;
			case HTML:
				mysql.getMySQLHTMLREport(tableName);
				break;
			default:
				System.out.println("Cannot generate MySql report");
			}
			break;

		case ORACLE:
			OracleConnectorImpl oracle = new OracleConnectorImpl();
			oracle.getOracleConnection();
			switch (report) {
			case PDF:
				oracle.getOraclePDFEport(tableName);
				break;
			case HTML:
				oracle.getOracleHTMLREport(tableName);
				break;
			default:
				System.out.println("Cannot generate Oracle report");
			}
			break;

		default:
			System.out.println("Cannot find DB");
		}

	}

}

package structural.facade;

import structural.facade.FacadePattern.DBType;
import structural.facade.FacadePattern.ReportType;

public class Test {

	public static void main(String[] args) {
		MySQLConnectorImpl mysql = new MySQLConnectorImpl();
		mysql.getMySQLConnection();
		mysql.getMySQLHTMLREport("xyz");
		
		System.out.println("--------------------------");
		
		OracleConnectorImpl oracle = new OracleConnectorImpl();
		oracle.getOracleConnection();
		oracle.getOraclePDFEport("qwe");
		
		System.out.println("---------------------------");
		
		FacadePattern pattern = new FacadePattern();
		
		pattern.generateReport(DBType.MYSQL, ReportType.PDF, "xyz");
		pattern.generateReport(DBType.ORACLE, ReportType.HTML, "qwe");
	}

}

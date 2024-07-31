package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OracleReportDaoImpl implements ReportDao {

	public OracleReportDaoImpl() {
		System.out.println("oracleReportDaoImpl :: Constructor..");
	}

	@Override
	public String findData() {
		System.out.println("Fetching report from oracle Db..");
		return "Report Data";
	}

}

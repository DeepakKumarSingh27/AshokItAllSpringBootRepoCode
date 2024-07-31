package in.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MysqlReportDaoImpl implements ReportDao {

	public MysqlReportDaoImpl() {
		System.out.println("MysqlReportDaoImpl :: Constructor..");
	}

	@Override
	public String findData() {
		System.out.println("Fetching report from mysql Db..");
		return "Report Data";
	}

}

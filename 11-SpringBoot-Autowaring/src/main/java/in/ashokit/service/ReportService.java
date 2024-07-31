package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;

@Service
public class ReportService {

	@Autowired
	private ReportDao reportDao;

//	@Autowired
////	@Qualifier("oracle")
//	public void setReportDao(ReportDao reportDao) {
//		System.err.println("set ReportDao method is called..");
//		this.reportDao = reportDao;
//	}
//	
//	public ReportService() {
//		System.err.println("ReportService :: 0 parm Constructor..");
//	}

	/*
	 * @Autowired public ReportService(ReportDao reportDao) {
	 * System.out.println("ReportDao :: param Constructor called...");
	 * this.reportDao = reportDao; }
	 */

	public void generateReport() {
		reportDao.findData();
		System.err.println("generating report ....");
	}
}

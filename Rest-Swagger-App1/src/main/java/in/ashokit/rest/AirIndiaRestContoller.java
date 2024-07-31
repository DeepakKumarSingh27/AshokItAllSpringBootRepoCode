package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.PassengerInfo;
import in.ashokit.responce.TicketInfo;

@RestController
public class AirIndiaRestContoller {

	@PostMapping("/bookFlightTicket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody 
			PassengerInfo pinfo) {
		// logic to book ticket

		// send ticket info
		TicketInfo ticket = new TicketInfo();

		ticket.setName(pinfo.getFname() + " " + pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketStatus("Confirmed");
		ticket.setTicketPrice("45000.00 INR");
		ticket.setJourneyDate(pinfo.getJourneyData());
		return new ResponseEntity<TicketInfo>(ticket, HttpStatus.CREATED);
	}
}

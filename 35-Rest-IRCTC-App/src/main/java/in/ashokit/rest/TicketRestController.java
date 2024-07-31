package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.PassengerInfo;
import in.ashokit.binding.TicketInfo;

@RestController
public class TicketRestController {

	@GetMapping("ticket/{ticketId}")
	public ResponseEntity<TicketInfo> getTicket(@PathVariable Integer ticketId) {
		// logic to delete ticket
		TicketInfo tInfo = new TicketInfo();
		tInfo.setTicketId(1234);
		tInfo.setPnr("123456789");
		tInfo.setTicketStatus("Conformed");

		return new ResponseEntity<>(tInfo, HttpStatus.OK);
	}

	@PostMapping(value = "/ticket", produces = { "application/json" },
			consumes = { "application/json" })
	public ResponseEntity<TicketInfo> addBook(@RequestBody PassengerInfo request) {
		System.out.println(request);
		// logic to get Ticket data
		TicketInfo tInfo = new TicketInfo();
		tInfo.setTicketId(1234);
		tInfo.setPnr("123456789");
		tInfo.setTicketStatus("Confirmed");

		return new ResponseEntity<>(tInfo, HttpStatus.CREATED);
	}

	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo request) {
		System.out.println(request);

		// logic to update ticket
		return new ResponseEntity<String>("Ticket Updated..", HttpStatus.OK);

	}

	@DeleteMapping("ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable Integer ticketId) {
		// logic to delete ticket
		return new ResponseEntity<String>("Ticket Deleted..", HttpStatus.OK);
	}

}

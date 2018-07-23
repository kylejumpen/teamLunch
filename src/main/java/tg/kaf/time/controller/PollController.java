package tg.kaf.time.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tg.kaf.time.model.Poll;
import tg.kaf.time.service.PollService;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/polls")
public class PollController {

	@Autowired
	private PollService pollService;

	@RequestMapping(method = POST)
	public void createPoll(Poll poll){
		pollService.createPoll(poll);
	}

	@RequestMapping(method = GET, value = "/{id}/cancel")
	public void cancelPoll(@RequestParam(value= "id") int id) throws Exception {
		pollService.cancelPoll(id);
	}

	@RequestMapping(method = GET, value = "/{id}")
	public Poll viewPoll(@RequestParam(value = "id") int id){
		return pollService.viewPoll(id).orElse(null);
	}
}

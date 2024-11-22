package com.api.rest_api.mycontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/pintrest")
public class MyController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String getHomePage() {
		return "Welcome to the Pinterest Home page! Explore your personalized feed.";
	}
	
	@RequestMapping(value="/explore", method=RequestMethod.POST)
	public String exploreContent() {
		return "Explore request received! Check out trending pins and ideas.";
	}
	
	@RequestMapping(value="/updates", method=RequestMethod.DELETE)
	public String deleteUpdates() {
		return "Updates removed successfully! Your profile is now up-to-date.";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.PUT)
	public String createContent() {
		return "New content created successfully! Start pinning now.";
	}
	
	@GetMapping("/all")
	public String fetchAll() {
		return "Fetching all available content! Discover amazing pins and boards.";
	}
	
	@PostMapping("/art")
	public String createPost() {
		return "Art post created successfully! Share your creativity with the community.";
	}
	
	@PutMapping("/bord")
	public String updateBoard() {
		return "Board updated successfully! Organize and customize your collections.";
	}
	
	@DeleteMapping("/pins")
	public String deletePins() {
		return "Pins deleted successfully! Your collection is now updated.";
	}
	
}

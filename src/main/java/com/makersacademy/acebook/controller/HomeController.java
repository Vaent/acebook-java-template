package com.makersacademy.acebook.controller;

import com.makersacademy.acebook.model.Post;
import com.makersacademy.acebook.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	private final PostRepository postRepository;

	@Autowired
	public HomeController(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/greeting")
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=true, defaultValue="pizza") String name,
						   @RequestParam(name="surname", required=true, defaultValue="cats") String surname,
						   Model model) {
		model.addAttribute("name", name);
		model.addAttribute("surname", surname);

		return "greeting";
	}

	@RequestMapping(value = "/getapost")
	@GetMapping("/getapost")
	public String getapost(Model model) {
		Post hardPost = new Post("This is a string");

		System.out.println(postRepository.findAll());
		for (Post post: postRepository.findAll()) {
			System.out.println(post);
		}
		System.out.println(postRepository.findById(1L));
		System.out.println(postRepository.findById(1L).get().getContent());

		model.addAttribute("hardPost", hardPost);
		model.addAttribute("postRepository", postRepository);

		return "getapost";
	}

}

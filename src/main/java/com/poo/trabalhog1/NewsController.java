package com.poo.trabalhog1;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

	@GetMapping("/")
	public String greeting(Model model) {
		Document doc;
		try {
			doc = Jsoup.connect("https://g1.globo.com").get();
			model.addAttribute("doc", doc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "news";
	}
}
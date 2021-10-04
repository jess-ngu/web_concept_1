package ca.sheridancollege.controllers;

import ca.sheridancollege.music.*;
import ca.sheridancollege.database.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class MusicController {

	@GetMapping("/") // localhost:8080
	public String musicHome() {
		return "musichome.html";
	}

	@GetMapping("/musicAdd") // localhost:8080/musicAdd
	public String musicAdd(Model model) {
		model.addAttribute("music", new Music());
		return "musicadd.html";
	}

	@GetMapping("/validateMusic") // localhost:8080/validateMusic
	public String validateMusic(Model model, @ModelAttribute Music music) {
		MusicList.musicList.add(music);
		model.addAttribute("music", new Music());
		return "redirect:/musicAdd";
	}

	@GetMapping("/displayMusic") // localhost:8080/displayMusic
	public String displayMusic(Model model) {
		model.addAttribute("songs", MusicList.musicList);
		return "musicdisplay.html";
	}
}

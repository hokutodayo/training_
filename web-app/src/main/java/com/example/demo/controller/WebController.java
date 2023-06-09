package com.example.demo.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ホームページに関するコントローラークラスです。
 */
@Controller
public class WebController {

	/**
	 * index画面を表示する。
	 * 
	 * @param model ビューに渡すモデルオブジェクト
	 * @return index画面のhtmlファイル名
	 */
	@GetMapping(value = "/")
	public String index(Model model) {

		model.addAttribute("message", "ようこそ");
		model.addAttribute("datetime", LocalDateTime.now());

		return "index";
	}

}

package com.javatpoint.controllers;

import com.javatpoint.beans.TeamManage;
import com.javatpoint.dao.TeamManageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class TeamManageController {
	
	@Autowired
	TeamManageDAO teamDAO;

	@RequestMapping("/teammanage")
	public ModelAndView showform() {
		return new ModelAndView("teammanage", "command", new TeamManage());
	}

	@RequestMapping(value = "/saveTeamManage", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("teammanage") TeamManage manage) {
		teamDAO.save(manage);
		return new ModelAndView("redirect:/viewTeam");
	}
	
	@RequestMapping("/viewTeam")
	public ModelAndView viewTeam() {
		List<TeamManage> list = teamDAO.getAllTeam();
		return new ModelAndView("viewTeam", "list", list);
	}

	@RequestMapping(value = "/editteam/{id}")
	public ModelAndView edit(@PathVariable int id) {
		TeamManage manage = teamDAO.getTeamByID(id);
		return new ModelAndView("editTeam", "command", manage);
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("team") TeamManage manage) {
		teamDAO.update(manage);
		return new ModelAndView("redirect:/viewTeam");
	}

	@RequestMapping(value = "/deleteteam/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id) {
		teamDAO.delete(id);
		return new ModelAndView("redirect:/viewTeam");
	}
}
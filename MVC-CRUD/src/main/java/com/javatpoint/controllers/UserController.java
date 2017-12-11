package com.javatpoint.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.javatpoint.beans.User;
import com.javatpoint.dao.UserDAO;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userDao;
	
	@RequestMapping("/themUser")
	public ModelAndView showform() {
		return new ModelAndView("themUser", "command", new User());
	}

	// luu du lieu
	@RequestMapping(value = "/luu", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("user") User user) {
		userDao.save(user);
		return new ModelAndView("redirect:/login");
	}

	 /*It provides list of employees in model object */
	@RequestMapping("/viewemp")
	public ModelAndView viewemp() {
		List<User> list = userDao.getAllUser();
		return new ModelAndView("viewemp", "list", list);
	}

	
/*	 * It displays object data into form for the given id. The @PathVariable puts
	 * URL data into variable.*/
	 
	@RequestMapping(value = "/editemp/{id}")
	public ModelAndView edit(@PathVariable int id) {
		User user = userDao.getUserByID(id);
		return new ModelAndView("empeditform", "command", user);
	}

	 /*It updates model object. */
	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public ModelAndView editsave(@ModelAttribute("emp") User emp) {
		userDao.update(emp);
		return new ModelAndView("redirect:/viewemp");
	}

	 /*It deletes record for the given id in URL and redirects to /viewemp */
	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable int id) {
		userDao.delete(id);
		return new ModelAndView("redirect:/viewemp");
	}
}
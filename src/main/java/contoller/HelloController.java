package contoller;

import dao.PersonDao;
import gen.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Aashis Khanal on 8/3/15.
 */
@Controller
public class HelloController {

    @Autowired
    PersonDao personDao;

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg", "I am Alive");
        return "hello";
    }

    @RequestMapping("/add")
    public String add(@ModelAttribute("person") PersonEntity person){
        return "add";
    }


    @RequestMapping("/persistPerson")
    public String persisitPerson(@ModelAttribute("person") PersonEntity personEntity, BindingResult result){
        personDao.save(personEntity);
        return "hello";
    }

    @RequestMapping("/all")
    public ModelAndView all(){
        ModelAndView model = new ModelAndView();
        model.addObject("persons", personDao.getAll());
        model.setViewName("all");
        return model;
    }

}

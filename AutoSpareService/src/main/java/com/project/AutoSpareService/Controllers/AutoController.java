package com.project.AutoSpareService.Controllers;

import com.project.AutoSpareService.Models.AutoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auto")
public class AutoController {


    private AutoDAO autoDAO;  //здесь мы внедряем сомпонент в контроллер

    public AutoController(AutoDAO autoDAO) {
        this.autoDAO = autoDAO;
    }

    @GetMapping
    public String viewAuto(Model model){
        //получаем весь список автомобилей и передаем на отображение предаствлению (html файлу)
        model.addAttribute("auto", autoDAO.auto());
        return "auto";
    }


    @GetMapping("/{id}")
    public String viewSpares(@PathVariable("id") int id, Model model){
        model.addAttribute("showAuto", autoDAO.showAuto(id));
        //аналогично со всем списком передаем один автомобиль
        return "spares";
    }
}

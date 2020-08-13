package she.edu.theatre.webController;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/performance")
public class webcontroller {



    /*  @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteCafedra(@PathVariable("id") String id, Model model){
        .delete(id);
        model.addAttribute("list",cafedraService.getAll());
        return "redirect:/web/cafedra/get/list";
    }
  */


}

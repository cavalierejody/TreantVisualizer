package it.jody.TreantVisualizer.controllers;

import it.jody.TreantVisualizer.services.FakeChartBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;



@Controller
public class HelloController {

    @Autowired
    FakeChartBuilder builder;

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("chart", builder.newFakeCHartJson());
        return "chart";
    }
}

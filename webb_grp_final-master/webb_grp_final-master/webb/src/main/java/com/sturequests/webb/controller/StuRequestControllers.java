package com.sturequests.webb.controller;

import com.sturequests.webb.dto.StuRequestDto;
import com.sturequests.webb.models.StuRequest;
import com.sturequests.webb.models.UserEntity;
import com.sturequests.webb.security.SecurityUtil;
import com.sturequests.webb.service.StuRequestService;
import com.sturequests.webb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StuRequestControllers {
    private StuRequestService stuRequestService;
    private UserService userService;
    @Autowired
    public StuRequestControllers(StuRequestService stuRequestService, UserService userService)
    {
        this.stuRequestService = stuRequestService;
        this.userService = userService;
    }

    @GetMapping("/requis/list")
    public String listRequis(Model model)
    {
        UserEntity user = new UserEntity();
        List<StuRequestDto> requis = stuRequestService.findAllRequests();
        String username = SecurityUtil.getSessionUser();
        if(username != null) {
            user = userService.findByUsername(username);
            model.addAttribute("user", user);
        }
        model.addAttribute("requis", requis);
        return "requis-list";
    }

    @GetMapping("/requis")
    public String createRequiForm(Model model)
    {
        StuRequest stuRequest = new StuRequest();
        model.addAttribute("stuRequest", stuRequest);
        return "requi-create";
    }

    @PostMapping("/requi/new")
    public String saveRequi(@ModelAttribute("stuRequest") StuRequestDto stuRequestDto){
        if(stuRequestDto.getRequestStatus() == null)
        {
            stuRequestDto.setRequestStatus("PENDING");
            stuRequestDto.setHodResponse("PENDING");
            stuRequestDto.setExamOfficerResponse("PENDING");
            stuRequestDto.setLecturerResponse("PENDING");
        }
        stuRequestService.saveRequest(stuRequestDto);
        return "redirect:/requis";
    }

}

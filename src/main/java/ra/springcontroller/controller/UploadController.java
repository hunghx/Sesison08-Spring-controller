package ra.springcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.Service;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    @Autowired
    private ServletContext servletContext;
    @GetMapping("/upload")
    public String upload(){
        return "upload";
    }

    @PostMapping("/upload")
    public String doUpload(@RequestParam MultipartFile file, Model model) throws IOException {
        // xử lí file
        String uploadPath = "C:\\Users\\AD\\Desktop\\spring-controller\\src\\main\\webapp\\uploads";
        File uploadFolder = new File(uploadPath);
        if (!uploadFolder.exists()){
            uploadFolder.mkdir(); // tạo mới thư mục trên server
        }
        String url = "/uploads/"+file.getOriginalFilename();
        if (file!=null && file.getSize()!=0){
            FileCopyUtils.copy(file.getBytes(),new File(uploadPath+File.separator+file.getOriginalFilename()));
        }
        model.addAttribute("url",url);
        return "upload";
    }
}

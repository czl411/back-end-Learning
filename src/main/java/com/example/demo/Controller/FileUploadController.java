package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws IOException{
        System.out.println(nickname);
//      获取图片原始名称
        System.out.println(photo.getOriginalFilename());
//      获取文件类型
        System.out.println(photo.getContentType());
//      web服务器的运行目录的文件存储位置
        String path = request.getServletContext().getRealPath("/upload/");
        System.out.println(path);
//      保存文件
        saveFile(photo,path);
        return "上传成功！";
    }

    public void saveFile(MultipartFile photo,String path) throws IOException{
        File dir = new File(path);
        if (!dir.exists()){
            System.out.println(111);
            dir.mkdir();
        }
        File file = new File(path+photo.getOriginalFilename());
        photo.transferTo(file);
    }
}

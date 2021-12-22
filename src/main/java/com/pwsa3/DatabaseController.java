/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pwsa3;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ASUS
 */
@Controller
public class DatabaseController {

    @RequestMapping("/datamahasiswa")
    @ResponseBody
    public List<Datamahasiswa> getAlatTulis() {

        List<Datamahasiswa> datamahasiswa = new ArrayList<>();

        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();

        try {
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e) {
        }

        return datamahasiswa;
    }

    @CrossOrigin
    @GetMapping(value = "xml/datamahasiswa", produces = {
        MediaType.APPLICATION_XML_VALUE
    }
    )
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswa() {

        List<Datamahasiswa> datamahasiswa = new ArrayList<>();

        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();

        try {
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e) {
        }

        return datamahasiswa;
    }

    @CrossOrigin
    @GetMapping(value = "json/datamahasiswa", produces = {
        MediaType.APPLICATION_JSON_VALUE
    }
    )
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswayey() {

        List<Datamahasiswa> datamahasiswa = new ArrayList<>();

        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();

        try {
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e) {
        }

        return datamahasiswa;
    }
}

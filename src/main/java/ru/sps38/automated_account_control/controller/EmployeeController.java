package ru.sps38.automated_account_control.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {

    @GetMapping(value = "/{creator}/{fio}/{post}/{location}/{phone}")
    public ResponseEntity<Void> createEmployee(@PathVariable String creator,
                                               @PathVariable String fio,
                                               @PathVariable String post,
                                               @PathVariable String location,
                                               @PathVariable String phone) {

        StringBuilder sb = new StringBuilder();
        sb.append(creator).append(" ").append(fio).append(" ").append(post).append(" ").append(location).append(" ").append(phone);
        System.out.println(sb);

        final URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand("1")
                .toUri();

        return ResponseEntity.created(uri).build();

    }
}

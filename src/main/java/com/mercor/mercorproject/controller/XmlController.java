package com.mercor.mercorproject.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mercor.mercorproject.domain.Customer;
import com.mercor.mercorproject.service.XmlService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("xml")
@RequiredArgsConstructor
public class XmlController {

    private final XmlService xmlService;

    @RequestMapping("decode")
    public Customer decodeCustomer() throws JsonProcessingException {
        return xmlService.decodeCustomer();
    }
}

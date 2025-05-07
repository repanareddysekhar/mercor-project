package com.mercor.mercorproject.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mercor.mercorproject.domain.Customer;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class XmlService {


    private String MOCK_CUSTOMER_XML = """
            <customer>
                <name>John Doe</name>
                <age>30</age>
                <email>john.doe@example.com</email>
            </customer>
            """;

    public Customer decodeCustomer() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(MOCK_CUSTOMER_XML, Customer.class);
    }
}

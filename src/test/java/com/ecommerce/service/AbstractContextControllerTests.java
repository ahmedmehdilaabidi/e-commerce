package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/appServlet/context-servlet.xml")
public class AbstractContextControllerTests {

	@Autowired
	protected WebApplicationContext wac;

}

package org.athenea.util;

import io.swagger.jaxrs.config.BeanConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


/**
 * Created by zulaika on 31/05/17.
 *
 * Bean class to initialize Swagger.
 */
public class Bootstrap extends HttpServlet {

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);

    BeanConfig beanConfig = new BeanConfig();
    beanConfig.setTitle("courses_organizations-microservice");
    beanConfig.setDescription("Courses API for Athenea project");
    beanConfig.setTermsOfServiceUrl("http://athenea-project.org/");
    beanConfig.setVersion("1.0.0");
    beanConfig.setContact("support@athenea.org");
    beanConfig.setSchemes(new String[]{"http"});
    // beanConfig.setHost("vps478091.ovh.net/courses-microservice");
    beanConfig.setHost("localhost:8091/courses_organizations-microservice");
    beanConfig.setBasePath("api");
    beanConfig.setResourcePackage("org.athenea.resource");
    beanConfig.setScan(true);
  }
}




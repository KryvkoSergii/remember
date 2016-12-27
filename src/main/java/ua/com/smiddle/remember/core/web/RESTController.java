package ua.com.smiddle.remember.core.web;

import org.springframework.web.bind.annotation.*;
import ua.com.smiddle.remember.core.model.*;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;


/**
 * @author ksa on 27.12.16.
 * @project remember
 */
@RestController
@RequestMapping("/rest-api")
public class RESTController {
    private volatile String value;

    @PostConstruct
    private void init() {
        value = "";
    }

    @CrossOrigin
    @RequestMapping(value = "/value", method = RequestMethod.POST,
            consumes = "application/json; charset=UTF-8",
            produces = "application/json; charset=UTF-8")
    public void setValue(@RequestBody Wrapper request, HttpServletResponse response) {
        System.out.println("RESTController: setValue: got=" + request);
        if (request == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        if (request.getValue() == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        value = request.getValue();
        System.out.println("RESTController: setValue: set value=" + request.getValue());
    }

    @CrossOrigin
    @RequestMapping(value = "/value", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public Object getValue(HttpServletResponse response) {
        return new Wrapper(value);
    }
}

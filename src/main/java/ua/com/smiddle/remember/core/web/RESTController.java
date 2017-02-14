package ua.com.smiddle.remember.core.web;

import org.springframework.web.bind.annotation.*;
import ua.com.smiddle.remember.core.model.*;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


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
    public void setValue(@RequestBody String request, HttpServletResponse response) {
        //System.out.println("RESTController: setValue: got=" + request);
        if (request == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        List<String> resultValue = new ArrayList<>();
        List<String> resultName = new ArrayList<>();

        String par = request.replace(" ", "").replace("{", "").replace("}", "");
        String[] params = par.split(",");
        for (String s : params) {
            String[] value = s.split(":");
            resultName.add(value[0]);
            resultValue.add(value[1]);
        }

        if (request == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        for (int i = 0; i < resultName.size(); i++) {
            if (i % 6 == 0) {
                System.out.println();
                System.out.println("-----------------------------------");
            }
            System.out.print(resultName.get(i) + ": " + resultValue.get(i) + ", ");
        }
        //System.out.println(request.toString());
        //System.out.println("RESTController: setValue: set value=");
    }

    @CrossOrigin
    @RequestMapping(value = "/value", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public Object getValue(HttpServletResponse response) {
        List<Wrapper> wrapperList = new ArrayList<>();
        wrapperList.add(new Wrapper(1234L, "2938", 3912L));
        wrapperList.add(new Wrapper(9876L, "9482", 8265L));
        wrapperList.add(new Wrapper(6574L, "6235", 2975L));
        return wrapperList;
    }
}

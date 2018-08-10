package sarah.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/demo")
@Api(value = "API - DemoController", description = "demo接口")
public class DemoController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
     @ApiOperation(value = "首页", notes = "demo index")
     @ApiImplicitParams({
             @ApiImplicitParam(name = "name", value = "name", required = false,
                     dataType = "string", paramType = "query", defaultValue = "World")
     })
     public String index(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
         return "demo " + name;
     }
}
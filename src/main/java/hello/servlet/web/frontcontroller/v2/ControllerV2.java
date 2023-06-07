package hello.servlet.web.frontcontroller.v2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.web.frontcontroller.Myview;

public interface ControllerV2 {

    Myview process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}

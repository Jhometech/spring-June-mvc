package in.javahome.springmvc.controller;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		return "error";
	}

	@ExceptionHandler(value = SQLException.class)
	public String handleSQLException(SQLException e) {
		return "sql";
	}
}

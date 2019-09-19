package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private double variableLoca = 0;

	@Override
	protected void doPost(HttpServletRequest request, //
			HttpServletResponse response) //
			throws ServletException, IOException {

		double arg1 = Double.parseDouble(request.getParameter("arg1"));
		double arg2 = Double.parseDouble(request.getParameter("arg2"));


		Calculator calculadora = new Calculator(arg1, arg2);
		double resultado = calculadora.sumar();

		request.setAttribute("resultado", resultado);

		request //
		.getRequestDispatcher("result.jsp").forward(request, response);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		double arg1 = Double.parseDouble(request.getParameter("arg1"));
		this.variableLoca++;
		Calculator calculadora = new Calculator(arg1, this.variableLoca);
		double resultado = calculadora.sumar();

		request.setAttribute("resultado", resultado);
		request //
		.getRequestDispatcher("index.jsp").forward(request, response);
	}

}

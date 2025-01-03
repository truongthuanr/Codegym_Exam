package com.codegym.realestatemanagement.controller;
import com.codegym.realestatemanagement.model.Customer;
import com.codegym.realestatemanagement.model.Product;
import com.codegym.realestatemanagement.model.SERVICETYPE;
import com.codegym.realestatemanagement.model.Transaction;
import com.codegym.realestatemanagement.service.ICustomerService;
import com.codegym.realestatemanagement.service.IProductService;
import com.codegym.realestatemanagement.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    ITransactionService transactionService;

    @Autowired
    ICustomerService customerService;

    @GetMapping("")
    public ModelAndView listProducts() {
        Iterable<Transaction> transactions = transactionService.findAll();
        ModelAndView modelAndView = new ModelAndView("/transaction/list");
        modelAndView.addObject("transactions", transactions);
        return modelAndView;
    }


    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/transaction/create");
        modelAndView.addObject("transaction", new Transaction());
        modelAndView.addObject("customers", customerService.findAll());

        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveProduct(@ModelAttribute("transaction") Transaction transaction) {
        transactionService.save(transaction);
        ModelAndView modelAndView = new ModelAndView("/transaction/create");
        modelAndView.addObject("transaction", new Transaction());
        modelAndView.addObject("customers", customerService.findAll());
        
        return modelAndView;
    }


}

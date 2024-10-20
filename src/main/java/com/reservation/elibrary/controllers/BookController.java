package com.reservation.elibrary.controllers;

import com.reservation.elibrary.proxy.books.Book;
import com.reservation.elibrary.proxy.books.BookWebServiceService;
import com.reservation.elibrary.proxy.books.Books;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    private Books ws = new BookWebServiceService().getBooksPort();

    @GetMapping("/all")
    public String allBooks(Model model) {
        List<Book> books = ws.getAllBooks();
        model.addAttribute("books", books);
        return "book/all";
    }

    @GetMapping("/add")
    public String add(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "book/add";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("book") Book book) {
        System.out.println("am here");
        ws.addBook(book);
        return "redirect:/book/all";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        ws.deleteBook(id);
        return "redirect:/book/all";
    }

    ;

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        Book book = ws.getBook(id);
        model.addAttribute("book", book);
        return "book/update";
    }

    @PostMapping("/update")
    public String update(@Validated Book book, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "redirect:/book/edit/" + book.getId();
        }
        ws.updateBook(book);
        return "redirect:/book/all";
    }
}

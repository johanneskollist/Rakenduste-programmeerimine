//package ee.alari.backend.controller;

//import ee.alari.backend.model.Item;
//import ee.alari.backend.service.CategoryService;
//import ee.alari.backend.service.ItemService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;

//import java.util.List;

//@RestController
//public class CategoryController {

//    @Autowired
//    CategoryService categoryService;
//    @GetMapping("items")
//    public List<Item> getItems(){
//        return categoryService.getItems();
//    }
    //    public String getItems(){
//        return "<h1>shit works: </h1><br><br>"+itemService.getItems();
//    }
//    @PostMapping("items")
//    public  String setItem(@RequestBody Item category){
//        categoryService.saveCategory(category);
//        return "Added item name: <strong>"+category.getCategory()+"</strong>";
//    }
//}

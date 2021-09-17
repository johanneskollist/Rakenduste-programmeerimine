package ee.joh.backend.controller;

import ee.joh.backend.model.Item;
import ee.joh.backend.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("items")
    public List<Item> getItems(){
        return itemService.getItems();
    }
//    public String getItems(){
//        return "<h1>shit works: </h1><br><br>"+itemService.getItems();
//    }
    @PostMapping("items")
    public  String setItem(@RequestBody Item item){
        itemService.saveItems(item);
        return "Lisatud ese: "+item.getName();
    }
}

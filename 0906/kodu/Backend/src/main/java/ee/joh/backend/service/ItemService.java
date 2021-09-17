package ee.joh.backend.service;


import ee.joh.backend.model.Item;
import ee.joh.backend.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getItems(){
        return itemRepository.findAll();
    }

    public void saveItems(Item item) {
        itemRepository.save(item);
    }
}

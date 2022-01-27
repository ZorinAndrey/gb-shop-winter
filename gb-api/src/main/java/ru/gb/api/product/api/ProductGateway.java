package ru.gb.api.product.api;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@FeignClient(url = "http://127.0.0.1/internal/api/v1/product", name = "CategoryGateway")
public class ProductGateway {

//    private final ProductService productService;
//
//    @GetMapping
//    public List<ProductDto> getProductList() {
//        return productService.findAll();
//    }
//
//    @GetMapping("/info")
//    public List<ProductManufacturerDto> getInfoProductList() {
//        return productService.findAllInfo();
//    }
//
//    @GetMapping("/{productId}")
//    public ResponseEntity<?> getProduct(@PathVariable("productId") Long id) {
//        ProductDto product;
//        if (id != null) {
//            product = productService.findById(id);
//            if (product != null) {
//                return new ResponseEntity<>(product, HttpStatus.OK);
//            }
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//
//    @PostMapping
//    public ResponseEntity<?> handlePost(@Validated @RequestBody ProductDto productDto) {
//        ProductDto savedProduct = productService.save(productDto);
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setLocation(URI.create("/api/v1/product/" + savedProduct.getId()));
//        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{productId}")
//    public ResponseEntity<?> handleUpdate(@PathVariable("productId") Long id, @Validated @RequestBody ProductDto productDto) {
//        productDto.setId(id);
//        productService.save(productDto);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @DeleteMapping("/{productId}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteById(@PathVariable("productId") Long id) {
//        productService.deleteById(id);
//    }
}

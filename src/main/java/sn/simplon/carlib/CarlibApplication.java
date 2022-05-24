package sn.simplon.carlib;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import sn.simplon.carlib.model.Category;
import sn.simplon.carlib.model.Comment;
import sn.simplon.carlib.model.Product;
import sn.simplon.carlib.service.CategoryService;
import sn.simplon.carlib.service.CommentService;
import sn.simplon.carlib.service.ProductService;

@SpringBootApplication
public class CarlibApplication implements CommandLineRunner {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private CommentService commentService;
	
	public static void main(String[] args) {
		SpringApplication.run(CarlibApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		
		Optional<Category> optCategory = categoryService.getCategoryById(1);
		Category categoryId1 = optCategory.get();
		
		Optional<Product> optProduct = productService.getProductById(1);
		Product productId1 = optProduct.get();
		
		System.out.println(categoryId1.getName());	
		
		categoryId1.getProducts().forEach(
				product -> System.out.println(product.getName()));
		
		System.out.println(" -------------------------------------------------- ");
		
		System.out.println(productId1.getName());
		
		productId1.getCategories().forEach(
				category -> System.out.println(category.getName()));
		
		
//		System.out.println(" --------------------------------------------------- ");
//		
//		Optional<Category> optCategory = categoryService.getCategoryById(1);
//		Category categoryId1 = optCategory.get();
//		System.out.println(categoryId1.getName());
//		
//		System.out.println(" --------------------------------------------------- ");
//		
//		Optional<Comment> optComment = commentService.getCommentById(1);
//		Comment commentId1 = optComment.get();
//		System.out.println(commentId1.getContent());
		
	}

}
